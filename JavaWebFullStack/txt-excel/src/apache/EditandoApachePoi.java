package apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditandoApachePoi {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.xls");
		FileInputStream entrada = new FileInputStream(file);
		HSSFWorkbook arquivo = new HSSFWorkbook(entrada);
		HSSFSheet planilha = arquivo.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			
			String valorCell = linha.getCell(0).getStringCellValue();
			linha.getCell(0).setCellValue(valorCell + "*gravado");
			
		}
		
		entrada.close();
		FileOutputStream saida = new FileOutputStream(file);
		arquivo.write(saida);
		saida.flush();
		saida.close();
		arquivo.close();
		
		System.out.println("planilha atualizada.");
		
	}

}
