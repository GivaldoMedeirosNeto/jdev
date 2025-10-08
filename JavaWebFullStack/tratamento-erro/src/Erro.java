import javax.swing.JOptionPane;

public class Erro {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = null;
		
		try {
			System.out.println(pessoa.getNome());
		} catch (Exception e) {
			
			StringBuilder msg = new StringBuilder();
			
			e.printStackTrace();
			System.out.println(e.getMessage());				
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				msg.append("\nMensagem do Erro: " + e.getClass().getName());
				msg.append("\nClasse do Erro: " + e.getStackTrace()[i].getClassName());
				msg.append("\nMétodo do Erro: " + e.getStackTrace()[i].getMethodName());
				msg.append("\nLinha  do Erro: " + e.getStackTrace()[i].getLineNumber());
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro no Sistema" + msg.toString());
			
		}
		
		
		
	}

}