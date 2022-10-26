# JSF

## Creación de proyecto en eclipse

Pasos que seguir para crear un proyecto JSF en eclipse

1. Crear un proyecto web normal
2. En propiedades del proyecto, dentro de **Proyect Faces**, marcar la opción de JSF 2.2
3. Nos pide que configuremos las librerías,  cuando tengamos que elegirlas le decimos que no queremos añadirlas ahora (Aunque sería otra opción para configurar JSF). Elegimos la opción "Disabled library configuration".
4. Add la runtime de tomcat dentro del **Proyect Faces**, aplicamos y aceptamos (en caso necesario)
5. Copiar las librería **javax.faces.jar** en la carpeta lib del proyecto. <https://mvnrepository.com/artifact/com.sun.faces/jsf-api/2.2.20>
6. Agregamos el mapeo del Servlet de JSF en el fichero web.xml (en caso necesario)

	<display-name>ProyectoJSF</display-name>
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

7. Creamos el fichero **faces-config.xml** dentro del directorio **WEB-INF** (en caso necesario)

	<?xml version="1.0" encoding="UTF-8"?>
	<faces-config
	    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd"
	    version="2.2">
	
	</faces-config>
	
7. Crear una página JSF, para ello damos a new html, renombramos el html a xhtml, le damos a siguiente y ahí elegimos una plantilla de JSF, la primera opción de "blank JSF Page".
8. Crear un texto de salida

	<h:body>
		<h:outputText style="color:red" value="valor"></h:outputText>
	</h:body>
	
9. Ejecutamos en tomcat la página creada y si lo hemos hecho bien, debe de aparecer el mensaje

## Bibliografía

- <https://www.apuntesdejava.com/p/tutorial-jsf-22.html>
- <https://docs.oracle.com/javaee/7/tutorial/jsf-intro.htm>

