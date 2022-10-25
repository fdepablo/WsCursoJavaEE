package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LeerCookieServlet")
public class LeerCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Las cookies siempre se envian desde el cliente al servidor de manera
		//automática dentro de la request
		
		//Podemos leerlas de la siguiente manera
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			//Si me llegan cookies, iteramos el array para sacar sus datos
			for(Cookie cookie : cookies){
				System.out.println("Clave cookie: " + cookie.getName());
				System.out.println("Valor cookie: " + cookie.getValue());
				if(cookie.getName().equals("fechaPrimeraConexion")){
					//podemos guardar valores dentro de los diferentes scopes
					request.setAttribute("fechaPrimeraConexion", cookie.getValue());
				}
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("leerCookie.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
