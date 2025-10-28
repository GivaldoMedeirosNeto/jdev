package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LendoJson {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader arquivo = new FileReader(
				"E:\\eclipse-workspace\\cursos\\Jdev\\JavaWebFullStack\\txt-excel\\arquivo.json"
		);
		
		JsonArray array = (JsonArray) JsonParser.parseReader(arquivo);
		
		List<Usuario> listUser = new ArrayList<Usuario>();
		
		for (JsonElement usuario : array) {
			
			Usuario user = new Gson().fromJson(usuario, Usuario.class);
			listUser.add(user);
			
		}
		
		System.out.println("Lendo o arquivo json" + listUser);
		
	}

}
