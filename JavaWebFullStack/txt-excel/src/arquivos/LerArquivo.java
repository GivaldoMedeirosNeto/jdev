package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream arquivo = new FileInputStream(
				new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(arquivo, "UTF-8");
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			System.out.println(linha);
		}
		
	}

}
