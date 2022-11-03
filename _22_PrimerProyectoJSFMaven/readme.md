# JSF 

## Creación de un proyecto JSF con Maven

Pasos a seguir para crear este proyecto en eclipse

1. Crear un proyecto web normal
2. Convertir el proyecto a maven
3. Agregamos las dependencias al pom.xml

	  <dependencies>
		<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
		<dependency>
		    <groupId>com.sun.faces</groupId>
		    <artifactId>jsf-api</artifactId>
		    <version>2.2.20</version>
		</dependency>
		
		<dependency>
			 <groupId>com.sun.faces</groupId>
			 <artifactId>jsf-impl</artifactId>
			 <version>2.2.20</version>
		</dependency>	  
	  </dependencies>
	  
4. Creamos el web.xml y agregamos el FacetServlet como front controller

	<display-name>PrimerProyectoJSF</display-name>
	  <welcome-file-list>
	    <welcome-file>index.html</welcome-file>
	  </welcome-file-list>
	  <servlet>
	    <servlet-name>Faces Servlet</servlet-name>
	    <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
	    <load-on-startup>1</load-on-startup>
	  </servlet>
	  <servlet-mapping>
	    <servlet-name>Faces Servlet</servlet-name>
	    <url-pattern>*.xhtml</url-pattern>
	</servlet-mapping>
	  
	<!-- Si no establecemos este parametro, no podemos poner comentarios en nuestros .xhtml -->
	<context-param>
		<param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
		<param-value>true</param-value>
	</context-param>
	  
5. Creamos el fichero **faces-config.xml** dentro del directorio **WEB-INF**

	<?xml version="1.0" encoding="UTF-8"?>
	<faces-config
	    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd"
	    version="2.2">
	
	</faces-config>
	
6. Crear una página JSF, para ello damos a new html, renombramos el html a xhtml, le damos a siguiente y ahí elegimos una plantilla de JSF, la primera opción de la template y luego le quitamos todo lo que ha generado menos el html con los namespace de JSF 

7. Creamos un texto de salida

	<h:body>
		<h:outputText style="color:red" value="valor"></h:outputText>
	</h:body>
	
8. Ejecutamos tomcat y deberia aparecer el mensaje