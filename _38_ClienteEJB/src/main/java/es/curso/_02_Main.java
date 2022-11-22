package es.curso;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import es.curso.ejb.interfaz.GestorFrases;


//Este proyecto tiene que tener en el classpath _02_EJBStatelessClient
public class _02_Main {
	
	//Este dato lo podemos sacar del servidor cuando se despliegue el EJB
	private static String JNDI_EJB = "ejb:_38_EJB_StatelessEAR/_38_EJB_Stateless/GestorFrasesEJB!es.curso.ejb.interfaz.GestorFrases";
	
	public static void main(String[] args) throws NamingException {
		System.out.println("Arrancando cliente 02 EJB Stateless");

		Properties prop = cargarPropiedadesConexion();
		Context context = new InitialContext(prop);
		
		//En este caso pedimos un EJB sin estado al contenedor de EJB
		//Normalmente tiene un pool de EJB y nos dará uno aleatoriamente
		//Cuando el cliente ha acabado de usar el objeto, regresa al pool
		//para que pueda ser usado por otro cliente. Esto solo ocurre
		//con los EJB de session stateless
		
		//Wildfly tiene por defecto UN SOLO EJB por lo que siempre trabajaremos
		//con el mismo a no ser que cambiaramos este comportamiento
		GestorFrases gf = (GestorFrases) context.lookup(JNDI_EJB);
		gf.escribir("Un poder implica una gran responsabilidad");
		gf.escribir("Vine, vi y vencí");
		
		System.out.println(gf.obtenerFrases());
				
		System.out.println(gf.obtenerFraseAleatoria());
		System.out.println(gf.obtenerFraseAleatoria());
		
		System.out.println("Fin cliente 02 EJB Stateless");
	}
	
	public static Properties cargarPropiedadesConexion() {
		Properties prop = new Properties();
		//Establecemos la factoria de clases para conectarnos
		prop.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.wildfly.naming.client.WildFlyInitialContextFactory");
		//Definimos el esquema de conexión
		prop.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		return prop;
	}
}
