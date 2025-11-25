package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

import java.io.IOException;

@WebServlet(urlPatterns = {"/principal/ServletLogin","/ServletLogin"}) /* Mapeamento de URL */
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    
    public ServletLogin() {
        
    }

	/* Recebe os dados pela URL em paramentros */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/* Recebe os dados por um formulario */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ModelLogin login = new ModelLogin(request.getParameter("user"), request.getParameter("password"));
		String url = request.getParameter("url");
		
		if(login.getLogin() != null && !login.getLogin().isEmpty()
			&& login.getPassword() != null && !login.getPassword().isEmpty()) {
			
			if(login.getLogin().equalsIgnoreCase("admin") && login.getPassword().equalsIgnoreCase("admin")) {
				
				request.getSession().setAttribute("user", login.getLogin());
				if(url == null || url.equals("null")) {
					url = "principal/principal.jsp";
				}
				RequestDispatcher redirecionar = request.getRequestDispatcher(url);
				redirecionar.forward(request, response);
				
			} else {
				
				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "Informe o usuário e senha corretamente!");
				redirecionar.forward(request, response);
				
			}
			
		} else {
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o usuário e senha corretamente!");
			redirecionar.forward(request, response);
			
		}

	}

}
