package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacaoData {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
		
		Date dtAtual = formatDate.parse("21/10/25");
		Date dtBoleto = formatDate.parse("20/10/26");
		Date dtTeste = formatDate.parse("21/10/25");
		
		/*A data é posterior a (data)*/
		if(dtBoleto.after(dtAtual)) {
			System.out.println("Data Posterior");
		} else {
			System.out.println("Data Anterior");
		}
		
		/*A data é anterior a (data)*/
		if(dtBoleto.before(dtAtual)) {
			System.out.println("Data Anterior");
		} else {
			System.out.println("Data Posterior");
		}
		
		/*A data é anterior a (data)*/
		if(dtTeste.equals(dtAtual)) {
			System.out.println("Mesma Data");
		} else {
			System.out.println("Data Diferente");
		}
		
		
	}

}
