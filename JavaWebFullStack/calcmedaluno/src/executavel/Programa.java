package executavel;

import javax.swing.JOptionPane;

import model.Aluno;

public class Programa {
	
	/* Programa Calc Média do Aluno */
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno: "));
		aluno.setnEscola(JOptionPane.showInputDialog("Nome da Escola: "));
			
		
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Escola: " + aluno.getnEscola());
		System.out.println("Média do aluno: " + aluno.getMedia());
		System.out.println(aluno.getAprovadoString());
		System.out.println(aluno.getAprovado() ? "Aprovado" : "Reprovado");
		
		System.out.println("***************************************");
		
		System.out.println(aluno);		
		
	}

}