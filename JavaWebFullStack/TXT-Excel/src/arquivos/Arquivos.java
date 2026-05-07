package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivo.txt");
		
		/*Se não existir, irá criar*/
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		/*Escreve no arquivo*/
		FileWriter escrever = new FileWriter(arquivo);
		
		Pessoa p1 = new Pessoa("Penelope", "nega@gsmn.dev.br");
		Pessoa p2 = new Pessoa("Givaldo", "givaldoa@gsmn.dev.br");
		Pessoa p3 = new Pessoa("Pessoa1", "pessoa1@gsmn.dev.br");
		Pessoa p4 = new Pessoa("Pessoa2", "pessoa2@gsmn.dev.br");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		for (Pessoa p: pessoas) {
			escrever.write(p.getNome() + ";" + p.getEmail() + "\n");
		}
		
		escrever.flush();
		escrever.close();
		
	}

}
