package filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Este filtro se va a encargar de aplicar seguridad a aquellos recursos
 * en los que el usuario tiene que estar registrado para entrar en ellos
 * 
 * Todos los recursos que empiezan por "/seguro/" deberan entrar por este
 * filtro para comprobar si se ha registrado el usuario
 * 
 * @author felix de pablo
 *
 */
@WebFilter("/seguro/*")
public class FiltroSeguridad extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("doFilter -> Entrando por FiltroSeguridad");
		
		//Nosotros dejamos pasar al usuario a lo seguro siempre y cuando se haya
		//logueado en LoginServlet. Así pues, comprobamos que en la sesión
		//hay un atributo que es "nombreUsuario"
		
		//La session HTTP se encuentra en el objeto HTTPServletRequest por lo
		//que tengo que hacer un casting
		
		HttpServletRequest hsr = (HttpServletRequest)request;
		if(hsr.getSession().getAttribute("nombreUsuario") != null) {
			chain.doFilter(request, response);
		}else {
			System.out.println("doFilter -> Alert!!! Intento de acceso no permitido");
			//TY!! https://mkyong.com/java/how-to-get-client-ip-address-in-java/
			String ipAddress = request.getRemoteAddr();
			System.out.println("doFilter -> IP: " + ipAddress);
			HttpServletResponse hsResponse = (HttpServletResponse)response;
			hsResponse.sendRedirect("/_16_FiltroSeguridad/login.jsp");
		}		
		
		System.out.println("doFilter -> Saliendo de FiltroSeguridad");
	}


}
