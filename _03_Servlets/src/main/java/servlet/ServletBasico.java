package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//Para crear este Servlet creamos una clase que implemente la
//interfaz Servlet

//Una vez que creemos esta clase y la implementemos, debemos de 
//decirle al Tomcat que este Servlet queremos que lo gestione
//Para ello, debemos de darlo de alta en el web.xml
public class ServletBasico implements Servlet {

	@Override
	public void destroy() {
		System.out.println("destroy -> Me estoy destruyendo... Tomcat se esta apagando");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "ServletBasico v1.0";
	}

	//Hasta que no hagan una petición, este objeto ServletBasico no se creara
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init -> Tomcat esta creando una unica instancia de este objeto"
				+ " para toda la aplicación");
		System.out.println("init -> Este método solo se va a ejecutar una vez y cuando me lo pidan");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service -> Este método se va a ejecutar cada vez que me hagan una petición"
				+ " http");
		res.getWriter().append("Esto es la respueta");
	}

}
