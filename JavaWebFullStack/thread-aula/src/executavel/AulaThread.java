package executavel;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enviando todos em 1 segundo");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Enviando o email: " + i);			
		}
		
		System.out.println("Enviando a cada segundo");
		for(int i = 1; i <= 10; i++) {
			
			Thread.sleep(1000);
			System.out.println("Enviando o email: " + i);
		}
		
		
	}

}
