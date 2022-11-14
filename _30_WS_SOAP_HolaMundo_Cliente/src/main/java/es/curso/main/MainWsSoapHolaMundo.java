package es.curso.main;

import es.curso.ws.client.generado.HolaMundo;
import es.curso.ws.client.generado.HolaMundoWSService;

public class MainWsSoapHolaMundo {

	public static void main(String[] args) {
		HolaMundoWSService service = new HolaMundoWSService();
		
		HolaMundo hm = service.getHolaMundoWSPort();
		
		System.out.println("Cliente generado: " + hm.saludo());
		
		hm.mensaje("Hola desde el cliente generado con Java :)");

	}

}
