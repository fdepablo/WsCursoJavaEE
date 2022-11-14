package webservice;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entidad.Persona;
import negocio.PersonaDao;

//http://localhost:8080/_01_WebServicePersonas-0.0.1-SNAPSHOT/PersonaWSImplements?wsdl
@WebService
public class PersonaWSImplements implements PersonaWS{
	
	@WebMethod
	@Oneway
	public void alta(@WebParam Persona persona) {
		System.out.println("Servicio: Alta persona: " + persona);
		PersonaDao gp = new PersonaDao();
		gp.alta(persona);
	}
	
	@WebMethod
	public Persona obtener(@WebParam int id) {
		System.out.println("Servicio: Obteniendo persona con id: " + id);
		PersonaDao gp = new PersonaDao();
		Persona p = gp.obtener(id);
		return p;
	}
	
	@WebMethod
	public boolean baja(@WebParam int id) {
		System.out.println("Servicio: Baja de persona con id: " + id);
		PersonaDao gp = new PersonaDao();
		boolean encontrada = gp.baja(id);
		return encontrada;
	}

	@WebMethod
	public List<Persona> listar() {
		PersonaDao gp = new PersonaDao();
		return gp.listar();
	}
	
	
}
