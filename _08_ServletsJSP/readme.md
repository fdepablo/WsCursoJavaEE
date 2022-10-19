# JSP y Servlets

Como hemos tanto JSPs como Servlets pueden procesar peticiones HTTP y también pueden generar HTML. Pero a efectos practicos es mejor dejar a los JSP como plantillas para mostrar la información y los Servlets como objetos que procesen las peticiones.

Digamos que dentro de un patrón MVC(modelo-vista-controlador), los JSPs serían la V (vista) y los servlets serían la C (controladores)

La idea del MVC es plantear un diseño para las aplicaciones basadas en un modelo cliente-servidor (web). Este patrón se basa en dividir la funcionalidad de una app web en varias partes.

1. El controlador debería de dedicarse solamente a procesar peticiones HTTP, mandar los datos al modelo y en base a lo que responda el modelo, mostrar la vista adecuada.

2. El modelo es la capa encargada de llevar la lógica de negocio y acceso a datos.

	- Servicios o gestores. Esta capa aplica las reglas de negocio de la aplicación.
	- Acceso a datos. Esta se encarga exclusivamente a acceder a al información de la app. Normalmente la información se traerá de BBDD. Aquí podemos encontrar objetos DAO (Data Access Objetc)
	- Entidades. Las entidades representan los objetos que tienen la información de la app.
	
3. La vista representa la interfaz de usuario. Es donde se va a presentar la información que queremos mostrar al usuario y la manera que el usuario interactuará con nuestra app.

## Contectando Servlets con JSP

En este ejemplo vamos a ver como podemos conectar un Servlet con un JSP de manera sencilla