# EJB

El objetivo de los EJBs es centralizar la lógica de negocio que hay dentro de un servidor de aplicaciones. Por ejemplo, si tenemos muchas aplicaciones que piden un sistema de logeo, podemos centralizar todas las peticiones a la BBDD en un mismo EJB, en vez de tenerlo separado en todas las aplicaciones. También tienen como objetivo gestionar la transaccionalidad de una aplicación, es decir, que se ejecuten varias modificaciones a la BBDD de manera atómica (como si fuera una única modificación),

Normalmente los EJB van dentro de un fichero **.ear**. Un fichero "ear" puede tener **.war** y **.jar**. Los EJB son proyectos que se convierten en ficheros **.jar**.

Además, si queremos hacer que un EJB pueda ser accedido por otras aplicaciones, tienen que tener un cliente para acceder a ellos.

Por último, tendremos que crear la aplicación cliente que use el EJB Cliente para conectarse al EJB

Así pues, para este ejemplo vamos a tener 4 proyectos diferentes, el EJB, el EAR, el EJB Client y el cliente java.

## Creación de los proyectos EJB

Pasos para crear un proyecto EJB:

1. Crear un proyecto EJB(EJB_HolaMundo). Para ello: 

	- file -> new -> EJB Proyect 
	
Dentro de las opciones de configuración asegurarse de marcar la opción de crear EAR, y darle algún nombre (EJB_HolaMundoEAR)

2. Crear tambien el proyecto Cliente en las opciones, esto es por defecto (EJB_HolaMundoClient), podemos asegurarnos de que se va a crear si pulsamos 2 veces next desde la pantalla de crear un proyecto EJB (paso 1)
3. Se crearan 3 proyectos, EAR(EJB_HolaMundoEAR), EJB(EJB_HolaMundo) y Cliente EJB(EJB_HolaMundoClient).
4. Si da algún error comprobar el **classpath**, **java compiler** y **Proyect Facets**. Podemos ir a la pestaña "Markers" para ver los errores.
5. En el cliente EJB (EJB_HolaMundoClient) creamos las interfaces remotas para conectarnos a nuestro EJB.
6. En el EJB(EJB_HolaMundo) creamos el EJB implementando la interface remota del cliente y anotandolo para darlo de alta.
7. Para probar que todo ha ido bien, podemos meter el EAR en el servidor JEE (wildfly) y arrancarlo para ver si da algún error.
8. Creamos un proyecto Java (ClienteEJB) con maven, que será el que consuma el EJB a traves del proyecto EJB Client.
9. Importamos las librerías necesarias en el proyecto java cliente(ClienteEJB). Ver el pom.xml para ver la configuración.	
10. Agregamos el proyecto EJB Client (EJB_HolaMundoClient) al classpath del proyecto java cliente(ClienteEJB) para poder ver la interfaz remota: 

	boton derecho sobre el proyecto -> build path -> configure build path -> proyects -> classpath -> add -> Buscamos el proyecto EJB_HolaMundoClient -> OK -> apply and close

11. Creamos la clase main dentro del proyecto java cliente(ClienteEJB), creamos las propiedades de conexión al EJB e invocamos el EJB a traves de la interfaz remota (ver la clase).
	
## Bibliografía

- <https://www.tutorialspoint.com/ejb/index.htm>

- <http://developinginspanish.com/2018/04/04/introduccion-a-los-ejb-parte-1/>
