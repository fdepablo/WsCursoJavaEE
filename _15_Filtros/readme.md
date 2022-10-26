# Filtros

La misión de los filtros suele ser mapear un rango de URLs para aplicar una funcionalidad común a todas ellas. De esta manera centralizammos una lógica de nuestra aplicación en un solo componente. Los **filtros o  filters** son otro tipo de componente web que tenemos dentro de JEE.

Los filtros son muy utilizados por otras librerías dentro del mundo JEE, como por ejemplo JSF (Java Server Faces).

## Creación

Podemos dar de alta filtro mediante el web.xml o mediante anotaciones (desde la versión 3.0). Mediante anotaciones se utiliza la etiqueta **@WebFilter** y mediante web.xml se utiliza la etiqueta **<filter>**.

Es obligatorio que la clase que queremos dar de alta como filtro implemente la interfaz Filter.

Podemos crear un filtro desde eclipse con boton derecho sobre el paquete que queramos, pulsar boton derecho -> new -> filter.


## Ciclo de vida

El ciclo de vida de un filtro es diferente al comportamiento por defecto del servlet, se creará cuando arranquemos el servidor, y permanecerá vivo mientras el servidor este arrancado.
