package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet("/SegundoServlet")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SegundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		//Siempre que generemos una respuesta, es buena practica
		//decir el tipo de fichero que estamos enviando
		
		//El tipo de fichero qu estamos enviando va dentro de una 
		//cabecera HTTP, que se llama "content-type". El valor
		//es lo que se llama tipo MIME
		
		//Podemos entender el content type como la extensión de 
		//un fichero
		//https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types/Common_types
		response.setContentType("text/plain");
		pw.append("<html>");
		pw.append("<head>");
		pw.append("<title>PrimerServlet</title>");	
		pw.append("</head>");
		pw.append("<body>");
		pw.append("<p>Esto seria un segundo servlet</p>");	
		pw.append("</body>");
		pw.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
