package executavel;

public class ExecutavelStringMatriz {
	
	public static void main(String[] args) {
		
		String text = "Penelope, Nega-do-Pai, Carinhosa, Meiga";
		
		String[] valores= text.split(",");
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i].replaceAll(" ", ""));
		}
		
	}

}
