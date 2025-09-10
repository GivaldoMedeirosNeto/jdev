package model;

import java.util.Objects;

public class Disciplina {
	
	private double n1, n2, n3, n4;
	private String disc1, disc2, disc3, disc4;
	
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
	
	public String getDisc1() {
		return disc1;
	}

	public void setDisc1(String disc1) {
		this.disc1 = disc1;
	}

	public String getDisc2() {
		return disc2;
	}

	public void setDisc2(String disc2) {
		this.disc2 = disc2;
	}

	public String getDisc3() {
		return disc3;
	}

	public void setDisc3(String disc3) {
		this.disc3 = disc3;
	}

	public String getDisc4() {
		return disc4;
	}

	public void setDisc4(String disc4) {
		this.disc4 = disc4;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disc1, disc2, disc3, disc4, n1, n2, n3, n4);
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
		return Objects.equals(disc1, other.disc1) && Objects.equals(disc2, other.disc2)
				&& Objects.equals(disc3, other.disc3) && Objects.equals(disc4, other.disc4)
				&& Double.doubleToLongBits(n1) == Double.doubleToLongBits(other.n1)
				&& Double.doubleToLongBits(n2) == Double.doubleToLongBits(other.n2)
				&& Double.doubleToLongBits(n3) == Double.doubleToLongBits(other.n3)
				&& Double.doubleToLongBits(n4) == Double.doubleToLongBits(other.n4);
	}

	@Override
	public String toString() {
		return "Disciplina [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", disc1=" + disc1 + ", disc2="
				+ disc2 + ", disc3=" + disc3 + ", disc4=" + disc4 + "]";
	}
	
	
}
