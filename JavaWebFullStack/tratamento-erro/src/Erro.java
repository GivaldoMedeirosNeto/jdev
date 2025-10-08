import javax.swing.JOptionPane;

public class Erro {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = null;
		
		
		try {
			pessoa.setIdade(Integer.valueOf("teste"));
			System.out.println(pessoa.getNome());
		} catch (NullPointerException e) {
			
			StringBuilder msg = new StringBuilder();
			
			e.printStackTrace();
			System.out.println(e.getMessage());				
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				msg.append("\nErro: " + e.getMessage());
				msg.append("\nMensagem do Erro: " + e.getClass().getName());
				msg.append("\nClasse do Erro: " + e.getStackTrace()[i].getClassName());
				msg.append("\nMétodo do Erro: " + e.getStackTrace()[i].getMethodName());
				msg.append("\nLinha  do Erro: " + e.getStackTrace()[i].getLineNumber());				
				msg.append("\n");
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro no Sistema" + msg.toString());
			
		}  catch (NumberFormatException e) {
			
			StringBuilder msg = new StringBuilder();
			
			e.printStackTrace();
			System.out.println(e.getMessage());				
			
			for(int i = 0; i < e.getStackTrace().length; i++) {
				msg.append("\nErro: " + e.getMessage());
				msg.append("\nMensagem do Erro: " + e.getClass().getName());
				msg.append("\nClasse do Erro: " + e.getStackTrace()[i].getClassName());
				msg.append("\nMétodo do Erro: " + e.getStackTrace()[i].getMethodName());
				msg.append("\nLinha  do Erro: " + e.getStackTrace()[i].getLineNumber());				
				msg.append("\n");
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro no Sistema" + msg.toString());
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("Estou executando independente se houve ou não um erro no sistema.!");
			JOptionPane.showMessageDialog(null, "Obrigado,\nvolte sempre");
		}
		
		
		
	}

}