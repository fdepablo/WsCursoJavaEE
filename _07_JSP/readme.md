# JSP (Java Server Page)

Una página **JSP** es un componente que forma parte de una aplicación web Java EE y, al igual que los servlets, se ejecuta ante la llegada de peticiones desde el navegador cliente, generando como resultado una página HTML que es enviada en la respuesta HTTP.

JSP son archivos de texto con extensión .jsp, en los que se pueden combinar bloques de texto HTML y código Java que se ejecutará en el servidor cuando la página sea solicitada. En principio, su misión esta más especializada en la generación de respuestas que en la atención de peticiones. Normalmente, las peticiones son procesadas por un Servlet y las respuestas las genera un JSP.

## Ciclo de vida de un JSP

Lo primero de todo hay que tener en cuenta que **un JSP es un Servlet**. La primera vez que se invoque un JSP se convertira en una clase java, luego a su correspondiente .class y finalmente se desplegará en el servidor. A partir de aquí, el comportamiento sería igual que el del cualquier otro servlet.

La transformación de una página JSP a servlet la realiza un servlet especial que incluye los servidores de aplicaciones. Durante dicha transformación, todo el bloque formado por scriplets y etiquetas HTML de la página es incluido en el método service() del nuevo servlet.

Este nuevo servlet se almacena en un directorio interno del servidor de aplicaciones que no es accesible por el programador. Estas operaciones son absolutamente transparentes y se ejecutan en segundo plano, sin la intervención del desarrollador.

## Componentes de un JSP

A la hora de construir una página JSP, podemos incluir en ella los siguientes elementos:

1. Código HTML. En una página JSP se pueden incluir etiquetas y texto HTML de la misma forma que si de una página HTML estática se tratase. Estos bloques de texto HTML le llegarán tal cual al navegador cliente.

2. Código java embebido. El código embebido es el código Java que se ejecuta en el servidor cuando la página es solicitada. Este código tiene como misión generar de forma dinámica parte de la página y se separa del texto HTML. Podemos encontrar 2 tipos de código embebido:

    - **Scriplets**: Se trata de los bloques de código ‘estándares’ de nidos entre los bloques **<% y %>**. Este código sigue exactamente las mismas reglas sintácticas que el código Java que se de ne dentro de un método de una clase, es decir, la definición de variables, las instrucciones de control que nalizan en punto y coma (;), los bloques de sentencias entre llaves, etc.    
    Si hay que incluir alguna etiqueta HTML en este bloque de instrucciones, como cuando hay que generar varias veces un texto HTML mediante bucle for, el scriplet tendrá que dividirse en dos, y la etiqueta (o etiquetas) se incluirán entre ambos bloques.
    
    - **Expresiones JSP**: Cuando queremos generar, mediante código Java, un dato que debe ser incluido dentro de la página de respuesta, utilizaremos un bloque de código embebido especial conocido como expresión JSP, y tienen la estructura **<%= EXPRESION_JSP %>** El resultado de dicha expresión se vuelca dentro de la página. La instrucción Java que genera este resultado no debefinalizar en ; (punto y coma). Algunos ejemplos:
    
            <%=a*b%>
            <%=request.getParameter("user")%>
    
3. Objetos implicitos. Los objetos implícitos son, como su nombre indica, objetos creados implícitamente por el servidor y que están disponibles dentro del código embebido de la página. A través de estos objetos podemos acceder a parámetros, atributos…

4. Directivas. A través de las directivas, podemos enviar una serie de órdenes al servidor de aplicaciones, que serán
procesadas durante la fase de transformación de la página a servlet. Las directivas se definen entre los símbolos **<%@ y %>**.

## Expresiones de Lenguaje JSP (JSP EL)

Con las expresiones de lenguaje, JSP hace posible acceder a datos de la aplicacion, tales como JavaBeans, request, session, etc.
**JSP EL** permite crear tanto expresiones aritméticas como lógicas. Dentro de las expresiones, podemos usar primitivos, cadenas o null.

Una JSP EL tiene la siguiente estructura

	${expr}
	
Entre los objetos más importantes sque podemos usar dentro de las EL podemos encontrar los siguientes:

1. requestScope: Objetos dentro del contexto request

2. sessionScope: Objetos dentro del contexto session

3. applicationScope: Objetos dentro del contexto de aplicación

4. param: parametros de la request como strings 	

5. paramValues: parametros de la request como una colección de strings

6. header: cabeceras de la request como strings

7. headerValues: cabeceras de la request como una colección de strings

8. cookie: valor de la cookie


## Bibliografía

- <https://www.tutorialspoint.com/jsp/index.htm>
