package executavel;

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
		
		
	}

}
