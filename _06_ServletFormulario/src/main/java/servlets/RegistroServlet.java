package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuarios;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet -> Entrando");

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//Este metodo nos devuelve un array de caracteres
		//El problema de estos arrays es que su numero de elementos
		//es fijo
		String[] intereses = request.getParameterValues("intereses");
		
		String sSexo = request.getParameter("sexo");
	
		System.out.println(email + "," + password + "," 
				+ Arrays.toString(intereses) 
				+ "," + sSexo);
		
		//Por cada petición me creo un nuevo usuario
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setPassword(password);
		usuario.setSexo(sSexo);
		
		//Nos llega un array de Strings, lo tenemos que convertir a una lista
		List<String> listaIntereses = Arrays.asList(intereses);
		usuario.setListaIntereses(listaIntereses);
		
		GestorUsuarios gu = new GestorUsuarios();
		boolean registrado = gu.registrar(usuario);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		if(registrado){
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<p>");
			pw.print("Usuario dado de alta");
			pw.println("</p>");
			List<Usuario> listaUsuarios = gu.getListUsuarios();
			pw.println("<hr/>");
			pw.println("<ol>");
			for(Usuario u : listaUsuarios) {
				pw.println("<li>");
				pw.println(u.toString());
				pw.println("</li>");
			}
			pw.println("</ol>");
			pw.println("</body>");
			pw.println("</html>");
		}else{
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<h1>Usuario NO se ha dado de alta, el email debe de estar relleno</h1>");
			pw.println("</body>");
			pw.println("</html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
