package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.SingleConnection;
import model.Contato;
import model.Usuario;
import model.UsuarioContato;

public class UsuarioDAO {
	
	private Connection connection;
	
	public UsuarioDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(Usuario usuario) {
		
		String sql = "INSERT INTO usuarios (nome, email) VALUES ( ?, ?);";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());
			statement.execute();
			
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
	
	public List<Usuario> listar(){
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		String sql = "SELECT * FROM usuarios;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while(resultado.next()) {
				Usuario usuarios = new Usuario();
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

	public Usuario buscar(Integer id){
		
		Usuario usuario = new Usuario();
		
		String sql = "SELECT * FROM usuarios WHERE id=?;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultado = statement.executeQuery();
			
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
	
	public void atualizar(Usuario usuario){
			
		String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());
			statement.setInt(3, usuario.getId());
			statement.execute();
			
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
	
	public void deletar(Usuario usuario){
		
		String sql = "DELETE FROM usuarios WHERE id = ?;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, usuario.getId());
			statement.execute();
			
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
	
	public void salvarContato(Usuario usuario, Contato contato) {
		
		String sql = "INSERT INTO usuarios (nome, email) VALUES ( ?, ?);";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getEmail());
			statement.execute();
			
			connection.commit();
			
			contato.setIdUsuario(buscarIdUsuario());
			salvarContato(contato);
			
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
	public List<UsuarioContato> buscarUsuaCont(int id) {
		
		List<UsuarioContato> lista = new ArrayList<UsuarioContato>();
		
		String sql = "SELECT nome, email, contato FROM contatos ";
			   sql += " INNER JOIN usuarios ON contatos.id_usuario = usuarios.id ";
			   sql += " WHERE usuarios.id = ?;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.execute();
			
			ResultSet resultado = statement.executeQuery();			
			while(resultado.next()) {
				UsuarioContato retorno = new UsuarioContato();
				retorno.setNome(resultado.getString("nome"));
				retorno.setEmail(resultado.getString("email"));
				retorno.setContato(resultado.getString("contato"));
				
				lista.add(retorno);
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
	
	public void deletarContato(int id){
		
		String sql = "DELETE FROM contatos WHERE id = ?;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.execute();
			
			connection.commit();
			
			sql = "DELETE FROM usuarios WHERE id = ?;";
			
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.execute();
			
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
	
	private int buscarIdUsuario() {
		
		int idUsuario = 0;
		
		String sql = "SELECT MAX(id) AS idUsuario FROM usuarios;";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			if(resultado.next()) {
				idUsuario = resultado.getInt("idUsuario");
			}
			
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		return idUsuario;
		
	}
	
	private void salvarContato(Contato contato) {
		
		String sql = "INSERT INTO contatos (id_usuario, contato) VALUES ( ?, ?);";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, contato.getIdUsuario());
			statement.setString(2, contato.getContato());
			statement.execute();
			
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
