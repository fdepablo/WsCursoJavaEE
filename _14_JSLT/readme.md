# JSLT

En JEE existen unas librerías muy utilizadas para evitar el uso de scriptlet en los JSPs. Estas librerías se llaman **JSTL o JavaServer Pages Standard Tag Library**.

Mediante estas librerías podremos ampliar considerablemente las funciones de JSP EL. De las más importantes, podremos usar sentencias de control dentro de nuestras páginas JSP sin necesidad de los scriptlet.

## Configuración

Para poder usar JSTL dentro de nuestros proyetos web debemos de incluir sus librerías, ya que no están incluidas por defecto dentro de Tomcat.

Las librerías en java son fichero con extención **.jar**

Podemos bajarnos la librería JSTL de esta dirección <https://mvnrepository.com/artifact/javax.servlet/jstl/1.2>

Existen muchas maneras de incluir las librerías, de las más comodas sería incluir el .jar dentro de la carpeta **main/webapp/WEB-INF/lib**.

En nuestro caso, hemos incluido el fichero **jstl-1.2.jar** dentro de la carpeta **main/webapp/WEB-INF/lib**. 

## Uso de las librerías JSTL

Para usar las librerías JSTL en nuestras páginas JSP, debemos de incluir la siguiente directiva dentro de las páginas.

	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>á

Una vez incluida la directiva, podremos usar las etiquetas que estan dentro de la libreria JSTL mediante el prefijo **c** (que podemos cambiarle el nombre por el que queramos)

Aunque la directiva tenga un atributo uri con una dirección de internet, NO estamos yendo a internet a obtener las librerías. La uri representa el nombre de la libreria de nuestro proyecto

## Buenas prácticas.

Siempre es mejor evitar los **scriplet** y utilizar librerías JSTL y JSP EL.

## Bibliografíaa

- <https://es.wikipedia.org/wiki/JavaServer_Pages_Standard_Tag_Library>