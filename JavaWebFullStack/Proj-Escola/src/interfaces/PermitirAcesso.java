package interfaces;

/*Essa interface será o contrato de autenticação*/
public interface PermitirAcesso {
	
	/*Apenas a declaração do método*/
	//public boolean autenticar();
	public boolean autenticar(String login, String senha);

}