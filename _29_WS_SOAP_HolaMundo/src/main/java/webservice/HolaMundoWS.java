package webservice;

import java.util.Date;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//El webservice estará desplegado en la dirección
//http://localhost:8080/_29_WS_SOAP_HolaMundo-0.0.1-SNAPSHOT/HolaMundoWS

//Y su WSDL estará en 
//http://localhost:8080/_29_WS_SOAP_HolaMundo-0.0.1-SNAPSHOT/HolaMundoWS?wsdl
@WebService
public class HolaMundoWS implements HolaMundo{

	//Anotamos los métodos que queremos exportar para usar en nuestros clientes
	@WebMethod
	public String saludo() {
		Date date = new Date();
		String fecha = date.toLocaleString();
		String saludo = "Hola, la fecha de hoy es :" + fecha;
		return saludo;
	}

	@WebMethod
	@Oneway
	public void mensaje(@WebParam String cuerpo) {
		System.out.println("El mensaje del cliente es: " + cuerpo);		
	}

}
