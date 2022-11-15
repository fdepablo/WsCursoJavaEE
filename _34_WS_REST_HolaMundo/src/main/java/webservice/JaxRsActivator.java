package webservice;

import javax.ws.rs.ApplicationPath;

import javax.ws.rs.core.Application;

//Con esta anotación estamos dando de alta el FaceController que vamos
//a utilizar para mapear todas las direcciones de nuestro servicio REST
//Todas las URLs que empiecen por "rest" van a entrar por dicho Servlet
//(o facecontroller). Sería equivalente al URL pattern
@ApplicationPath("/rest")
public class JaxRsActivator extends Application {
	
}