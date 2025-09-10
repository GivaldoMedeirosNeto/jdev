package model;

import java.util.Objects;

public class Aluno {
	
	private String nome, dtNasc, rg, cpf, nMae, nPai, dtMatric, nEscola, sMatric;
	private int idade;
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
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


	/* Método que retorna a média */
	public double getMedia() {
		return (disciplina.getN1() + disciplina.getN2()
				+ disciplina.getN3() + disciplina.getN4())/4;
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
	

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", dtNasc=" + dtNasc + ", rg=" + rg + ", cpf=" + cpf + ", nMae=" + nMae
				+ ", nPai=" + nPai + ", dtMatric=" + dtMatric + ", nEscola=" + nEscola + ", sMatric=" + sMatric
				+ ", idade=" + idade + ", disciplina=" + disciplina + "]";
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
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}
	
}
