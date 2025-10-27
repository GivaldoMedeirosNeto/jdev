package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever = new FileWriter(arquivo);
		
		escrever.write("meu texto no arquivo");		
		escrever.write("\n");
		escrever.write("Escrevendo na segunda linha com arquivo já criado\n");
		
		for (int i  = 1;i <= 10; i++ ) {
			escrever.write("Texto da linha " + i + "\n");
		}
		
		escrever.flush();
		escrever.close();
		
		
	}

}