package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/principal/*"}) /* Intercepta as requisições que vem do projeto e mapeamento */
public class FilterAutenticacao extends HttpFilter implements Filter {
       
    public FilterAutenticacao() {
        
    }

    /* Encerra os processo quando o servidor está desligado */
	public void destroy() {
		
	}

	/* Intercpta as requisições e as respostas do sistema */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	/* Inicia os processo quando o servidor está ligado */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
