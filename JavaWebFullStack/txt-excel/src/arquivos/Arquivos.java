package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever = new FileWriter(arquivo);
		
		Pessoa p1 = new Pessoa("Penelope", "nega@gsmn.dev.br");
		Pessoa p2 = new Pessoa("Givaldo", "givaldoa@gsmn.dev.br");
		Pessoa p3 = new Pessoa("Mayara", "mayara@gsmn.dev.br");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		for (Pessoa p: pessoas) {
			escrever.write(p.getNome() + ";" + p.getEmail() + ":\n");
		}
		
		escrever.flush();
		escrever.close();
		
		
	}

}