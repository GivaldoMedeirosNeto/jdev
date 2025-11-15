package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.SingleConnection;
import model.TelPosJava;
import model.UserPosJava;

public class UserPosDAO {
	
	private Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar (UserPosJava userposjava, TelPosJava telPosJava) {
		
		String sql = "INSERT INTO userposjava (nome, email) VALUES ( ?, ?)";
		
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, userposjava.getNome());
			insert.setString(2, userposjava.getEmail());
			insert.execute();
			
			connection.commit();
			telPosJava.setIdUser(buscarIdUser());
			salvarTel(telPosJava);
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
	public void salvarTel (TelPosJava telPosJava) {
		
		String sql = "INSERT INTO telposjava (tipo, numero, iduser) VALUES ( ?, ?, ?)";
		
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, telPosJava.getTipo());
			insert.setString(2, telPosJava.getTelefone());
			insert.setInt(3, telPosJava.getIdUser());
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
	
	public void deletar(int id) {
		String sql = "";
		 
		try {
			sql = "DELETE FROM telposjava where iduser = " + id;
			PreparedStatement delet = connection.prepareStatement(sql);
			delet.execute();			
			connection.commit();
			
			sql = "DELETE FROM userposjava where id = " + id; 
			delet = connection.prepareStatement(sql);
			delet.execute();			
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
	
	public int buscarIdUser() {
		
		int idUser = 0;
		
		String sql = "SELECT MAX(id) AS ultimo_id FROM userposjava;";
		try {
			PreparedStatement select = connection.prepareStatement(sql);
			ResultSet resultado = select.executeQuery();
			
			if(resultado.next()) {
				idUser = resultado.getInt("ultimo_id");
			}
			
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return idUser;
	}
	
}