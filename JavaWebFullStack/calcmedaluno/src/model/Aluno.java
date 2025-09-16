package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	
	private String nome, dtNasc, rg, cpf, nMae, nPai, dtMatric, nEscola, sMatric;
	private int idade;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
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

	public String getDtMatric() {
		return dtMatric;
	}

	public String getnEscola() {
		return nEscola;
	}

	public String getsMatric() {
		return sMatric;
	}

	public int getIdade() {
		return idade;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

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

	public void setDtMatric(String dtMatric) {
		this.dtMatric = dtMatric;
	}

	public void setnEscola(String nEscola) {
		this.nEscola = nEscola;
	}

	public void setsMatric(String sMatric) {
		this.sMatric = sMatric;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	/* Construtores */
	public Aluno () { }	

	public Aluno (String nome) {
		this.nome = nome;
	}

	/* Métodos */
	/* Método que retorna a média */
	public double getMedia() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas/disciplinas.size();
		
	}
	
	/* Método que retorna se está aprovado boleano */
	public boolean getAprovado() {
		double media = this.getMedia();
		if(media >= 70) {
			return true;
		} else {
			return false;
		}		
	}
	
	/* Método que retorna se está aprovado String */
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
		return "Aluno [nome=" + nome + ", dtNasc=" + dtNasc + ", rg=" + rg + ", cpf=" + cpf + ", nMae=" + nMae
				+ ", nPai=" + nPai + ", dtMatric=" + dtMatric + ", nEscola=" + nEscola + ", sMatric=" + sMatric
				+ ", idade=" + idade + "]";
	}

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
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
