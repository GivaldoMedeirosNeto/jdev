package executavel;

import model.Aluno;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		
		/* Diferencia e Comparar objetos */
		Aluno aluno = new Aluno("Givaldo");
		Aluno aluno2 = new Aluno("Givaldo");
		
		if(aluno2.equals(aluno)) {
			System.out.println("Alunos iguais");
		} else {
			System.out.println("Alunos diferentes");
		}
		
	}

}