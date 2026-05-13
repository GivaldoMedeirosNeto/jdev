package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;

import connection.SingleConnection;
import model.Usuario;

public class DAOUsuario {
	
	private Connection connection;
	private String sql = "";
	
	public DAOUsuario() {
		connection = SingleConnection.getConnection();
	}
	
	private String senhaHash (String senha) {
		return BCrypt.hashpw(senha, BCrypt.gensalt(10));
	}
	
	public Usuario gravar(Usuario usuario) throws SQLException {
		
		if(usuario.getIdUsuario() == 0) {
			sql = "INSERT INTO usuarios (nome, email, obs, login, pass) VALUES (?, ?, ?, ?, ?);";
		} else {
			sql = "UPDATE usuarios SET nome=?, email=?, obs=?, login=?, pass =? WHERE idUsuario=?;";
		}
		
		
		PreparedStatement statement = connection.prepareStatement(sql);
	    statement.setString(1, usuario.getNome());
	    statement.setString(2, usuario.getEmail());
	    statement.setString(3, usuario.getObs());
	    statement.setString(4, usuario.getLogin());
	    statement.setString(5, senhaHash(usuario.getPass()));
	    
	    if(usuario.getIdUsuario() != 0) {
	    	statement.setInt(6, usuario.getIdUsuario());
	    }
	    
	    statement.execute();
		connection.commit();
		
		return this.consultarUsuario(usuario.getLogin());
		
	}
	
	public void deletar(String id) throws SQLException {
		
		String sql = "DELETE FROM usuarios WHERE idUsuario = ?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, Integer.parseInt(id));
		statement.executeUpdate();
		
		connection.commit();
		
	}
	
	public Usuario consultarUsuario(String login) throws SQLException {
		
		Usuario usuario = new Usuario();
		
		sql = "SELECT * FROM usuarios WHERE login = ? AND login <> ?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
	    statement.setString(1, login);
	    statement.setString(2, "admin");
	    
	    ResultSet resultado = statement.executeQuery();
	    
	    while(resultado.next()) {
	    	usuario.setIdUsuario(resultado.getInt("idUsuario"));
	    	usuario.setNome(resultado.getString("nome"));
	    	usuario.setEmail(resultado.getString("email"));
	    	usuario.setLogin(resultado.getString("login"));
	    	usuario.setObs(resultado.getString("obs"));	    	
	    }
		
	    return usuario;
		
	}
	
	public Usuario consultarUsuarioId(String id) throws SQLException {
		
		Usuario usuario = new Usuario();
		
		sql = "SELECT * FROM usuarios WHERE idUsuario = ? AND login <> ?;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
	    statement.setInt(1, Integer.parseInt(id));
	    statement.setString(2, "admin");
	    
	    ResultSet resultado = statement.executeQuery();
	    
	    while(resultado.next()) {
	    	usuario.setIdUsuario(resultado.getInt("idUsuario"));
	    	usuario.setNome(resultado.getString("nome"));
	    	usuario.setEmail(resultado.getString("email"));
	    	usuario.setLogin(resultado.getString("login"));
	    	usuario.setObs(resultado.getString("obs"));	    	
	    }
		
	    return usuario;
		
	}
	
	public List<Usuario> consultar(String nome) throws SQLException {
		
		List<Usuario> retorno = new ArrayList<Usuario>();		
		
		String sql = "SELECT * FROM usuarios WHERE nome like ? AND login <> ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "%" + nome + "%");
		statement.setString(2, "admin");
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			Usuario usuario = new Usuario();
			usuario.setIdUsuario(resultado.getInt("idUsuario"));
			usuario.setNome(resultado.getString("nome"));
			usuario.setEmail(resultado.getString("email"));
			usuario.setLogin(resultado.getString("login"));
			usuario.setPass(resultado.getString("pass"));
			usuario.setObs(resultado.getString("obs"));
			
			retorno.add(usuario);
		}
		
		return retorno;
	}
	
	public List<Usuario> consultar() throws SQLException {
		
		List<Usuario> retorno = new ArrayList<Usuario>();		
		
		String sql = "SELECT * FROM usuarios WHERE login <> ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "admin");
		
		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			Usuario usuario = new Usuario();
			usuario.setIdUsuario(resultado.getInt("idUsuario"));
			usuario.setNome(resultado.getString("nome"));
			usuario.setEmail(resultado.getString("email"));
			usuario.setLogin(resultado.getString("login"));
			usuario.setPass(resultado.getString("pass"));
			usuario.setObs(resultado.getString("obs"));
			
			retorno.add(usuario);
		}
		
		return retorno;
	}
	
	public boolean validarLogin (String login) throws SQLException{
		
		String sql = "SELECT count(1) > 0 AS retorno FROM usuarios WHERE login = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, login);
		
		ResultSet resultado = statement.executeQuery();
		resultado.next();
		
		return resultado.getBoolean("retorno");
	}
	
	public boolean validarUpdate (Usuario usuario) throws SQLException{
		
		String sql = "SELECT count(1) > 0 AS retorno FROM usuarios WHERE login = ? AND idUsuario = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, usuario.getLogin());
		statement.setInt(2, usuario.getIdUsuario());
		
		ResultSet resultado = statement.executeQuery();
		resultado.next();
		
		return resultado.getBoolean("retorno");
	}

}
