package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LerJSon {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*FileReader arquivo = new FileReader(
			"E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivo.json"
		);*/
		
		FileReader arquivo = new FileReader(
			"E:\\eclipse-workspace\\Curso\\Jdev\\JavaWebFullStack\\TXT-Excel\\Arquivos\\arquivoEstrutural.json"
		);
		
		JsonArray array = (JsonArray) JsonParser.parseReader(arquivo);
		
		List<Usuario> listUser = new ArrayList<Usuario>();
		
		for (JsonElement usuario : array) {			
			Usuario user = new Gson().fromJson(usuario, Usuario.class);
			System.out.println(user);
			listUser.add(user);			
		}
		
		System.out.println("\narquivo.json: " + listUser);
		
	}

}
