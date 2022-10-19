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
			request.setAttribute("error", true);
			//Ahora la request cambia por lo que la sentencia de arriba no tiene sentido
			//no tiene sentido guardar valores como atributo de request porque la
			//petición http es diferente y por lo tanto desapareceran todos los atributos
			//y parametros antiguos
			String mensajeError = "(Parametro) No se admite el numero 0";
			response.sendRedirect("index.jsp?parametroError=" + mensajeError);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
