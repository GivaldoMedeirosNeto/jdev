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
		alex.setCpf("12345678910");		
		System.out.println(alex.getNome());
		
		/* Instancia com 2 Atributos */
		Aluno givaldo = new Aluno("Givaldo", 40);
		givaldo.setCpf("05510183489");
		System.out.println(givaldo.getIdade());
		
		/* Instancia com 2 Atributos privado*/
		Aluno aluno1 = new Aluno("SemNome", "SemNome");
		aluno1.setCpf("01234567890");
		System.out.println(aluno1.getCpf());
		
	}

}
