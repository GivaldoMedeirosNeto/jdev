package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoParcelas {

	public static void main(String[] args) throws ParseException {
		
		Date dtInicial = new SimpleDateFormat("dd/MM/yyy").parse("08/04/2021");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dtInicial);
		
		for(int parc = 1; parc <= 12; parc++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela de Nº " + parc + " com vencimento no dia "
					+ new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		}
		
	}
}
