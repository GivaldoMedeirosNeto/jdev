package executavel;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		int qtdDisc= 0;
		int remover = 0;
		
		aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno:"));
		aluno.setnEscola(JOptionPane.showInputDialog("Qual o nome da Escola do " + aluno.getNome() + ":"));
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
		
		System.out.println(aluno);
		System.out.println("*********");
		/* Operador Ternário */
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");

	}

}