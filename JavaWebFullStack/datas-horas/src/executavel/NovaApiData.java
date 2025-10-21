package executavel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaApiData {
	
	public static void main(String[] args) throws ParseException {
		
		LocalDate dtAtual = LocalDate.now();		
		System.out.println("Data: " + dtAtual);
		
		LocalTime hora = LocalTime.now();		
		System.out.println("Hora: " + hora);
		
		LocalDateTime dataHora = LocalDateTime.now();		
		System.out.println("Data/Hora: " + dataHora);
		
		System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss\n")));
		
		System.out.println("Dia da Semana: " + dataHora.getDayOfWeek());
		System.out.println("Dia: " + dataHora.getDayOfMonth());
		System.out.println("Mês: " + dataHora.getMonth());
		System.out.println("Ano: " + dataHora.getYear());
		
	}

}
