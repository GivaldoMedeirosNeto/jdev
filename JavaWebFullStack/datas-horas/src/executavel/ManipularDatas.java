package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ManipularDatas {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar data = Calendar.getInstance();
		
		data.setTime(new SimpleDateFormat("dd-MM-yy").parse("11-10-1985"));
		System.out.println(new SimpleDateFormat("dd/MM/yy").format(data.getTime()));
		
		data.add(Calendar.DAY_OF_MONTH, 30);		
		System.out.println(new SimpleDateFormat("dd/MM/yy").format(data.getTime()));
		
		data.add(Calendar.MONTH, 1);		
		System.out.println(new SimpleDateFormat("dd/MM/yy").format(data.getTime()));
		
		data.add(Calendar.YEAR, 40);		
		System.out.println(new SimpleDateFormat("dd/MM/yy").format(data.getTime()));
		
		System.out.println("****************************************");
		System.out.println("Faixa de datas");
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Dias: " + dias);
		
		long mes = ChronoUnit.MONTHS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Mês: " + mes);
		
		long anos = ChronoUnit.YEARS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Ano: " + anos);
		
	}

}
