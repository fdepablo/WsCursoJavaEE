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
	private int contador;//Todos los atributos numericos se inicializan a 0
	
	public LoginServlet() {
		contador = 0;
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		GestorUsuarios gu = new GestorUsuarios();
		boolean validado = gu.validarUsuario(usuario);
		
		if(validado){
			//Podemos acceder a los atributos de la request directamente
			//con el objeto request
			request.setAttribute("atributoRequest1", "Valor de atributo de request");
			//Podemos acceder a los atributos de la session a traves del
			//objeto request y mediante el método "getSession()"
			request.getSession().setAttribute("nombreUsuario",
					usuario.getNombre());
			//Podemos acceder a los atributos de la aplicación a través del
			//objeto request y mediante el método "getServletContext()"
			//En este caso vamos a guardar el número de veces que se me han
			//logueado los usuarios
			request.getServletContext().setAttribute("contadorLogins", ++contador);
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
