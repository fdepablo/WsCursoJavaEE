package test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import webservice.HolaMundo;

//Para probar una clase con @Test
//Boton derecho sobre la clase -> Run us -> JUnit Test
public class TestHolaMundo {

	@Test
	public void probarHolaMundo() {
		try {
			URL url = new URL("http://localhost:8080/_29_WS_SOAP_HolaMundo-0.0.1-SNAPSHOT/HolaMundoWS?wsdl");
			//Los siguientes datos los sacamos del WSDL
			//targetNamespace="http://webservice/"
			//<wsdl:service name="HolaMundoWSService">
			//Tambien podemos sacarlo del "serviceName" cuando arrancamos el servicio SOAP en el 
			//log del JBOSS
			QName qname = new QName("http://webservice/", "HolaMundoWSService");
			Service service = Service.create(url, qname);
			//Importante, aquí tenemos que trabajar con la interfaz
			HolaMundo ws = service.getPort(HolaMundo.class);
			
			System.out.println(ws.saludo());
			
			ws.mensaje("Hola desde la clase de Test :)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
