package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import entidad.Coche;

@Path("coches")
public class CocheWS {

	//GET http://localhost:8080/_34_WS_REST_HolaMundo/rest/coches
	@GET
	//Al ser JSON un formato de intercambio muy habitual en los servicios REST
	//normalmente los servidores de aplicaciones convertiran el objeto a 
	//formato JSON simplemente estableciendo el content-type a "application/json"
	//con la anotación @Produces. Normalmente lo hacen con las librerías Jackson
	@Produces("application/json")//El tipo de dato que estamos mandando
	public Coche obtener() {
		Coche c = new Coche();
		c.setId(1);
		c.setModelo("TT");
		c.setMarca("Audi");
		c.setMatricula("DFR-3456");
		/*
		 * No tenemos que convertir el objeto a JSON, lo hace Wildfly por nosotros
		Gson gson = new Gson();
		String json = gson.toJson(c);*/
		return c;
	}
}
