# Web Services

Tenemos dos grandes grupos de servidores Web.

1. Basados en mensajes SOAP (WebService o WebService SOAP)
2. Basados en REST (WebService REST, WebService Restful, API REST)

En este ejemplo vamos a ver el segundo tipo.

Para ello vamos a utilizar un servidor de aplicaciones **wildfly** que nos viene con todas las librerías necesarias. Este tipo de servidor lo usaremos tanto para SOAP como para REST.

Tambíen podriamos usar un servidor TOMCAT y añadirle las librerías de SOAP o de REST.

## Configuración Wildfly

1. Bajarnos Wildfly de la página oficial. Nosotros trabajaremos con la version 23.0.2. <https://www.wildfly.org/downloads/>

2. Configurar nuestro eclipse con wildfly para poder usarlo en nuestros proyectos. Para ello debemos de instalar un plugin que esta en el marketplace.

	Help -> Eclipse Marketplace
	
3. Una vez aquí debemos de buscar el plugin "JBoss Tools", en el momento de esta guia nos bajamos la versión "4.25"

4. Pulsamos "instalar" y aceptamos los acuerdos y confirmamos todo. Luego tenemos que reiniciar Eclipse.

5. Configurar Wildfly. Para ello:

	Windows -> Preferencias -> Server -> Server Runtime -> Add -> JBoss Comunity -> Wildfly 23
	
6. En la pantalla de configuración elejimos la carpeta donde descomprimimos el Wildfly y la versión de java que usemos

7. Pulsamos "finish" y aplicamos.

8. En la pestaña "Server" agregamos una instancia del Wildfly 23 que hemos configurado.

	"Click to add new Server" o boton derecho "new Server" -> Seleccionamos Wildfly 23 -> Finish
	
9. Podemos arrancar el Wildfly 23 para comprobar que todo esta bien


## Crear un proyecto WebService

Para ello hacemos los mismo pasos que cuando creamos un proyecto web normal, es decir, elejimos "dinamyc web proyect".

Lo único, que ahora debemos de elegir como runtime la de "wildfly 23"

Si nos da algún error, debemos ir a la pestaña "Markers" para ver si hay algún problema.

El tipico es que la versión de Java del proyecto, no la tenemos instalada, para cambiar esto debemos de ir al classpath

	boton derecho sobre el proyecto -> build path -> configure build path -> y vamos a la pestaña "libraries"
	
Una vez ahí, cambiamos la configuración para usar la versión de java que queramos.

Es posible que en los proyectos web, de algún problema en con la configuración web. Para ello debemos de ir a

	boton derecho sobre el proyecto -> properties -> Proyect Facets
	
Una vez en "Proyect Facets" comprobar que la configuración web es correcta.

## Programar un WebService REST

A diferencia de los servicios SOAP aquí no tenemos un fichero WSDL donde definiremos nuestro servicio. REST esta fuertemente basado en el protocolo HTTP, por lo que tendremos básicamente recursos mapeados a URLs y las acciones que queramos hacer sobre dichos recursos serán las del los verbos HTTP.

El primer paso sera dar de alta un servlet que haga de funciones de Facecontroller y nos ayude a mapear las URLs que escriban los clientes (mismo caso que otros frameworks como JSF, Spring MVC...). Este servlet se puede dar de alta por anotaciones (En JBOSS) o por web.xml.

En nuestro caso vamos a crear una clase en el paquete webservice para darlo de alta. La clase se llamará **JaxRsActivator**

## Ruta de despliegue de los proyectos de WildFly

{{RUTA_WILDFLY}\standalone\deployments
