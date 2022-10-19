package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Multiplicacion;
import modelo.negocio.GestorMultiplicacion;

@WebServlet("/MultiplicarServlet")
public class MultiplicarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNumero = request.getParameter("numero");
		//Recordemos que toda la información que llega es siempre en formato
		//cadena o String
		int iNumero = Integer.parseInt(sNumero);
		if(iNumero > 0){
			//Para hacerl el calculo, consultamos al modelo
			GestorMultiplicacion gm = new GestorMultiplicacion();
			
			List<Integer> tablaMultiplicar = gm.calcularTabla(iNumero);
			
			Multiplicacion multiplicacion = new Multiplicacion();
			multiplicacion.setNumero(iNumero);
			multiplicacion.setTablaMultiplicar(tablaMultiplicar);
			
			//Mandamos el objeto multiplicar a el JSP para que lo pinte
			//Mediante los atributos podemos mandar información de los Servlets
			//a los JSPs
			request.setAttribute("multiplicacion", multiplicacion);
			request.setAttribute("otroAtributo", "valorDelOtroAtributo");
			RequestDispatcher rd = 
					request.getRequestDispatcher("tablaMultiplicar.jsp");
			rd.forward(request, response);
		}else{
			//Mediante los atributos podemos mandar información de los Servlets
			//a los JSPs
			request.setAttribute("error", true);
			RequestDispatcher rd = 
					request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
