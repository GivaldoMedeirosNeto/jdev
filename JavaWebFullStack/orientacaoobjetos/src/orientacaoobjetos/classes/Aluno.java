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
	public Aluno() { }
	
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

	
	/* SET -> Adicionar ou recebe os dados para o atributo */
	/* GET -> Resgatar ou obter os dados para o atributo */
	
	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getIdade() {
		return idade;
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public String getDtNasc() {
		return dtNasc;
	}
	

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	

	public String getRg() {
		return rg;
	}
	

	public void setRg(String rg) {
		this.rg = rg;
	}
	

	public String getCpf() {
		return cpf;
	}
	

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String getnMae() {
		return nMae;
	}
	

	public void setnMae(String nMae) {
		this.nMae = nMae;
	}
	

	public String getnPai() {
		return nPai;
	}
	

	public void setnPai(String nPai) {
		this.nPai = nPai;
	}
	

	public String getDtMatric() {
		return dtMatric;
	}
	

	public void setDtMatric(String dtMatric) {
		this.dtMatric = dtMatric;
	}
	

	public String getnEscola() {
		return nEscola;
	}
	

	public void setnEscola(String nEscola) {
		this.nEscola = nEscola;
	}
	

	public String getSerieMatric() {
		return serieMatric;
	}
	

	public void setSerieMatric(String serieMatric) {
		this.serieMatric = serieMatric;
	}
	
}
