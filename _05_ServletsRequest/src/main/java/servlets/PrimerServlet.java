package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	//Los objetos HttpServletRequest y HttpServletResponse que me llegan a este
	//metodo, los va a crear el servidor por mi y me va a pasar su referencia
	
	//De igual manera el ciclo de vida de ambos objetos la llevará el servidor
	//por (IoC).
	
	//El objeto HttpServletRequest va a contenter toda la información relativa 
	//a la petición del cliente
	//El objeto HttpServletResponse va a contener toda la información relativa
	//a la respuest del cliente
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando en el servidor");
		
		PrintWriter pw = response.getWriter();
		
		//El problema de los HTML es que son estaticos
		//mediante los Servlets podemos dar ese dinamismo
		//a las páginas
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<title>PrimerServlet</title>");	
		pw.append("</head>");
		pw.append("<body>");
		pw.append("<p>Esto es la prueba del día</p>");	
		//La clase Date da la fecha del sistema
		//Dentro guarda el numero de milisegundos pasados desde 1970
		Date date = new Date(); 
		pw.append("<h2>" + date.getTime() + "</h2>");	
		pw.append("<h2>" + date.toLocaleString() + "</h2>");
		
		//Podemos recoger los parametros que nos envia el cliente
		String parametroNombre = request.getParameter("nombrePersona");
		//Es importante notar que los pararmetros siemmpre llegan
		//en formato String, por lo que si enviamos un numero y 
		//queremos operar con el debemos de convertirlo
		String parametroEdad = request.getParameter("edadPersona");
		int edad = Integer.parseInt(parametroEdad);
		System.out.println(parametroNombre);
		System.out.println(parametroEdad);
		pw.append("<h1>Bienvenido Mr/Ms: " + parametroNombre);
		pw.append("<h1>Su edad es: " + edad);
		
		pw.append("<form action='SegundoServlet'>");
		//Vamos a pasar la edad al SegundoServlet en un campo oculto
		pw.append("<input type='hidden' name='edadPersona' value='"+ parametroEdad +"'/>");
		pw.append("<button>Pulsame</button>");
		pw.append("</form>");
		pw.append("</body>");
		pw.append("</html>");
	}

	//doPost llama a doGet, por lo que hacen lo mismo
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
