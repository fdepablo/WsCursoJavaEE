package webservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import modelo.entidad.Persona;
import modelo.persistencia.DaoPersona;

//En este ejemplo vamos a realizar un CRUD completo contra la entidad
//Persona. La bbdd esta simulado en memoria.
@Path("personas")
public class ControladorPersona {
	
	private DaoPersona daoPersona;
	
	//GET PERSONA POR ID
	//En este primer ejemplo vamos a configurar endpoint(punto de acceso) para
	//devolver una persona por ID. Como nos marca REST, al ser una busqueda
	//por clave primaria, el ID debe ir como parte del PATH de la URL.
	//Esto lo hacemos por medio del atributo "@Path="{id}"
	//Podemos obtener el ID usando la anotacion @PathParam("id") dentro
	//de un parametro de entrada. El "id" se corresponde con el "{id}",
	//es decir, deben de llamarse igual.
	
	//Ademas, queremos que el resultado sea JSON. JEE serializara
	//automaticamente el resultado a json a traves de las librerías Jackson
	//Esto lo hacemos mediante la anotación @Produces. Recordemos que todas
	//las respuestas van dentro del BODY del mensaje HTTP
	
	//Por ultimo, no nos olvidemos que tenemos que responder adecuadamente
	//con el codigo de respuesta apropieado, segun nos marca el protocolo HTTP.
	//Para ello usaremos la clase "Response" que nos permite encapsular 
	//tanto el resultado en json como el codigo del mensaje. En este caso 
	//el codigo 200 "OK" si existe o 404 NOT FOUND si no existe
	
	//La URL para acceder a este metodo sería: 
	//NOTA, se ha quedado el nombre del war (desplegable) como el nombre del proyecto
	//original, que era "_03_RestPersonas"
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/ID" y el metodo a usar seria GET
	//ID sería el identificador que queremos buscar
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Response getPersona(@PathParam("id") int id) {
		System.out.println("Buscando persona con id: " + id);
		daoPersona = new DaoPersona();
		Persona p = daoPersona.get(id);
		if(p != null) {
			return Response.status(Response.Status.OK).entity(p).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	//POST 
	//En este caso vamos a dar de alta una persona, para ello usaremos
	//el metodo POST, vamos a producir tambien JSON (produces) y el 
	//formato que nos tiene que enviar el cliente tambien tiene que ser
	//JSON (consumes). La persona nos tiene que llegar sin ID, ya que
	//seremos nosotros quien le pongamos dicho ID.
	
	//En este caso devolveremos la persona creada (ya que seremos nosotros
	//los que le asignemos el ID) y el codigo de respuesta 201 CREATED
	
	//La URL para acceder a este metodo sería: 
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas" y el metodo a usar seria POST
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response altaPersona(Persona p) {
		System.out.println("altaPersona: objeto persona: " + p);
		daoPersona = new DaoPersona();
		daoPersona.add(p);
		return Response.status(Response.Status.CREATED).entity(p).build();//201 CREATED
	}
	
	//GET LISTA PERSONAS
	//La URL para acceder a este metodo en caso de querer todas las personas
	//sería: 
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas" y el metodo a usar seria GET
	//Si queremos filtrar por nombre entonces deberemos usar:
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas?nombre=NOMBRE_A_FILTRAR"
	@GET
	@Produces("application/json")
	public Response listarPersonas(@QueryParam("nombre") String nombre) {
		List<Persona> listaPersonas = null;
		daoPersona = new DaoPersona();
		//Si no me viene el nombre, devolvemos toda la lista
		if(nombre == null) {
			System.out.println("Listando las personas");
			listaPersonas = daoPersona.list();			
		}else {
			System.out.println("Listando las personas por nombre: " + nombre);
			listaPersonas = daoPersona.listByNombre(nombre);
		}
		System.out.println(listaPersonas);
		return Response.status(Response.Status.OK).entity(listaPersonas).build();//200 OK
	}
	
	//PUT
	//En este caso vamos a hacer una modificación de persona por ID
	//Para seguir lo que nos marca REST, el ID lo recibiremos en el PATH
	//y los datos por JSON dentro del body del mensaje HTTP.
	
	//Si todo ha ido bien devolvemos el codigo de respuesta de 200 OK,
	//si id de la persona no existe devolvemos 404 NOT FOUND
	
	//La URL para acceder a este metodo sería: 
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/ID" y el metodo a usar seria PUT
	//Pasandole la persona sin el ID dentro del body del HTTP request
	@PUT
	@Path("{id}")
	@Consumes("application/json")
	public Response modificarPersona(@PathParam("id") int id, Persona p) {
		System.out.println("ID a modificar: " + id);
		System.out.println("Datos a modificar: " + p);
		daoPersona = new DaoPersona();
		p.setId(id);
		Persona pUpdate = daoPersona.update(p);
		if(pUpdate != null) {
			return Response.status(Response.Status.OK).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	//DELETE
	//Aqui vamos a borar una persona a traves de un ID que le pasemos en el
	//PATH.
	
	//Si todo ha ido bien devolvemos el codigo de respuesta de 200 OK y
	//devolvemos la persona que hemos borrado
	
	//La URL para acceder a este metodo sería: 
	//"http://localhost:8080/_03_RestPersonas-0.0.1-SNAPSHOT/rest/personas/ID" y el metodo a usar seria DELETE
	@DELETE
	@Path("{id}")
	@Produces("application/json")
	public Response borrarPersona(@PathParam("id") int id) {
		System.out.println("ID a borrar: " + id);
		daoPersona = new DaoPersona();
		Persona p = daoPersona.delete(id);
		if(p != null) {
			return Response.status(Response.Status.OK).entity(p).build();
		}else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	@OPTIONS
	@Produces({"text/plain"})
	public String optionPeticion() {
		String s =  "Metodos soportados";
		s += "/personas({id} GET -> Solicitar la persona:";
		s += " 200 -> exista la persona";
		s += " 404 -> no existe la persona";
		s += " (ponemos el resto de metodos soportados)";
		return s;
	}
}
