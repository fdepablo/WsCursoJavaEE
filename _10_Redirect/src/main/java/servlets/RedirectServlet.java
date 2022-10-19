package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private int contador = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//aumentamos el contador de las visitas a google
		contador++;
		System.out.println("Se ha visitado google " + contador + " veces");
		
		//RequestDispatcher es mas usado para mandar a recursos dentro de nuestra app
		//para mandar a fuera es mejor usar un redirect, es decir, dar una orden
		//al navegador del cliente de que vaya a otro sitio
		response.sendRedirect("https://www.google.es");
		//Por lo tanto, es muy importante tener en cuenta que:
		//1- El objeto request cambia
		//2- La URL tambien cambia a la de la redirección
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
