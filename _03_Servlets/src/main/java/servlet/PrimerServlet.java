package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * La mejor manera de crear un servlet es extendiendo de la clase HttpServlet
 * 
 * Un servlet no deja de ser un recurso al que podemos invocar
 * @author vened
 *
 */
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init -> Arranando el Servlet, PrimerServlet");
	}

	private int contador = 0;

	//Este método se ejecutará cuando llegue una petición GET al servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Con response.getWriter accedemos a escribir en el body del mensaje HTTP
		contador++;
		response.getWriter().append("Entrando por doGet, contador: " + contador);
	}

	//Este método se ejecutará cuando llegue una petición POST al servlet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contador++;
		response.getWriter().append("Entrando por doPost,  contador: " + contador);
	}
	
	

}
