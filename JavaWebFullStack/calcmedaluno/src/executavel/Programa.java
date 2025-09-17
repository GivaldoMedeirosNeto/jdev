package executavel;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		int qtdDisc = 0;
		int remover;
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno: "));
		aluno.setnEscola(JOptionPane.showInputDialog("Nome da Escola: "));
		qtdDisc = Integer.valueOf(JOptionPane.showInputDialog("Quantas Disciplinas: "));
		
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
			
		} while ( remover ==0 );
		
		
		System.out.println("Aluno: " + aluno);
		System.out.println("Média do aluno: " + aluno.getMedia());
		// System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		System.out.println(aluno.getAprovadoString());
		
		System.out.println("***************************************");		

	}

}