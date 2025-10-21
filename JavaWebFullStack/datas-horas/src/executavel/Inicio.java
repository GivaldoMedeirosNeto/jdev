package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Inicio {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(data);
		System.out.println(calendar.getTime());
		
		System.out.println("\nData em milisegundos: " + data.getTime());
		System.out.println("Data milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("\nDia: " + data.getDate());
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Mês: " + data.getMonth());
		System.out.println("Mês: " + calendar.get(Calendar.MONTH));
		
		System.out.println("Ano: " + (data.getYear()+1900));
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		
		System.out.println();
		
		System.out.println("Dia da Semana: " + data.getDay());
		System.out.println("Dia da Semana: " + calendar.get((Calendar.DAY_OF_WEEK)-1));
		//"1 - Segunda | 2 - Terça | 3 - Quarta | 4 - Quinta | 5 - Sexta | 6 - Sábado | 7 - Domingo"
		
		System.out.println();
		
		System.out.println("\nHora: " + data.getHours());
		System.out.println("Hora: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos: " + data.getMinutes());
		System.out.println("Minutos: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + data.getSeconds());
		System.out.println("Segundos: " + calendar.get(Calendar.SECOND));
		
		
		/* Simple Date Format */
		System.out.println();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
		System.out.println(dateFormat.format(data));
		System.out.println(dateFormat.format(calendar.getTime()));
		
		dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println(dateFormat.format(data));
		System.out.println(dateFormat.format(calendar.getTime()));
		
		dateFormat = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		System.out.println(dateFormat.format(data));
		System.out.println(dateFormat.format(calendar.getTime()));
		
		try {
			System.out.println(dateFormat.parse("18/10/1987 16:03:03"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
