package model;

public class Aluno extends Pessoa {
	
	private String dtMatric, nEscola, sMatric;
	
	/* Construtores */
	public Aluno() {}
	
	public Aluno(String nome) {
		super.nome = nome;
	}

	/* Getters */
	public void setDtMatric(String dtMatric) {
		this.dtMatric = dtMatric;
	}

	public void setnEscola(String nEscola) {
		this.nEscola = nEscola;
	}

	public void setsMatric(String sMatric) {
		this.sMatric = sMatric;
	}
	
	/* Setters */
	public String getDtMatric() {
		return dtMatric;
	}

	public String getnEscola() {
		return nEscola;
	}

	public String getsMatric() {
		return sMatric;
	}
	
	/* toString */
	@Override
	public String toString() {
		return "Aluno [dtMatric=" + dtMatric + ", nEscola=" + nEscola + ", sMatric=" + sMatric + ", getNome()="
				+ getNome() + ", getDtNasc()=" + getDtNasc() + ", getRg()=" + getRg() + ", getCpf()=" + getCpf()
				+ ", getnMae()=" + getnMae() + ", getnPai()=" + getnPai() + ", getIdade()=" + getIdade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Override
	public boolean maiorIdade() {
		return super.getIdade() >= 16;
	}
	
}
