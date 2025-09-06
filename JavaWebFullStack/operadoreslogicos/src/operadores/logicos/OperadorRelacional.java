package operadores.logicos;

public class OperadorRelacional {
	
	public static void main(String[] args) {
		System.out.println("Operador Relacional");
		
		int n1 = 90;
		int n2 = 80;
		
		if(n1 == n2) {
			System.out.println("Notas iguais");
		} else if(n1 != n2) {
			System.out.println("Notas diferentes");
		} else if(n1 < n2){
			System.out.println("A n1 é menor que a n2");
		} else if(n1 > n2){
			System.out.println("A n1 é maior que a n2");
		} else if(n1 <= n2){
			System.out.println("A n1 é menor ou igual que a n2");
		} else if(n1 >= n2){
			System.out.println("A n1 é maior ou igual que a n2");
		} else {
			System.out.println("sem parametro de comparação");
		}
		
	}

}
