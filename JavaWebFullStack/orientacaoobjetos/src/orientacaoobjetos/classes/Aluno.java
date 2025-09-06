package orientacaoobjetos.classes;

public class Aluno {
	
	/*
	 * private -> Privado, sendo acessivel somente dentro do proprio objeto
	 * public  -> Publico
	 */
	
	/* Atributos do aluno */
	public String nome;
	public int idade;
	private String dtNasc;
	private String rg;
	private String cpf;
	private String nMae;
	private String nPai;
	private String dtMatric;
	private String nEscola;
	private String serieMatric;
	
	/*Construtor Padrão*/
	public Aluno() {
		
	}
	
	/*Construtor Personalizado*/
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	/*Construtor Personalizado*/
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	/*Construtor Personalizado*/
	public Aluno(String nMae, String nPai) {
		this.nMae = nMae;
		this.nPai = nPai;
	}

}
