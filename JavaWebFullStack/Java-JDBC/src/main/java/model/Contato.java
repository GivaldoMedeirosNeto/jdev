package model;

public class Contato {
	
	private int id, idUsuario;
	private String contato;
	
	public Contato() {}
	
	public Contato(String contato) {
		this.contato = contato;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", idUsuario=" + idUsuario + ", contato=" + contato + "]";
	}

}
