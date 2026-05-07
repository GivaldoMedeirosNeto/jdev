package model;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String nome, email, obs, login, pass;
	
	public Usuario() { }
	
	public Usuario(String login, String pass) {
		this.login = login;
		this.pass = pass;
	}
	
	public Usuario(int idUsuario, String nome, String email, String obs, String login, String pass) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.obs = obs;
		this.login = login;
		this.pass = pass;
	}
	
	public Usuario(String nome, String email, String obs, String login, String pass) {
		this.nome = nome;
		this.email = email;
		this.obs = obs;
		this.login = login;
		this.pass = pass;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", obs=" + obs + ", login="
				+ login + ", pass=" + pass + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idUsuario, login, nome, obs, pass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && idUsuario == other.idUsuario && Objects.equals(login, other.login)
				&& Objects.equals(nome, other.nome) && Objects.equals(obs, other.obs)
				&& Objects.equals(pass, other.pass);
	}
	
	public boolean isNew(String id) {
		
		if(id.isEmpty()) {
			return true;
		} else if (id.equalsIgnoreCase("0")) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
