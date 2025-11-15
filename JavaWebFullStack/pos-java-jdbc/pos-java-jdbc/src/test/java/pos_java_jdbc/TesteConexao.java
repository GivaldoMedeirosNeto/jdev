package pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import conexao.SingleConnection;
import dao.UserPosDAO;
import model.TelPosJava;
import model.UserPosJava;

public class TesteConexao {
	
	@Test
	public void initConexao() {
		SingleConnection.getConnection();
		
		UserPosDAO dao = new UserPosDAO();
		UserPosJava usuarios = new UserPosJava();
		TelPosJava telefones = new TelPosJava();
		usuarios.setNome("Penelope");
		usuarios.setEmail("nega@gsmn.dev.br");
		telefones.setTipo("celular");
		telefones.setTelefone("8499999-9999");
		
		dao.salvar(usuarios, telefones);
		
		usuarios = new UserPosJava();
		usuarios.setNome("Givaldo");
		usuarios.setEmail("givaldo@gsmn.dev.br");
		telefones.setTipo("celular");
		telefones.setTelefone("8488888-8888");
		
		dao.salvar(usuarios, telefones);
		
		usuarios = new UserPosJava();
		usuarios.setNome("Teste");
		usuarios.setEmail("teste@java.dev.br");
		telefones.setTipo("celular");
		telefones.setTelefone("8477777-7777");
		
		dao.salvar(usuarios, telefones);
		
		List<UserPosJava> list =  dao.listar();
		
		for (UserPosJava userPosJava : list) {
			System.out.println(userPosJava);
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		UserPosJava userPosJava = dao.buscar(1);
		System.out.println(userPosJava);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		UserPosJava teste = new UserPosJava();
		teste.setNome("Mayara");
		teste.setEmail("mayara@mlfc.enf.br");
		teste.setId(3);
		
		dao.atualizar(teste);
		userPosJava = dao.buscar(3);
		System.out.println(userPosJava);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		dao.deletar(3);
		
		List<UserPosJava> list1 =  dao.listar();
		for (UserPosJava userPosJava1 : list1) {
			System.out.println(userPosJava1);
		}
		
	}

}
