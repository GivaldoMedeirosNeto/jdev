package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CriandoJson {
	
	public static void main(String[] args) throws IOException {
		
		Usuario user1 = new Usuario("nega", "020620", "1234567890");
		Usuario user2 = new Usuario("gíva", "111085", "1478523690");
		Usuario user3 = new Usuario("may", "120389", "3692581470");
		
		List<Usuario> listUser = new ArrayList<Usuario>();
		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);
		
		/*Organizando o COD*/		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String json = gson.toJson(listUser);
		
		System.out.println("JSON Criado\n" + json);
		
		FileWriter JSON = new FileWriter(
				"E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.json"
		);
		
		JSON.write(json);
		JSON.flush();
		JSON.close();
		
		
	}

}
