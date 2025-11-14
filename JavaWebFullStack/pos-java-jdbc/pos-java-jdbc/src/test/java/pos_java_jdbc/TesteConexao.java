package pos_java_jdbc;

import org.junit.jupiter.api.Test;

import conexao.SingleConnection;
import dao.UserPosDAO;
import model.UserPosJava;

public class TesteConexao {
	
	@Test
	public void initConexao() {
		SingleConnection.getConnection();
		
		UserPosDAO dao = new UserPosDAO();
		UserPosJava usuarios = new UserPosJava();
		usuarios.setId(3);
		usuarios.setNome("Mayara");
		usuarios.setEmail("mayara@mlfc.enf.br");
		
		dao.salvar(usuarios);
		
	}

}
