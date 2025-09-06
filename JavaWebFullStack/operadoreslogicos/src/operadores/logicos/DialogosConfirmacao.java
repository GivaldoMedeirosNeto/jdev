package operadores.logicos;

import javax.swing.JOptionPane;

public class DialogosConfirmacao {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a qtd de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a qtd de pessoas");
		
		double qtdCarros = Double.parseDouble(carros);
		double qtdPessoas = Double.parseDouble(pessoas);
		
		int div = (int) (qtdCarros / qtdPessoas);
		int resto = (int) (qtdCarros % qtdPessoas);
		
		/* Retornos: Sim=0 Não=1 Cancel=2 */
		int retorno = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");		
		if(retorno == 0) {
			JOptionPane.showMessageDialog(null, "A divisão foi de: " + div);
		}
		
		retorno = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");		
		if(retorno == 0) {
			JOptionPane.showMessageDialog(null, "A resto foi de: " + resto);
		}
		
	}

}
