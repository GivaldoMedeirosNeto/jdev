package executavel;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Disciplina;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno: "));
		aluno.setnEscola(JOptionPane.showInputDialog("Nome da Escola: "));
		
		for(int pos = 1; pos <= 4; pos++) {
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(JOptionPane.showInputDialog("Qual Disciplina " + pos + " de 4: "));
			disciplina.setNota(
				Double.valueOf(
					JOptionPane.showInputDialog("Qual nota para disciplina " + disciplina.getDisciplina() + ":")
				)
			);
			aluno.getDisciplinas().add(disciplina);
			
		}
		
		System.out.println("Aluno: " + aluno);
		System.out.println("Média do aluno: " + aluno.getMedia());
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		
		System.out.println("***************************************");		
		
	}

}