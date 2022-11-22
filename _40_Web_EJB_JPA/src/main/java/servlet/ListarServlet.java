package servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.ejb.GestorPersonaEJB;
import es.curso.entidad.Persona;

/**
 * Servlet implementation class ListarServlet
 */
@WebServlet("/ListarServlet")
public class ListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private GestorPersonaEJB gp;
	
	
    //Este método se va a ejecutar una única vez cuando se cree el servlet
	@Override
	public void init() throws ServletException {
		System.out.println("init -> Creando los datos de la BBDD");
		gp.inicializar();
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Persona> listarPersonas = gp.listar();
		response.getWriter().append("Listar Servlet EJB y JPA").append(listarPersonas.toString());
	}

}
