package operadores.logicos;

public class Operadores {
	
	public static void main(String[] args) {
		
		int nota1 = 99;
		int nota2 = 98;
		int nota3 = 97;
		int nota4 = 96;
		int media;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/* Operador Logico If e Else */
		if(media >= 70) {
			System.out.println("Parabéns você foi Aprovado");
		} else if(media < 70 && media >= 50) {
			System.out.println("Você está de Recuperação");
		} else {
			System.out.println("Você foi Reporvado!");
		}		
		
		System.out.println("**********************************");
		
		/* Operador Ternario = condição ? Verdadeiro : falso */
		String resultado = media >= 90 ? "Aluno você esta de parabens com seu desempenho" : "";
		
		System.out.println(resultado);
		
		System.out.println("**********************************");
		
		/* Operadores Aninhadas */
		
		if(media >= 50) {
			if(media >= 70) {
				System.out.println("Aluno Aprovado.");
				if(media >=95) {
					System.out.println("Aluno Aprovado com media acima de 95.");
				}
			} else {
				System.out.println("Aluno em Recuperação.");
			}
		} else {
			System.out.println("Aluno Reprovado.");
		}
		
		System.out.println("**********************************");
			
	}

}