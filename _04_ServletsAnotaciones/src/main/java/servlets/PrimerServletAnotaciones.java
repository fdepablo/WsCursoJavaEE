package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Las anotaciones en java comienzan con "@" y se ponen encima de clases
//, de metodos o de atributos

//La idea de las anotaciones es agregar funcionalidad a las clases que
//las contengan

//Los servidores que tengan proyectos con el descriptor de despliegue
//3.0 o superior, haran una busqueda dentro de la aplicacion de anotaciones
//referentes a componentes web

//En este caso, la anotación @WebServlet es una combinación de las etiquetas
//servlet y servlet-mapping que vimos en el fichero web.xml

//Con esta anotación damos de alta un objeto de tipo PrimerServletAnotaciones
//en el servidor, y además lo mapeamos a la dirección que contenga dentro
//de la anotación

//Una de las desventajas de las anotaciones es que tenemos que crear la clase
//para poder anotarla. Dicho de otra manera, si nosotros importamos una librería
//de terceros y tiene un servlet que queremos dar de alta, nostros NO podemos
//anotar esa clase. En este caso, habria que darla de alta en el web.xml

//Para crear el web.xml -> boton derecho sobre el proyecto -> Jave EE Tools ->
//	-> Generated Deployment descriptor stub
@WebServlet("/anotaciones")
public class PrimerServletAnotaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("PrimerServletAnotaciones at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
