package model;

import java.io.Serializable;

public class ModelLogin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String user, password;
	
	public ModelLogin(String user, String password) {
		this.user = user;
		this.password= password;
	}

	public String getLogin() {
		return user;
	}

	public void setLogin(String login) {
		this.user = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
