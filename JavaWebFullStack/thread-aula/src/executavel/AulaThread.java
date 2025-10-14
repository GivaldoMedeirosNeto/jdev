package executavel;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enviando todos em 1 segundo");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Enviando o email: " + i);			
		}
		
		/* Enviando a cada segundo */
		new Thread() {			
			public void run() {
				for(int i = 1; i <= 10; i++) {					
					try {
						Thread.sleep(1000);
						if(i == 1) {
							System.out.println("Transferindo " + retorno(i) + " o arquivo");
						} else {
							System.out.println("Transferindo " + retorno(i) + " os arquivos");
						}
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}					
				}
			}			
		}.start();
		
		Thread email = new Thread(thread1);
		email.start();
		
		JOptionPane.showMessageDialog(null, "Executando em segundo plano o envio.");
		
	}
	
	public static int retorno(int num) {
		int soma = 0;
		for(int x = 1; x <= num; x++) {
			soma += num;
		}		
		return soma;
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int i = 1; i <= 10; i++) {					
				try {
					Thread.sleep(2000);
					if(i == 1) {
						System.out.println("Enviando " + retorno(i) + " email");
					} else {
						System.out.println("Enviando " + retorno(i) + " emails");
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}					
			}			
			
		}
	};

}
