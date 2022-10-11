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

	//Este método se ejecutará cuando llegue una petición GET al servlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Con response.getWriter acdedemos a escribir en el body del mensaje HTTP
		response.getWriter().append("Entrando por doGet");
	}

	//Este método se ejecutará cuando llegue una petición POST al servlet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Entrando por doPost");
	}

}
