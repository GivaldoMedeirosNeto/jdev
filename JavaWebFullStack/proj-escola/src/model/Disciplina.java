package model;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	
	private double[] nota = new double[4];
	private String disciplina;
	
	/* Getters */
	public double[] getNota() {
		return nota;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	/* Setters */
	public void setNota(double[] nota) {
		this.nota = nota;
	}
		
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	/* ToString */
	@Override
	public String toString() {
		return "[disciplina = " + disciplina + ", nota = " + nota + "]";
	}
	
	public double getMediaNotas() {
		
		double soma = 0;
		for(int pos = 0; pos < nota.length; pos++) {
			soma += nota[pos];
		}
		
		return soma/nota.length;
		
	}	

}
