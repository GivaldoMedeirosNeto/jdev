package auxiliares;

import interfaces.PermitirAcesso;

public class FuncAutenticar {
	
	private PermitirAcesso acesso;
	
	public boolean autenticar() {
		return acesso.autenticar();
	}
	
	public FuncAutenticar(PermitirAcesso acesso) {
		this.acesso = acesso;
	}

}