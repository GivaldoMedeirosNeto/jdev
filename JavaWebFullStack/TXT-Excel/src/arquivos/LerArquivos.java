package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivos {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream arquivo = new FileInputStream(
				new File("E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(arquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if(linha != null && !linha.isEmpty()) {
				
				System.out.println(linha);
				
				String[] dados = linha.split("\\;");
				Pessoa p = new Pessoa(dados[0], dados[1]);
				
				pessoas.add(p);
			}
		}
		
		System.out.println("\n");
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		lerArquivo.close();
		
	}

}
