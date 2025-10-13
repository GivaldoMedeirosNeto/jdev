package executavel;

public class ExecutavelMatriz {
	
	public static void main(String[] args) {
		
		int notas[][] = new int[3][3];
		
		notas[0][0] = 10;
		notas[0][1] = 20;
		notas[0][2] = 30;
		
		notas[1][0] = 40;
		notas[1][1] = 50;
		notas[1][2] = 60;
		
		notas[2][0] = 70;
		notas[2][1] = 80;
		notas[2][2] = 90;
		
		for(int i = 0; i < notas.length; i++) {
			
			for(int x = 0; x < notas.length; x++) {
				System.out.print(notas[i][x] + " ");
			}
			System.out.println();
		}
		
		for(int x = 0; x < notas.length; x++) {
			System.out.println("\n*--------------*");
			for(int y = 0; y < notas.length; y++ ) {
				System.out.print("| " + notas[x][y] + " ");
			}
			System.out.print("|");			
		}
		System.out.println("\n*--------------*");
		
	}

}
