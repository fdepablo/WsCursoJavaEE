package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro1 = request.getParameter("param1");
		if(parametro1.equals("pepe")){
			//Podemos enviar una petición a otros recursos de nuestra app, mediante
			//la clase "RequestDispatcher". Normalmente enviaremos la petición a JSPs o
			//HTML pero podriamos mandarla a cualquier recurso, por ejemplo otro Servlet
			RequestDispatcher rd = 
					request.getRequestDispatcher("correcto.jsp");
			//Con forward, mandamos la orden de envio al recurso que hemos configurado
			rd.forward(request, response);
			//Es importante darse cuanta que en este caso caso de aquí la petición del cliente
			//sigue siendo la misma, es decir, el objeto Request NO CAMBIA
			//Además, es importante notar que la URL de la web TAMPOCO cambia, es decir,
			//el cliente no sabe que hemos ido a otro recurso
		}else{
			//vamos a otro jsp
			RequestDispatcher rd = 
					request.getRequestDispatcher("incorrecto.html");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
