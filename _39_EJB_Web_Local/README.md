
# WEB y EJB Singleton

Pasos para crear un proyecto EJB con proyecto web y sin EAR inicial:

1. Crear un proyecto EJB (_39_EJB_Web_Local). 
2. Crear un proyecto web normal (_39_WebServletEJB)
3. Crear un proyecto "Enterprise Application Proyect"
	- Damos un nombre al proyecto y damos "next"
	- Elegimos los dos proyectos anteriores para meter en el EAR
4. Agregamos al classpath del proyecto web el proyecto EJB
5. Desarrollamos los EJB y la parte web
6. Injectamos los EJB en el proyecto web con la anotación @EJB
	
## Bibliograf�a

- <https://www.youtube.com/watch?v=ZftdxHnqEXU>
- <https://www.arquitecturajava.com/ejb-remote-vs-local-jee-6/>
