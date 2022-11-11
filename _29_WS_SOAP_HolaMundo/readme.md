# Web Services

Tenemos dos grandes grupos de servidores Web.

1. Basados en mensajes SOAP (WebService o WebService SOAP)
2. Basados en REST (WebService REST, WebService Restful, API REST)

En este ejemplo vamos a ver el primer tipo.

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

## Programar un WebService SOAP

Existen 2 aproximaciones a la hora de hacer un servicio SOAP

1. A partir de un fichero WSDL (debemos de crear el fichero WSDL a mano, muy tediosa)
2. Creando las clases en Java y usar las anotaciones de WebService que necesitemos (muy amigable).

En este ejemmplo vamos a hacer un pequeño WebService SOAP sencillo anotando las clases que creemos.

Pasos:

1. Tenemos que crear una interfaz que donde podremos las operaciones que podemos hacer con nuestro WS. Dicha interfaz tenemos que anotarla adecuadamente -> webservice.HolaMundo

2. Crear una clase a partir de la interfaz y anotarla también adecuadamente

3. Probar que lo hemos hecho adecuadamente, para ello debemos de incluir una serie de librerías en nuestro pom.xml. Convertir el proyecto a un proyecto maven y mirar este pom.xml como ejemplo.

4. Crear el paquete src/test/java para hacer las pruebas con JUNIT. Maven por defecto lo crea, podemos ir al build path -> Source para crearlo desde ahi (doble click sobre la carpeta de test).

5. Dentro de src/test/java hacer las pruebas unitarias para conectarnos a WS.

## Ruta de despliegue de los proyectos de WildFly

{RUTA_WILDFLY}\standalone\deployments
