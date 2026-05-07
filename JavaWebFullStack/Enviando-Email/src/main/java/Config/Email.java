package Config;

public class Email {
	
	private String user, pass, host, port, factory;
	
	public Email(){}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	@Override
	public String toString() {
		return "Email [user=" + user + ", pass=" + pass + ", host=" + host + ", port=" + port + ", factory=" + factory
				+ "]";
	}

}
