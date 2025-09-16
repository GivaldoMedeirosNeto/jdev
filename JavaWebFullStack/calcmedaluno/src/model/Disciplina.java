package model;

import java.util.Objects;

public class Disciplina {
	
	private double nota;
	private String disciplina;
	
	/* Getters */
	public double getNota() {
		return nota;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	/* Setters */
	public void setNota(double nota) {
		this.nota = nota;
	}
		
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	/* Equals e Hashcode */
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
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
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	/* ToString */
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}
		
}
