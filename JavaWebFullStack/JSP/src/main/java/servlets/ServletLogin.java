package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;

import java.io.IOException;

import dao.DAOLogin;

@WebServlet(urlPatterns = {"/ServletLogin", "/principal/ServletLogin"})
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private DAOLogin daoLogin = new DAOLogin();
       

    public ServletLogin() { }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("logout")) {
			request.getSession().invalidate();
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			doPost(request, response);
		}		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String url = request.getParameter("url");
			
			if(request.getParameter("login") != null && !request.getParameter("login").isEmpty()
				&& request.getParameter("pass") != null && !request.getParameter("pass").isEmpty()) {
				
				Usuario usuario = new Usuario(request.getParameter("login"), request.getParameter("pass"));
				
				if(daoLogin.autenticar(usuario)) {
					
					request.getSession().setAttribute("usuario", usuario.getLogin());
					
					if(url == null || url.equals("null")) {
						url = "principal/principal.jsp";
					}
					
					request.getRequestDispatcher(url).forward(request, response);
					
				} else {
					request.setAttribute("msg", "Login/Senha Inválido!");
					request.getRequestDispatcher("/index.jsp").forward(request, response);
				}
				
			} else {
				request.setAttribute("msg", "Para acesso ao sistema informe o Login/Senha!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
		
	}

}
