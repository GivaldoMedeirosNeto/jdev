package orientacaoobjetos.executavel;

import orientacaoobjetos.classes.Aluno;

public class Executavel {
	
	public static void main(String[] args) {
		
		/* 
		 * Aluno       -> Objeto
		 * aluno       -> Referencia ao Objeto
		 * new Aluno() -> Instancia, a criação do objeto
		 * 
		 */
		
		/* Instancia padrão */
		Aluno aluno = new Aluno();
		aluno.nome = "Joao";
				
		/* Instancia com 1 Atributo */
		Aluno alex = new Aluno("Alex");
		
		/* Instancia com 2 Atributos */
		Aluno givaldo = new Aluno("Givaldo", 40);
		
		/* Instancia com 2 Atributos privado*/
		Aluno aluno1 = new Aluno("SemNome", "SemNome");
		
		
	}

}
