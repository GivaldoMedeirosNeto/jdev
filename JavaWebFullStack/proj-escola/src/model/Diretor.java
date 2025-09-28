package model;

public class Diretor extends Pessoa {
	
	private String rgEducacao, tempoDirecao, Titulacao;

	/* Construtores */
	public Diretor() {}
	
	public Diretor(String nome) {
		super.nome = nome;
	}
	
	/* Setters */
	public void setRgEducacao(String rgEducacao) {
		this.rgEducacao = rgEducacao;
	}

	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}

	/* Getters */
	public String getRgEducacao() {
		return rgEducacao;
	}

	public String getTempoDirecao() {
		return tempoDirecao;
	}

	public String getTitulacao() {
		return Titulacao;
	}

	/* toString */
	@Override
	public String toString() {
		return "Diretor [rgEducacao=" + rgEducacao + ", tempoDirecao=" + tempoDirecao + ", Titulacao=" + Titulacao
				+ ", getNome()=" + getNome() + ", getDtNasc()=" + getDtNasc() + ", getRg()=" + getRg() + ", getCpf()="
				+ getCpf() + ", getnMae()=" + getnMae() + ", getnPai()=" + getnPai() + ", getIdade()=" + getIdade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public double salario() {
		return 3900;
	}	

}
