package model;

public class Pessoa {
	
	protected String nome;
	private String dtNasc, rg, cpf, nMae, nPai;
	private int idade;
	
	/* Setters */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setnMae(String nMae) {
		this.nMae = nMae;
	}
	
	public void setnPai(String nPai) {
		this.nPai = nPai;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/* Getters */
	public String getNome() {
		return nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}

	public String getnMae() {
		return nMae;
	}

	public String getnPai() {
		return nPai;
	}

	public int getIdade() {
		return idade;
	}
	
	public boolean maiorIdade() {
		return idade >= 18;
	}

}
