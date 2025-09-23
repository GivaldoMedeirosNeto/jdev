package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		List<Aluno> listAlunos = new ArrayList<Aluno>();
		int qtdDisc = 0;
		int qtdAluno = 1;
		int remover;
		
		do {
			
			String entrada = JOptionPane.showInputDialog("Quantos alunos deseja inserir? ");
			
			if(entrada != null && entrada.matches("\\d+")) {
				qtdAluno = Integer.parseInt(entrada);
			}
			
			if(entrada == null) {
				JOptionPane.showMessageDialog(null, "Será adicionando somente 1 aluno.");
			} else {
				JOptionPane.showMessageDialog(null, "Será adicionando " + qtdAluno + " aluno(s).");
			}
			
		} while(qtdAluno < 1);
		
		
		for(int qtd = 1; qtd <= qtdAluno; qtd++) {
			
			Aluno aluno = new Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do " + qtd + " aluno:"));
			aluno.setnEscola(JOptionPane.showInputDialog("Qual o nome da Escola " + qtd + " aluno:"));
			qtdDisc = Integer.valueOf(
				JOptionPane.showInputDialog("Quantas Disciplinas para o aluno " + aluno.getNome() +":")
			);
			
			for(int pos = 1; pos <= qtdDisc; pos++) {
				
				Disciplina disciplina = new Disciplina();
				
				disciplina.setDisciplina(
					JOptionPane.showInputDialog("Qual o nome da Disciplina " + pos + " de " + qtdDisc +": ")
				);
				
				disciplina.setNota(
					Double.valueOf(
						JOptionPane.showInputDialog("Qual nota para disciplina " + disciplina.getDisciplina() + ":")
					)
				);
				
				aluno.getDisciplinas().add(disciplina);
				
			}
			
			do {
				
				StringBuilder listaFormatada = new StringBuilder();
				for (int i = 0; i < aluno.getDisciplinas().size(); i++) {
				    listaFormatada.append(i + " - " + aluno.getDisciplinas().get(i) + "\n");
				}
				
				remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				if(remover == 0) {
					
					String discRemovida = JOptionPane.showInputDialog("Qual Disciplina?\n" + listaFormatada);
					if(discRemovida != null) {
						int index = Integer.valueOf(discRemovida);
						aluno.getDisciplinas().remove(index);
					}
					
				}
				
			} while ( remover == 0 );
			
			listAlunos.add(aluno);
			
		}
		
		/* Operador Ternário
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		*/
		
		System.out.println("***************************************");
		
		/* Pesquisa Aluno */
		for (Aluno aluno : listAlunos) {
			if(aluno.getNome().equalsIgnoreCase("penelope")) {
				JOptionPane.showMessageDialog(null, "A gata mais linda do pai.");
			}
			break;
		}
		
		/* Removendo Aluno */
		for (Aluno aluno : listAlunos) {
			if(aluno.getNome().equalsIgnoreCase("teste")) {
				listAlunos.remove(aluno);
				JOptionPane.showMessageDialog(null, "O aluno teste foi removido");
			}			
		}
		
		for (Aluno aluno : listAlunos) {
			System.out.println("Aluno: " + aluno);
			System.out.println("Média do aluno: " + aluno.getMedia());
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina() + " - " + disciplina.getNota());
			}
			System.out.println(aluno.getAprovadoString());
			System.out.println("- - - - - - - - - - - - - - - - - - - ");
		}
		
		System.out.println("***************************************");

	}

}