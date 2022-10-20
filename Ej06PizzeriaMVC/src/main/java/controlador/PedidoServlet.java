package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Pizza;
import modelo.negocio.GestorPizza;

/**
 * Servlet implementation class PedidoServlet
 */
@WebServlet("/PedidoServlet")
public class PedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recogemos los datos del usuario
		String nombre = request.getParameter("nombre");
		String size = request.getParameter("size");
		String[] ingredientes = request.getParameterValues("ingredientes");
		
		Pizza pizza = new Pizza();
		pizza.setNombreCliente(nombre);
		pizza.setSize(size);
		if(ingredientes != null)
			pizza.setIngredientes(Arrays.asList(ingredientes));
		else {
			pizza.setIngredientes(new ArrayList<>());
		}
		
		GestorPizza gp = new GestorPizza();
		gp.calcularPrecio(pizza);
		
		RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
		request.setAttribute("pizza", pizza);
		rd.forward(request, response);
	}

}
