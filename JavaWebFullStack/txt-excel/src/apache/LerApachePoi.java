package apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import arquivos.Pessoa;

public class LerApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream(
				new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.xls"));
		
		HSSFWorkbook arquivo = new HSSFWorkbook(entrada); /* Prepara o arquivo */
		HSSFSheet planilha = arquivo.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			Iterator<Cell> celula = linha.iterator();
			
			String nome="", email="";
			
			while(celula.hasNext()) {
				Cell cell = celula.next();
				
				switch(cell.getColumnIndex()) {
				case 0:
					nome = cell.getStringCellValue();
					break;
				case 1:
					email = cell.getStringCellValue();
					break;				
				}
				
			}
			
			Pessoa p = new Pessoa(nome, email);
			pessoas.add(p);
		}
		
		entrada.close();
		arquivo.close();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
