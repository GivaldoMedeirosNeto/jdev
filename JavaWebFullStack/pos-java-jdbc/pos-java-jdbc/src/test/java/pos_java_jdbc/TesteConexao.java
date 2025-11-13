package pos_java_jdbc;

import org.junit.jupiter.api.Test;

import conexao.SingleConnection;

public class TesteConexao {
	
	@Test
	public void initConexao() {
		SingleConnection.getConnection();
	}

}
