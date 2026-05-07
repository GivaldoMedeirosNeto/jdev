package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class GerandoParcelas {
	
	public static void main(String[] args) throws ParseException {
		
		Date dtInicial = new SimpleDateFormat("dd/MM/yyy").parse(
			LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy"))
		);
		
		System.out.println();
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dtInicial);
		
		String qtd = JOptionPane.showInputDialog("Quantas Parcelas:");
		
		for(int parc = 1; parc <= Integer.parseInt(qtd); parc++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela de Nº " + parc + " com vencimento no dia "
					+ new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		}
		
	}

}
