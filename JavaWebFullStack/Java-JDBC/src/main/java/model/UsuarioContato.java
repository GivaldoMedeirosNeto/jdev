package model;

import java.util.Objects;

public class UsuarioContato {
	
	private String nome, email, contato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "UsuarioContato [nome=" + nome + ", email=" + email + ", contato=" + contato + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contato, email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioContato other = (UsuarioContato) obj;
		return Objects.equals(contato, other.contato) && Objects.equals(email, other.email)
				&& Objects.equals(nome, other.nome);
	}

}
