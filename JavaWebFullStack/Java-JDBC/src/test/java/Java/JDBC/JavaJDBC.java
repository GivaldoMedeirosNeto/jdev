package Java.JDBC;

import java.util.List;

import org.junit.jupiter.api.Test;

import conexao.SingleConnection;
import dao.UsuarioDAO;
import model.Contato;
import model.Usuario;
import model.UsuarioContato;

public class JavaJDBC {
	
	UsuarioDAO daoUsuario = new UsuarioDAO();
	Usuario usuario = new Usuario();
	Contato contato = new Contato();
	
	@Test
	public void initConexao() {		
		SingleConnection.getConnection();
	}
	
	@Test
	public void initSalvar() {
		
		daoUsuario = new UsuarioDAO();
		
		usuario = new Usuario("Penelope Medeiros", "nega@gsmn.dev.br");				
		daoUsuario.salvar(usuario);
		
		usuario = new Usuario("Givaldo Medeiros", "gsmn@gsmn.dev.br");
		daoUsuario.salvar(usuario);
		
		usuario = new Usuario("Teste Java", "teste@gsmn.dev.br");
		daoUsuario.salvar(usuario);
		
		System.out.println("Usuarios inseridos com sucesso.");
		
	}
	
	@Test
	public void initListar() {
		
		List<Usuario> lista = daoUsuario.listar();
		
		for (Usuario usuarios : lista) {
			System.out.println(usuarios);
		}
		
	}
	
	@Test
	public void initBuscar() {
		
		Usuario usuario = daoUsuario.buscar(3);		
		System.out.println(usuario);
		
	}
	
	@Test
	public void initAtualizar() {
		
		Usuario usuario = daoUsuario.buscar(3);
		usuario.setNome("Java Teste");
		usuario.setEmail("teste.java@gsmn.dev.br");
		
		daoUsuario.atualizar(usuario);
		
		System.out.println(usuario);
		
	}
	
	@Test
	public void initDeletar() {
		
		Usuario usuario = daoUsuario.buscar(3);		
		daoUsuario.deletar(usuario);
		System.out.println("Usuario deletado com sucesso.");
		
	}
	
	@Test
	public void initSalvarContato() {
		
		daoUsuario = new UsuarioDAO();
		
		usuario = new Usuario("Penelope Medeiros", "nega@gsmn.dev.br");
		contato = new Contato("84902062020");
		daoUsuario.salvarContato(usuario, contato);
		
		usuario = new Usuario("Givaldo Medeiros", "gsmn@gsmn.dev.br");
		contato = new Contato("84981819696");
		daoUsuario.salvarContato(usuario, contato);
		
		usuario = new Usuario("Teste Java", "teste@gsmn.dev.br");
		contato = new Contato("84996968181");
		daoUsuario.salvarContato(usuario, contato);
		
		System.out.println("Usuarios e seus contatos inseridos com sucesso.");
		
	}
	
	@Test
	public void initListarContato() {
		
		List<UsuarioContato> lista = daoUsuario.buscarUsuaCont(1);
		
		for (UsuarioContato usuarios : lista) {
			System.out.println(usuarios);
		}
		
	}
	
	@Test
	public void initDeletarContato() {
		
		daoUsuario.deletarContato(3);
		System.out.println("Usuario deletado com sucesso.");
		
	}

}
