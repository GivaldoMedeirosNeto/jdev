package model;

import java.util.Objects;

public class Pessoa {
	
	private String nome, cpf;
	
	/* Construtores */
	public Pessoa (){}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	/* Getters */
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	/* Setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/* ToString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

}