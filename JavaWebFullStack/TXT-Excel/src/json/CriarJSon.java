package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CriarJSon {
	
	public static void main(String[] args) throws IOException {
		
		Usuario user1 = new Usuario("Nega", "020620", "123456789");
		Usuario user2 = new Usuario("Giva", "111085", "987654321");
		Usuario user3 = new Usuario("Alex", "060782", "741852963");
		
		List<Usuario> listUsers = new ArrayList<Usuario>();
		listUsers.add(user1);
		listUsers.add(user2);
		listUsers.add(user3);
		
		FileWriter JSON = new FileWriter(
			"E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivo.json"
		);
				
		/*JSON em 1 linha*/
		String json = new Gson().toJson(listUsers);
		System.out.println("Dados em JSON:" + json);
		
		JSON.write(json);
		JSON.flush();
		JSON.close();
		
		System.out.println("************************");
				
		/*Organizando o COD JSON estrutural*/
		
		JSON = new FileWriter(
			"E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivoEstrutural.json"
		);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		json = gson.toJson(listUsers);
		
		System.out.println("JSON Estrutural:" + json);
		
		JSON.write(json);
		JSON.flush();
		JSON.close();
		
	}

}
