package executavel;

import java.util.Date;

public class executavel {
	
	public static void main(String[] args) {
		
		Date data = new Date();
		
		System.out.println(data);
		System.out.println("Data em milisegundos: " + data.getTime());
		
		System.out.println("Dia: " + data.getDate());
		System.out.println("Mês: " + data.getMonth());
		System.out.println("Ano: " + (data.getYear()+1900));
		
		System.out.println();
		
		System.out.println("Dia da Semana: " + data.getDay());
		//"1 - Segunda | 2 - Terça | 3 - Quarta | 4 - Quinta | 5 - Sexta | 6 - Sábado | 7 - Domingo"
		
		System.out.println();
		
		System.out.println("Hora: " + data.getHours());
		System.out.println("Minutos: " + data.getMinutes());
		System.out.println("Segundos: " + data.getSeconds());
		
		
	}

}
