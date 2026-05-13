package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import constante.Mensagens;
import dao.DAOUsuario;


@WebServlet(urlPatterns = {"/ServletUsuario", "/principal/ServletUsuario", "/usuario.jsp"})
public class ServletUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private DAOUsuario daoUsuario = new DAOUsuario();
	
	
    public ServletUsuario() { }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("deletar")) {
			try {
				daoUsuario.deletar(request.getParameter("idUsuario"));
				request.setAttribute("msg", Mensagens.delUsuario);
				request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
		} else if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("deletarAjax")) {
			try {
				daoUsuario.deletar(request.getParameter("idUsuario"));
				response.getWriter().write(Mensagens.delUsuario);
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
		} else if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("pesquisarAjax")) {
			try {
				List<Usuario> listaJson =  daoUsuario.consultar(request.getParameter("nome"));
				ObjectMapper mapper = new ObjectMapper();
				response.getWriter().write(mapper.writeValueAsString(listaJson));
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
			
		} else if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("editar")) {
			
			String id = request.getParameter("idUsuario");
			
			try {
				Usuario usuario = daoUsuario.consultarUsuarioId(id);
				request.setAttribute("msg", Mensagens.edtUsuario);
				request.setAttribute("modelUsuario", usuario);
				request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
			
		} else if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listar")) {
			
			try {
				List<Usuario> lista = daoUsuario.consultar();
				request.setAttribute("listaUsuarios", lista);
				request.setAttribute("qdtUsuarios", lista.size() > 1 ? lista.size()+" Usuários Cadastrados" : " Usuário Cadastrado" );
				request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
				request.setAttribute("msg", e.getMessage());
				request.getRequestDispatcher("erro.jsp").forward(request, response);
			}
			
		} else {
			request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario(
			Integer.parseInt(request.getParameter("idUsuario").isEmpty() ? "0" : request.getParameter("idUsuario")),
			request.getParameter("nome"),
			request.getParameter("email"),
			request.getParameter("obs"),
			request.getParameter("login"),
			request.getParameter("pass"));
		
		try {
			
			if(usuario.isNew(request.getParameter("idUsuario"))) {				
				if(!daoUsuario.validarLogin(usuario.getLogin()) && usuario.getIdUsuario() == 0) {
					usuario = daoUsuario.gravar(usuario);
					request.setAttribute("msg", Mensagens.newUsuario);
				} else {
					request.setAttribute("msg", Mensagens.loginEmUso);
				}				
			} else {
				if(daoUsuario.validarUpdate(usuario)) {
					usuario = daoUsuario.gravar(usuario);
					request.setAttribute("msg", Mensagens.alterUsuario);
				} else {
					if(!daoUsuario.validarLogin(usuario.getLogin())) {
						usuario = daoUsuario.gravar(usuario);
						request.setAttribute("msg", Mensagens.alterUsuario);
					}else {
						request.setAttribute("msg", Mensagens.loginEmUso);
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
				
		request.setAttribute("modelUsuario", usuario);
		request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
		
	}

}
