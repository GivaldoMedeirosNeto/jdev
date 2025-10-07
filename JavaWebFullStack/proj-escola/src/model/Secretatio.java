package model;

import interfaces.PermitirAcesso;

public class Secretatio extends Pessoa implements PermitirAcesso {
	
	private String registro, nivelCargo, experiencia;
	private String login, senha;

	/* Construtores */
	public Secretatio() { }
	
	public Secretatio(String nome) {
		super.nome = nome;
	}
	
	public Secretatio(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	/* Setters */
	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/* Getters */
	public String getRegistro() {
		return registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}

	/* toString */
	@Override
	public String toString() {
		return "Secretatio [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", getNome()=" + getNome() + ", getDtNasc()=" + getDtNasc() + ", getRg()=" + getRg() + ", getCpf()="
				+ getCpf() + ", getnMae()=" + getnMae() + ", getnPai()=" + getnPai() + ", getIdade()=" + getIdade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public double salario() {
		return 2200;
	}

	/* Interfaces */
	@Override
	public boolean autenticar() {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	
	@Override
	public boolean autenticar(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
		
}
