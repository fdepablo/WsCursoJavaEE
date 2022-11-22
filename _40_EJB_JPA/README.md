# EJB Y JPA

Este ejemplo esta con un proyecto EJB y un proyecto WEB metido dentro de de un EAR

## Configuración inicial

Debemos de poner el fichero "persistence.xml" dentro de la carpeta "META-INF". En el fichero debemos de establecer en la unidad de persistencia el tipo de transacción como JTA una anotación con el datasource (ver el fichero de este ejemplo).

Cuando trabajamos con servidores hay que establecer un datasource para acceder a la BBDD. La configuración del Datasource podemos darla en el fichero "standalone/configuration/standalone.xml".

Para trabajar con transacciones en JPA debemos de cambiar el tipo de transacción en el persistence.xml a JTA:

	transaction-type="JTA"
	
Por defecto, hay un datasource generado en wildfly llamado **java:jboss/datasources/ExampleDS** que trabaja con una base de datos H2 en memoria. Por lo tanto podemos poner la siguiente etiqueta debajo de la etiqueta "persistence-unit"

	<jta-data-source>java:jboss/datasources/ExampleDS</jta-data-source>

Con esto seria suficiente si queremos hacer que funcione la aplicación con una BBDD en memoria



