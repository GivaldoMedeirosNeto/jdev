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

@WebFilter(urlPatterns = {"/principal/*"}) /* Intercepta as requisições que vem do projeto e mapeamento */
public class FilterAutenticacao extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;

	public FilterAutenticacao() { }

    /* Encerra os processo quando o servidor está desligado */
	public void destroy() { }

	/* Intercpta as requisições e as respostas do sistema */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
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
				
	}

	/* Inicia os processo quando o servidor está ligado */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
