package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletGenerico extends GenericServlet{
	private static final long serialVersionUID = 1;

	
	
	@Override
	public void init() throws ServletException {
		System.out.println("init -> Cargando ServletGenerico en el contexto");
	}



	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().append("service -> Llamada al ServletGenerico");
		
	}

}
