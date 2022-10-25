# Session Context

La sesión es un mecanismo dentro de las aplicaciones cliente-servidor para mantener información durante más tiempo que en una petición request. 

Uno de los problemas que tiene el protocolo HTTP es que es un protocolo que no guarda estado de conversación, es decir, cada petición HTTP es totalmente independiente de las demás.

Para solventar este problema, se creo el concepto de sesión el cual establece que durante un tiempo configurable tendremos un objeto el cual podremos almacenar información, por defecto en Tomcat la duruación del objeto es de 30 minutos desde la última petición HTTP.

La sesión se creará de dos maneras:

1. Entrando a un JSP, de manera automática cuando entremos en un JSP se crea una sesión.
2. Accediendo a el objeto session desde la request **request.getSession()** dentro de un Servlet.

La sesiones se crean en una tabla dentro del servidor de tipo mapa (clave-valor), donde la clave sería un número generado automáticamente que representa el id de session, y el valor representa un objeto de tipo HttpSession, en el cual podemos guardar atributos de igual manera que en la request.

Dicho número de id de session es único y hay que enviarlo al cliente para que nos lo pueda enviar de nuevo y así identificarle. La manera de enviar el token de session del servidor al cliente es dentro de una cabecera HTTP, y la manera que tendrá el cliente de enviarnos dicho token puede ser de dos maneras.

1. Mediante una cookie, llamada cookie de session. Las cookies son trozos de información clave-valor que se almacenan en el cliente (navegador web), y se envian al servidor SIEMPRE que se acceda al dicho servidor. Las cookies se envian dentro de una cabecera HTTP. Esta es la manera por defecto de crear la session en un servidor.

2. Mediante parametros de la request. Se enviaría el token de sesion dentro de la URL. Ej. http://www.mipaginaweb.com?idsession=123. Esta manera es peor ya que deja visible la sesion.

Toda la configuración de la session podemos hacerla dentro de descriptor de despliegue (web.xml). Para crear un descriptor de despliegue en una aplicacion web 3.0 o superior -> boton derecho sobre el proyecto  -> Java EE tools -> Generated deployment descriptor stub