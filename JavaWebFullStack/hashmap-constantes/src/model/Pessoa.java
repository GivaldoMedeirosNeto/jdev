package model;

import java.util.Objects;

import constante.FaixaEtaria;

public class Pessoa {
	
	private String nome, cpf;
	private int idade;
	
	/* Construtores */
	public Pessoa (){}
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	/* Getters */
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	/* Setters */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/* ToString */
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(cpf, idade, nome);
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
		return Objects.equals(cpf, other.cpf) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	/* Metodos */
	public String getFaixaEtaria(int idade) {
		
		if(idade <= 13) {
			return FaixaEtaria.CRIANCA;
		} else if (idade > 13 && idade < 18) {
			return FaixaEtaria.ADOLESCENTE;
		} else if (idade >= 18 && idade < 65) {
			return FaixaEtaria.ADULTO;
		} else {
			return FaixaEtaria.VIDIDO;
		}
		
	}

}