package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//Para entrar por este webservice, la URL tiene que tener "HolaMundo"
@Path("holaMundo")
public class HolaMundoWsRest {

	//Siempre que pongamos una URL en HTTP, debemos de poner un método asociado
	//(verbo o la acción al recurso)
	//GET http://localhost:8080/_34_WS_REST_HolaMundo/rest/holaMundo/mensaje
	@GET
	@Path("mensaje")
	//Con la anotación Produces establecemos el MIME TYPE del body que estamos
	//mandando al cliente, es decir, estamos estableciendo la cabecera 
	//"content-type" con el MIME TYPE que queremos.
	@Produces("text/plain")
	public String saludo() {
		System.out.println("Petición GET");
		return "Hola Mundo REST";
	}
	
	//POST http://localhost:8080/_34_WS_REST_HolaMundo/rest/holaMundo 
	@POST
	public String saludoPost() {
		System.out.println("Petición POST");
		return "HOLA MUNDO REST POST";
	}
	
	//GET http://localhost:8080/_34_WS_REST_HolaMundo/rest/holaMundo/mensajeHTML 
	@GET
	@Path("mensajeHTML")
	public String saludoHTML() {
		String mensaje = "";
		mensaje +="<html>";
		mensaje +="<body>";
		mensaje +="<h1>Hola Mundo con HTML</h1>";
		mensaje +="</body>";
		mensaje +="</html>";
		return mensaje;
	}
	
}
