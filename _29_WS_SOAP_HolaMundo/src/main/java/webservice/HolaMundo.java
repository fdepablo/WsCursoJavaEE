package webservice;

import javax.jws.WebService;

@WebService
public interface HolaMundo {
	/**
	 * Este método será para mandar un saludo a nuestro cliente
	 * 
	 * @return el saludo al cliente
	 */
	public String saludo();
	
	/**
	 * Recibir en el WS un mensaje de nuestro cliente
	 * @param cuerpo
	 */
	public void mensaje(String cuerpo);
}
