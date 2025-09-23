package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		List<Aluno> LisAlunos = new ArrayList<Aluno>();
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
			
			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do Aluno: "));
			aluno.setnEscola(JOptionPane.showInputDialog("Qual o nome da Escola: "));
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
			
			LisAlunos.add(aluno);
			
		}
		
		System.out.println("***************************************");
		
		for (Aluno aluno : LisAlunos) {
			System.out.println("Aluno: " + aluno);
			System.out.println("Média do aluno: " + aluno.getMedia());
			System.out.println(aluno.getAprovadoString());
		}
		
		System.out.println("***************************************");
		
		/* Operador Ternário
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		*/	

	}

}