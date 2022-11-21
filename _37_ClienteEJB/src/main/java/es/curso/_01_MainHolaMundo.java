package es.curso;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import es.curso.ejb.interfaz.HolaMundo;


public class _01_MainHolaMundo {
	
	//Debemos de saber el nombre del EJB con el que se ha dado de alta en el servidor
	//de aplicaciones. Cuando desplegamos un EJB automáticamente se dará de alta
	//en el aplicación JNDI con un nombre, podemos consultar ese nombre al deplegar
	//el EJB. Vamos a escoger el que tenga el siguiente formato:

	//ejb:NOMBRE_PROYECTO_EAR/NOMBRE_PROYECTO_EJB/NOMBRE_EJB!NOMBRE_COMPLETO_INTERFAZ_REMOTA_EJB
	
	//Este dato lo podemos sacar del servidor cuando se despliegue el EJB y lo arranquemos
	private static String JNDI_EJB = "ejb:_37_EJB_HolaMundoEAR/_37_EJB_HolaMundo/HolaMundoEJB!es.curso.ejb.interfaz.HolaMundo";
	
	public static void main(String[] args) throws NamingException {
		System.out.println("Arrancando cliente EJB 01");

		//Lo primero que tenemos que hacer es cargar las propiedades de conexión
		//Estas propiedades dependeran de diversos factores, como puede ser el 
		//tipo de servidor JEE que usemos, la dirección del JNDI que queremos buscar,etc.
		Properties prop = cargarPropiedades();
		//Creamos el contexto de la aplicaciones y le agregamos las propiedades
		//A partir de este contexto accederemos al JNDI que nos devolverá un objeto
		//proxy que nos permitirá apuntar al EJB real. Para referenciar a dicho objeto
		//proxy usaremos la interfaz remota.
		Context context = new InitialContext(prop);
		
		//Con el método "lookup" pedimos el objeto proxy para acceder al objeto EJB
		//Un objeto proxy es un objeto que simula ser otro objeto y que tiene
		//la propiedad de poder acceder al objeto real.
		HolaMundo hm = (HolaMundo) context.lookup(JNDI_EJB);
		//A partir del objeto proxy accedemos a los métodos reales del EJB
		System.out.println("Cliente EJB 01 -> invocando el método bienvenida");
		System.out.println(hm.bienvenida());
		System.out.println("Fin cliente EJB 01");
	}
	
	public static Properties cargarPropiedades() {
		Properties prop = new Properties();
		//Establecemos la factoria de clases para conectarnos al JNDI. Esta factoria
		//depende del servidor jee. Esta clase que estamos usando la importamos
		//como dependencia en el pom.xml
		prop.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.wildfly.naming.client.WildFlyInitialContextFactory");
		//Definimos el esquema de conexión del JNDI
		prop.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		return prop;
	}
}
