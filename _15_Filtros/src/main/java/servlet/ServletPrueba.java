package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPrueba")
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		System.out.println("init -> Creando ServletPrueba");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Si no existieran los filtros, tendria que tomar el tiempo en TODOS
		//los servlets antes y despues para sacar el tiempo de procesamiento
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		var variable = "cadena";//inferencia de tipos, java 9 0 10
		//variable = 56;
		variable.toString();
		
		var writer = response.getWriter();
		writer.append("");*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
