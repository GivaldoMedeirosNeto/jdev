package operadores.logicos;

import javax.swing.JOptionPane;

public class OperadorMatematico {
	
	public static void main(String[] args) {
		System.out.println("Operador Matematico MOD");
		
		/* Operador MOD */
		
		int carro = 9;
		int pessoa = 2;
		int resto = carro % pessoa;
		
		System.out.println(resto);
		
		System.out.println("***********************************");
		
		/* Entrada de Dados */
		
		String carros =JOptionPane.showInputDialog("Informe a qdt de Carros");
		String pessoas =JOptionPane.showInputDialog("Informe a qdt de Pessoas");
		
		/* Convertendo String para Int */
		int qtdCarros = Integer.parseInt(carros);
		int qtdPessoas = Integer.parseInt(pessoas);
		
		int div = qtdCarros/qtdPessoas;
		int rest = qtdCarros%qtdPessoas;
		
		JOptionPane.showMessageDialog(null, "A divisão foi de :" + div + " o resto ficou de " + rest);
		
	}

}
