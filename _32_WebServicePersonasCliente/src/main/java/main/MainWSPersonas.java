package main;

import java.util.List;

import es.soap.ws.client.generated.Persona;
import es.soap.ws.client.generated.PersonaWS;
import es.soap.ws.client.generated.PersonaWSImplementsService;

public class MainWSPersonas {

	public static void main(String[] args) {
		
		PersonaWSImplementsService service = new PersonaWSImplementsService();
		
		PersonaWS ws = service.getPersonaWSImplementsPort();
		
		Persona p = new Persona();
		p.setNombre("Bart");
		p.setEdad(9);
		p.setPeso(50);
		ws.alta(p);
		System.out.println("Test: Persona creada");
		
		//Para que pinte las personas debemos de sobreescribir el método toString()
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

	}

}
