package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connection.SingleConnection;
import model.ModelLogin;

public class DAOLoginRepository {
	
	private Connection connection;
	
	public DAOLoginRepository() {
		connection = SingleConnection.getConnection();
	}
	
	public boolean autenticacao(ModelLogin login) throws Exception{
		
		String sql = "SELECT * FROM model_login WHERE login = ? AND pass = ?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, login.getLogin());
		statement.setString(2, login.getPassword());
		
		ResultSet resultSet = statement.executeQuery();
		
		if(resultSet.next()) {
			return true;
		} else {
			return false;
		}
		
	}

}
