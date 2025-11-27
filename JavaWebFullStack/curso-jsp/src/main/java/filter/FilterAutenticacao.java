package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import connection.SingleConnection;

@WebFilter(urlPatterns = {"/principal/*"}) /* Intercepta as requisições que vem do projeto e mapeamento */
public class FilterAutenticacao extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;
	
	private static Connection connection;

	public FilterAutenticacao() { }

	/* Intercpta as requisições e as respostas do sistema */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpSession session = httpRequest.getSession();
			
			String user = (String) session.getAttribute("user");
			String url = httpRequest.getServletPath();
			
			if(user == null && !url.equalsIgnoreCase("/principal/ServletLogin")) {
				
				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp?url=" + url);
				request.setAttribute("msg", "Efetue o Login para acesso ao sistema");
				redirecionar.forward(request, response);
				return;
				
			} else {
				chain.doFilter(request, response);						
			}
			
			connection.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				
	}

	/* Inicia os processo quando o servidor está ligado */
	public void init(FilterConfig fConfig) throws ServletException {
		connection = SingleConnection.getConnection();
	}
	
	/* Encerra os processo quando o servidor está desligado */
	public void destroy() {
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
