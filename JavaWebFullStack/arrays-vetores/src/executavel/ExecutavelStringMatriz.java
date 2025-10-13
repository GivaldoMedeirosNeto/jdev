package executavel;

import java.util.Arrays;
import java.util.List;

public class ExecutavelStringMatriz {
	
	public static void main(String[] args) {
		
		String text = "Penelope, Nega-do-Pai, Carinhosa, Meiga";
		
		String[] valores= text.split(",");
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i].replaceAll(" ", ""));
		}
		
		System.out.println();		
		
		/* Convertendo um Array em Lista */
		List<String> list = Arrays.asList(valores);
		
		for (String valor : list) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		/* Convertendo uma Lista em Array */
		String[] conversao = list.toArray(new String[list.size()]);
		
		for(int i = 0; i < conversao.length; i++) {
			System.out.println(conversao[i]);
		}
		
	}

}
