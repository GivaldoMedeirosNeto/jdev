package model;

public class Secretatio extends Pessoa {
	
	private String registro, nivelCargo, experiencia;

	/* Construtores */
	public Secretatio() { }
	
	public Secretatio(String nome) {
		super.nome = nome;
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

	/* toString */
	@Override
	public String toString() {
		return "Secretatio [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", getNome()=" + getNome() + ", getDtNasc()=" + getDtNasc() + ", getRg()=" + getRg() + ", getCpf()="
				+ getCpf() + ", getnMae()=" + getnMae() + ", getnPai()=" + getnPai() + ", getIdade()=" + getIdade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
		
}
