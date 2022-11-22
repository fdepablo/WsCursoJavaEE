package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.ejb.GestorFrasesEJB;

@WebServlet("/ServletObtenerFrase")
public class ServletObtenerFrase extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//En este caso, al ser un EJB local, podemos acceder de una manera
	//mucho más simple al JNDI para que nos devuelva el EJB
	//al que queremos acceder
	
	//Mediante la anotación @javax.ejb.EJB hacemos una busqueda por tipo
	//dentro del JNDI y si existe algún EJB del mismo tipo en el JNDI
	//nos devuelve la rerenencia. En este caso NO trabajamos con objetos
	//proxy, apuntamos directemante al objeto
	
	//Este concepto es el de inyección de dependencias, muy parecido
	//a los @ManagedBean de JSF
	
	@EJB
	private GestorFrasesEJB gf;
	
	private int contador;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Si hacemos la siguiente linea, no estamos accediendo a un EJB
		//estamos creando un nuevo objeto GestorFrasesEJB
		//GestorFrasesEJB gf = new GestorFrasesEJB();

		gf.escribir("Frase aleatoria " + contador++);
		
		//Accedemos al EJB para obtener las frases
		List<String> listaFrases = gf.obtenerFrases();
		request.setAttribute("frases", listaFrases);
		request.getRequestDispatcher("frases.jsp").forward(request, response);
	}


}
