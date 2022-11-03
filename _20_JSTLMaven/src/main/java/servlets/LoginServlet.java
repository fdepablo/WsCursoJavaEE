package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuarios;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		GestorUsuarios gu = new GestorUsuarios();
		boolean validado = gu.validarUsuario(usuario);
		
		if(validado){
			//request.setAttribute("nombreUsuario", usuario.getNombre());
			//Una vez que sepa que el usuario esta validado, meto su nombre
			//dentro de la sessión para poder acceder a él desde cualquier parte
			//de la aplicación durante todo el ciclo de vida de la sesión.
			
			//Además me va a servir para saber que el usuario se ha registrado
			//correctamente
			request.getSession().setAttribute("nombreUsuario",
					usuario.getNombre());
			RequestDispatcher rd = 
					request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}else{
			String error = "El nombre '" + usuario.getNombre() +
					"' o no existe o no corresponde con el password";
			response.sendRedirect("login.jsp?error=" + error);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
