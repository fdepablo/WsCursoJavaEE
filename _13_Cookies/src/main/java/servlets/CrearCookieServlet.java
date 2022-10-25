package servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CrearCookieServlet")
public class CrearCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Las cookies son fragmentos de información que enviamos al servidor en formato
		//clave-valor. La clave será de tipo String y el valor será de tipo String
		
		//Las cookies se guardarán dentro del navegador del cliente. Ojo! No se guardan
		//en todos los navegadores, cada navegador tiene sus cookies.
		
		//Las cookies están asociadas a un servidor y a un puerto. Por ejemplo,
		//en este caso las cookies que creamos están asociadas al servidor
		//localhost y al puerto 8080.
		
		//Podemos ver las cookies si pulsamos F12 en el navegador e irnos a la
		//pestaña almacenamiento
		
		//Además, las cookies son compartidas por TODAS las pestañas del navegador.
		//La única excepción es si abrimos una ventana de incognito o privado.
		
		//Para crear una cookie usarmos la clase "Cookie" y dentro del constructor
		//daremos su clave-valor
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = localDateTime.toLocalDate();//Cojemos la fecha del servidor
		
		Cookie cookie = new Cookie("fechaPrimeraConexion",
				localDate.toString());
		//Una vez creada, tenemos que agregarla al objeto response para que la mande
		//al navegador
		response.addCookie(cookie);		
		//Las cookies se envian al navegador del cliente dentro de la cabecera HTTP
		//"Set-Cookie: <cookie-name>=<cookie-value>"
		//Ej:
		//Http 1.1 200 OK
		//Set-Cookie: fechaPrimeraConexion=25/10/2022
		
		//Podemos establecer todas las cookies que queramos
		String hora = String.valueOf(localDateTime.getHour());
		String minutos = String.valueOf(localDateTime.getMinute());
		String segundos = String.valueOf(localDateTime.getSecond());
		String horaTotal = hora + ":" + minutos + ":" + segundos;
		cookie = new Cookie("horaPrimeraConexion", horaTotal);
		response.addCookie(cookie);	
		
		RequestDispatcher rd = request.getRequestDispatcher("crearCookie.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
