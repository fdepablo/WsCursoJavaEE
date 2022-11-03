# Configuración de un proyecto Maven en Eclipse

Maven es una herramienta de software para la gestión y construcción de proyectos Java. Nos ayuda a gestionar el ciclo de vida de una aplicación java.

Maven utiliza un Project Object Model (POM) para describir el proyecto de software a construir, sus dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos. Viene con objetivos predefinidos para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado. 

Para realizar un proyecto Maven en eclipse:

1. File -> new -> Maven proyect. Aceptamos.

2. Checkear la opción "Create a simple proyect", para hacerlo de la manera más sencilla

3. En la pantalla que nos sale de configuración de proyecto debemos dar el nombre del grupo y el nombre del artefacto:
	
    - <b>Nombre del grupo</b>, será la agrupación del proyecto, muchos proyectos tienen un mismo grupo. Podríamos entenderlo como el nombre de la compañía que ha hecho el proyecto. Tiene formato de paquete en java. Ejemplos:
        - com.empresa.departamento
        - com.felix
        - es.felix
        - es.dgt.puntos
		
    - <b>Nombre del artefacto</b>, sería el propio nombre del proyecto. Ejemplos: 
        - NombreProyecto
        - Minecraft
        - WhatsApp
        - 30_Maven
    - La combinación de nombre del grupo junto con el nombre del proyecto, deberá de ser <b>UNICA</b> en el mundo

4. Un proyecto Maven tiene una estructura de carpetas y paquetes establecida por defecto, esto es para que todos los proyectos Maven del mundo sean lo más parecidos posibles.
Entre las carpetas y paquetes más importantes encontraremos:

    - <b>src/main/java</b>, esta carpeta es donde pondremos todos nuestros ficheros fuente del proyecto. Es de las carpetas más importantes.
    - <b>src/main/resources</b>, en esta carpeta pondremos todos los ficheros que son recursos de nuestra aplicación. Por ejemplo, un fichero .txt que será leído, un fichero .dat que servirá para guardar objetos de nuestra aplicación, un fichero. properties, un fichero de configuración, etc.
    - <b>src/test/java</b>, igual que la carpeta 3.1 pero para realzar las pruebas de nuestra aplicación
    - <b>src/test/resources</b>, igual que la carpeta 3.2 pero para realzar las pruebas de nuestra aplicación
    - <b>Maven dependecies</b>, aquí podemos ver todos las librerías (.jar) que van a ser usadas en nuestro proyecto. Se configuran en el fichero pom.xml
    - <b>target</b>, principalmente podremos encontrar los ejecutables de nuestro proyecto
    - <b>src</b>, donde están los fuentes finales del proyecto
    - <b>pom.xml</b>, es el fichero más importante de un proyecto MAVEN. Es donde controlaremos el ciclo 	de vida de nuestro proyecto, desde con que versión de java trabajaremos, que librerías queremos usar, hasta como queremos generar el ejecutable o desplegable de nuestro proyecto. Este fichero es donde tenemos que ir para configurar todo nuestro proyecto.
	
5. Una vez configurado el fichero pom.xml, podemos empezar a realizar nuestro proyecto, normalmente en src/main/java. Para este ejemplo hemos usado la librería de PDF que hemos añadido a nuestras dependencias. Ver el fichero pom.xml para ver más detalles de configuración.
	
	
## Bibliografía
https://maven.apache.org/
