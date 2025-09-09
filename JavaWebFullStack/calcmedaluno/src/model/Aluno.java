package model;

import java.util.Objects;

public class Aluno {
	
	private String nome, dtNasc, rg, cpf, nMae, nPai, dtMatric, nEscola, sMatric;
	private int idade;
	private double n1, n2, n3, n4;
	
	public Aluno () { }
	
	public Aluno (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getsMatric() {
		return sMatric;
	}

	public void setsMatric(String sMatric) {
		this.sMatric = sMatric;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	/* Método que retorna a média */
	public double getMedia() {
		return (n1 + n2 + n3 + n4)/4;
	}
	
	/* Método que retorna se está aprovado */
	public boolean getAprovado() {
		double media = this.getMedia();
		if(media >= 70) {
			return true;
		} else {
			return false;
		}		
	}
	
	public String getAprovadoString() {
		double media = this.getMedia();
		if(media >= 70) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
		
	}

	
	/* ToString */
	@Override
	public String toString() {
		return "Aluno [nome=" + getNome() + ", dtNasc=" + getDtNasc() + ", rg=" + getRg()
		+ ", cpf=" + getCpf() + ", nMae=" + getnMae() + ", nPai=" + getnPai()
		+ ", dtMatric=" + getDtMatric() + ", nEscola=" + getnEscola()
		+ ", sMatric=" + getsMatric() + ", idade=" + getIdade()
		+ ", n1=" + getN1() + ", n2=" + getN2() + ", n3=" + getN3() + ", n4=" + getN4() + "]";
	}

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
}
