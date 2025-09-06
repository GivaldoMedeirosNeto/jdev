package operadores.logicos;

import javax.swing.JOptionPane;

public class ProgramaCalculoMedia {
	
	public static void main(String[] args) {
		
		double media = 0;
		
		String n1 = JOptionPane.showInputDialog("Informe a 1º Nota");
		media = media + Double.parseDouble(n1);
		
		String n2 = JOptionPane.showInputDialog("Informe a 2º Nota");
		media = media + Double.parseDouble(n2);
		
		String n3 = JOptionPane.showInputDialog("Informe a 3º Nota");
		media = media + Double.parseDouble(n3);
		
		String n4 = JOptionPane.showInputDialog("Informe a 4º Nota");
		media = media + Double.parseDouble(n4);
		
		media = media/4;
		
		JOptionPane.showMessageDialog(null, "A média foi de: " + media);
		
		if(media >= 70) {			
			if(media >= 95) {
				JOptionPane.showMessageDialog(null, "O Aluno foi aprovado com a média alta.");
			} else {
				JOptionPane.showMessageDialog(null, "O Aluno foi aprovado.");
			}
		} else if(media <=69 && media >= 50) {
			JOptionPane.showMessageDialog(null, "O Aluno está em recuperação.");
		} else {
			JOptionPane.showMessageDialog(null, "O Aluno foi reprovado.");
		}
				
	}

}
