package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuarios;

@WebServlet("/ListadoUsuariosServlet")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Si el usuario no se ha registrado del mandamos al login
		if(request.getSession().getAttribute("nombreUsuario") != null) {
			GestorUsuarios gu = new GestorUsuarios();
			List<Usuario> listaUsuarios = gu.getListaUsuarios();
			
			RequestDispatcher rd = request.getRequestDispatcher("listadoUsuarios.jsp");
			request.setAttribute("listaUsuarios", listaUsuarios);
			rd.forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
