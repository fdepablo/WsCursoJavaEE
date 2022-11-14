# Cliente Web Services SOAP

Para trabajar con WS SOAP debemos de generar un mensaje SOAP y mandarlo a un endpoint que este desplegado en algún servidor.

Para generar un mensaje SOAP deberiamos basarnos en un WSDL para ver la estructura y sacar todo el formato. Esto suele ser también bastante tedioso, por lo que normalmente nos basaremos en clases para generar dicho mensaje SOAP.

## Configuración del pom.xml

Nuestro proyecto debe estar configurado de la siguiente manera:

1. Un plugin de maven que sea capaz de generar las clases de conexión.
2. Unas librerías para generar las clases de conexión

Ver pom.xml para tomarlo como ejemplo.


