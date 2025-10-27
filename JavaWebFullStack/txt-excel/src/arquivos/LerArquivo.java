package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream arquivo = new FileInputStream(
				new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(arquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if(linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");
				Pessoa p = new Pessoa(dados[0], dados[1]);
				pessoas.add(p);
			}
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		lerArquivo.close();
		
	}

}
