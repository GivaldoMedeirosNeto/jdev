package operadores.logicos;

public class OperadorRepeticao {
	
	public static void main(String[] args) {
		System.out.println("Operadores de Repetição");
		
		int num = 0;
		
		/* Estrutura de Repetição While */
		while(num <= 2) {
			System.out.println("Numero: " + num);
			num++;
		}
		
		System.out.println("******");
		
		/* Estrutura de Repetição Do-While */
		do {
			System.out.println("Numero: " + num);
			num++;
		} while (num <= 10);
		
		System.out.println("******");
		
		/* Estrutura de Repetição FOR */
		for(int num1 = 0; num1 <= 10; num1++) {
			System.out.println("Numero é: " + num1);
		}
		
		System.out.println("******");
		
		/* Estrutura de Repetição FOR decrementando */
		for(int num1 = 10; num1 >= 0; num1--) {
			System.out.println("Numero é: " + num1);
		}
		
		System.out.println("******");
		
		/* Estrutura de Repetição com break */
		for(int num1 = 0; num1 <= 10; num1++) {
			if(num1 == 7) {
				System.out.println("Numero especial é: " + num1);
				break;
			}			
		}
		
		System.out.println("******");
		
		/* Estrutura de Repetição com Continue */
		for(int num1 = 0; num1 <= 10; num1++) {
			if(num1 == 4 || num1 == 8) {
				System.out.println("Numero especial é: " + num1);
				continue;
			}
			System.out.println("Verificando...");
		}
		
	}

}