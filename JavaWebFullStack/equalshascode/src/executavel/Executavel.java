package executavel;

import model.Pessoa;

public class Executavel {
	
	public static void main(String[] args) {
		
		/* Diferenciando e Comparar Objetos */
		Pessoa p1 = new Pessoa("Penelope");
		Pessoa p2 = new Pessoa("Penelope");
		
		if(p1.equals(p2)) {
			System.out.println("Pessoas Iguais");
		}
		
		System.out.println("*******************");
		
		p1.setCpf("1");
		p2.setCpf("2");
		
		if(p1.equals(p2)) {
			System.out.println("Pessoas Iguais");
		} else {
			System.out.println("Pessoas Diferentes");
		}
		
	}

}