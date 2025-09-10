package executavel;

import javax.swing.JOptionPane;

import model.Aluno;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno: "));
		aluno.setnEscola(JOptionPane.showInputDialog("Nome da Escola: "));
		
		aluno.getDisciplina().setDisc1(JOptionPane.showInputDialog("Infome a 1º Disciplina: "));
		aluno.getDisciplina().setN1(
				Integer.valueOf(
						JOptionPane.showInputDialog(
								"Qual foi a nota da disciplina " + aluno.getDisciplina().getDisc1())
				)
		);
		
		aluno.getDisciplina().setDisc2(JOptionPane.showInputDialog("Infome a 2º Disciplina: "));
		aluno.getDisciplina().setN2(
				Integer.valueOf(
						JOptionPane.showInputDialog(
								"Qual foi a nota da disciplina " + aluno.getDisciplina().getDisc2())
				)
		);
		
		aluno.getDisciplina().setDisc3(JOptionPane.showInputDialog("Infome a 3º Disciplina: "));
		aluno.getDisciplina().setN3(
				Integer.valueOf(
						JOptionPane.showInputDialog(
								"Qual foi a nota da disciplina " + aluno.getDisciplina().getDisc3())
				)
		);
		
		aluno.getDisciplina().setDisc4(JOptionPane.showInputDialog("Infome a 4º Disciplina: "));
		aluno.getDisciplina().setN4(
				Integer.valueOf(
						JOptionPane.showInputDialog(
								"Qual foi a nota da disciplina " + aluno.getDisciplina().getDisc4())
				)
		);
		
		
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Escola: " + aluno.getnEscola());
		System.out.println("Média do aluno: " + aluno.getMedia());
		System.out.println(aluno.getAprovadoString());
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		
		System.out.println("***************************************");
		
		System.out.println(aluno);		
		
	}

}