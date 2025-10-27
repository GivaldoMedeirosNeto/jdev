package executavel;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class NovaApiData {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		
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
		
		System.out.println("**************************************");
		
		Instant inicio = Instant.now();
		Thread.sleep(5000);
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println(duracao.toSeconds());
		
		System.out.println("**************************************");
		
		LocalDate datAtinga = LocalDate.parse("2020-04-05");
		LocalDate datNova = LocalDate.parse("2021-05-08");
		LocalDate datAtual = LocalDate.parse("2021-04-05");
		
		System.out.println(datAtinga.isAfter(datNova));
		System.out.println(datAtinga.isBefore(datNova));
		System.out.println(datAtual.isEqual(datNova));
		
		Period periodo = Period.between(datAtinga, datNova);
		System.out.println(periodo.getYears() + " ano, " + periodo.getMonths() + " meses, " + periodo.getDays() + " dias. ");
		System.out.println(periodo.toTotalMonths());
		
		System.out.println("**************************************");
		
		LocalDate dataBase = LocalDate.parse("2021-10-10");
		System.out.println(dataBase);
		System.out.println(dataBase.plusDays(5));
		System.out.println(dataBase.plusWeeks(5));
		System.out.println(dataBase.plusMonths(5));
		System.out.println(dataBase.plusYears(5));
		
		System.out.println("**************************************");
		
		for(int i = 1; i <= 12; i++ ) {
			dataBase = dataBase.plusMonths(1);
			System.out.println(dataBase);
		}
		
	}

}
