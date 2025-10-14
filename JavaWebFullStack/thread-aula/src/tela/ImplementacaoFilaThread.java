package tela;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedDeque<objFilaThread> pilha_filha = new ConcurrentLinkedDeque<objFilaThread>();
	
	public static void add(objFilaThread obj) {
		pilha_filha.add(obj);
	}
	
	@Override
	public void run() {
		
		
		System.out.println("teste");
		
		while(true) {
			Iterator iteracao = pilha_filha.iterator();
			synchronized(iteracao) {
				while (iteracao.hasNext()) {
					objFilaThread processar = (objFilaThread) iteracao.next();
					
					System.out.println("---------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					
					
					iteracao.remove();
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		
	}

}
