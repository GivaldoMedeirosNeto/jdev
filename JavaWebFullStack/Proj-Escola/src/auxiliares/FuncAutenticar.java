package auxiliares;

import interfaces.PermitirAcesso;

public class FuncAutenticar {
	
private PermitirAcesso acesso;
	
	public boolean autenticar(String login, String senha) {
		return acesso.autenticar(login, senha);
	}
	
	public FuncAutenticar(PermitirAcesso acesso) {
		this.acesso = acesso;
	}

}
