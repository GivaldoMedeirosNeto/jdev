package apache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import arquivos.Pessoa;

public class ApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		Pessoa p1 = new Pessoa("Penelope", "nega@gsmn.dev.br");
		Pessoa p2 = new Pessoa("Givaldo", "givaldoa@gsmn.dev.br");
		Pessoa p3 = new Pessoa("Mayara", "mayara@gsmn.dev.br");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		HSSFWorkbook arquivo = new HSSFWorkbook(); /* Para escrever na planilha */
		HSSFSheet linhaArquivo = arquivo.createSheet("Planilha de Pessoas"); /* Criar a planilha */
		
		int nLinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhaArquivo.createRow(nLinha++);
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		arquivo.write(saida);
		
		saida.flush();
		arquivo.close();
		
		System.out.println("Efetuado com sucesso!");
		
	}

}
