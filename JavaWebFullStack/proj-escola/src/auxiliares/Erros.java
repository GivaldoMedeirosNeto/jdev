package auxiliares;

import javax.swing.JOptionPane;

public class Erros extends Exception {
	
	public Erros(String erro) {
		super("Erro inesperado!\n" + erro);
	}
	
	public Erros(Exception e) {
		StringBuilder msg = new StringBuilder();
		
		e.printStackTrace();
		for(int i = 0; i < e.getStackTrace().length; i++) {
			msg.append("\nErro: " + e.getMessage());
			msg.append("\nMensagem do Erro: " + e.getClass().getName());
			msg.append("\nClasse do Erro: " + e.getStackTrace()[i].getClassName());
			msg.append("\nMétodo do Erro: " + e.getStackTrace()[i].getMethodName());
			msg.append("\nLinha  do Erro: " + e.getStackTrace()[i].getLineNumber());				
			msg.append("\n");
			
		}
		
		JOptionPane.showMessageDialog(null, "Erro no Sistema" + msg.toString());
	}

}