package test;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import entidad.Persona;
import webservice.PersonaWS;

public class TestWS {

	@Test
	public void testWS() {
		try {
			URL url = new URL("http://localhost:8080/_01_WebServicePersonas-0.0.1-SNAPSHOT/PersonaWSImplements?wsdl");
			QName qname = new QName("http://webservice/", "PersonaWSImplementsService");
			Service service = Service.create(url, qname);
			PersonaWS ws = service.getPort(PersonaWS.class);
			
			Persona p = new Persona();
			p.setNombre("Bart");
			p.setEdad(9);
			p.setPeso(50);
			ws.alta(p);//Generamos el mensaje SOAP al servicio WEB
			System.out.println("Test: Persona creada");
			
			p = ws.obtener(1);
			System.out.println("Test: Persona obtenida: " + p);
			
			p = ws.obtener(2);
			System.out.println("Test: Persona obtenida: " + p);
			
			boolean baja = ws.baja(2);
			System.out.println("Test: Persona dada de baja: " + baja);
			
			p = ws.obtener(2);
			System.out.println("Test: Persona obtenida: " + p);
			
			List<Persona> listaPersonas = ws.listar();
			System.out.println("Test: Lista personas " + listaPersonas);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}
}