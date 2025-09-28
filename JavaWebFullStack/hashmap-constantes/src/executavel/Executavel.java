package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import constante.FaixaEtaria;
import model.Pessoa;

public class Executavel {
	
	public static void main(String[] args) {
		
		/* Lista com separação pela idade */
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		for(int i=1; i<=12; i++) {			
			Pessoa pessoa = new Pessoa("Penelope", 7 * i);
			lista.add(pessoa);
		}
		
		/* Lista para separar as faixas etarias */
		List<Pessoa> listCria = new ArrayList<Pessoa>();
		List<Pessoa> listAdol = new ArrayList<Pessoa>();
		List<Pessoa> listAdul = new ArrayList<Pessoa>();
		List<Pessoa> listVivi = new ArrayList<Pessoa>();
		
		for (Pessoa p : lista) {
			String faixa = p.getFaixaEtaria(p.getIdade());
			
			if(faixa.equalsIgnoreCase(FaixaEtaria.CRIANCA)) {
				listCria.add(p);
			} else if (faixa.equalsIgnoreCase(FaixaEtaria.ADOLESCENTE)) {
				listAdol.add(p);
			} else if (faixa.equalsIgnoreCase(FaixaEtaria.ADULTO)) {
				listAdul.add(p);
			} else {
				listVivi.add(p);
			}
		}
		
		System.out.println("Qtd de Crinaças: " + listCria.size());
		System.out.println("Qtd de Adolecentes: " + listAdol.size());
		System.out.println("Qtd de Adultos: " + listAdul.size());
		System.out.println("Qtd de Vividos: " + listVivi.size());
		
		System.out.println("**********************************");
		
		/* Lista para separar as faixas etarias com HashMap */
		/* é uma Lista com chave identificadora para uma sequencia de valores */
		HashMap<String, List<Pessoa>> maps = new HashMap<String, List<Pessoa>>();
		maps.put(FaixaEtaria.CRIANCA, new ArrayList<Pessoa>());
		maps.put(FaixaEtaria.ADOLESCENTE, new ArrayList<Pessoa>());
		maps.put(FaixaEtaria.ADULTO, new ArrayList<Pessoa>());
		maps.put(FaixaEtaria.VIDIDO, new ArrayList<Pessoa>());
		
		for (Pessoa p : lista) {
			String faixa = p.getFaixaEtaria(p.getIdade());
			if(faixa.equalsIgnoreCase(FaixaEtaria.CRIANCA)) {
				maps.get(FaixaEtaria.CRIANCA).add(p);
			} else if (faixa.equalsIgnoreCase(FaixaEtaria.ADOLESCENTE)) {
				maps.get(FaixaEtaria.ADOLESCENTE).add(p);
			} else if (faixa.equalsIgnoreCase(FaixaEtaria.ADULTO)) {
				maps.get(FaixaEtaria.ADULTO).add(p);
			} else {
				maps.get(FaixaEtaria.VIDIDO).add(p);
			}
		}
		
		System.out.println("HashMaps");
		System.out.println("Qtd de Crinaças: " + maps.get(FaixaEtaria.CRIANCA).size());
		System.out.println("Qtd de Adolecentes: " + maps.get(FaixaEtaria.ADOLESCENTE).size());
		System.out.println("Qtd de Adultos: " + maps.get(FaixaEtaria.ADULTO).size());
		System.out.println("Qtd de Vividos: " + maps.get(FaixaEtaria.VIDIDO).size());
		
	}

}