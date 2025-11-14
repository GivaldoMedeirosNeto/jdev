package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.SingleConnection;
import model.UserPosJava;

public class UserPosDAO {
	
	private Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar (UserPosJava userposjava ) {
		
		String sql = "INSERT INTO userposjava (nome, email) VALUES ( ?, ?)";
		
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, userposjava.getNome());
			insert.setString(2, userposjava.getEmail());
			insert.execute();
			
			connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

	public List<UserPosJava> listar (){
		
		List<UserPosJava> lista = new ArrayList<UserPosJava>();
		
		String sql = "SELECT * FROM userposjava;";
		try {
			PreparedStatement select = connection.prepareStatement(sql);
			ResultSet resultado = select.executeQuery();
			
			while(resultado.next()) {
				UserPosJava usuarios = new UserPosJava();
				usuarios.setId(resultado.getInt("id"));
				usuarios.setNome(resultado.getString("nome"));
				usuarios.setEmail(resultado.getString("email"));
				
				lista.add(usuarios);
			}
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return lista;
	}

	public UserPosJava buscar (int id){
		
		UserPosJava usuario = new UserPosJava();
		
		String sql = "SELECT * FROM userposjava where id = " + id + ";";
		try {
			PreparedStatement select = connection.prepareStatement(sql);
			ResultSet resultado = select.executeQuery();
			
			while(resultado.next()) {
				usuario.setId(resultado.getInt("id"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setEmail(resultado.getString("email"));
			}
			
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return usuario;
	}

	public void atualizar(UserPosJava userposjava) {
		
		String sql = "UPDATE userposjava set nome = ?, email = ? where id = " + userposjava.getId();
		
		
		try {
			PreparedStatement update = connection.prepareStatement(sql);
			update.setString(1, userposjava.getNome());
			update.setString(2, userposjava.getEmail());
			update.execute();
			
			connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
}