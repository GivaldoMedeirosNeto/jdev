package executavel;

import javax.swing.JOptionPane;

public class Executavel {
	
	public static void main(String[] args) {
		
		double[] notas = new double[4];
		
		System.out.println("Imprimindo a referencia: " + notas);
		
		notas[0] = 1.5;
		notas[1] = 5.5;
		notas[2] = 7.5;
		notas[3] = 9.5;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("*********************************");
		
		String qtd = JOptionPane.showInputDialog("Me informe um numero: ");		
		Integer[] array = new Integer[Integer.valueOf(qtd)];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i * 5;
			System.out.println(array[i]);
		}
		
		System.out.println("*********************************");
		
		String[] valores = {"Penelópe", "10", "Neginha", "Dengosa" };
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		System.out.println("*********************************");
		
		System.out.println("Descobrindo a maior e a menor numero");
		
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				max = array[i];
			} else {
				if(array[i] > max) {
					max = array[i];
				}
			}
		}
		
		int min = 0;
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				min = array[i];
			} else {
				if(array[i] < min) {
					min = array[i];
				}
			}
		}
		
		System.out.println("O maior numero encontrado foi : " + max);
		System.out.println("O menor numero encontrado foi : " + min);
		
	}

}
