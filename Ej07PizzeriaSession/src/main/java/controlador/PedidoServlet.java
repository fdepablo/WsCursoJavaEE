package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Pedido;
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
		
		Pedido pedido = (Pedido)request.getSession().getAttribute("pedido");
		if(pedido == null) {
			pedido = new Pedido();
			List<Pizza> listaPizzas = new ArrayList<>();
			listaPizzas.add(pizza);
			pedido.setListaPizzas(listaPizzas);
			request.getSession().setAttribute("pedido",pedido);
		}else {
			List<Pizza> listaPizzas = pedido.getListaPizzas();
			listaPizzas.add(pizza);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("completado", "true");
		rd.forward(request, response);
	}

}
