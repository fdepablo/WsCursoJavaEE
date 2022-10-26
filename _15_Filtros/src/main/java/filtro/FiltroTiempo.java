package filtro;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Mediante este filtro queremos calcular el tiempo que se tarda en procesar
 * una petición HTTP desde que entra en nuestro servidor hasta que sale
 * del servidor.
 * 
 * Dentro de la anotación @WebFilter ponemos los recursos que queremos
 * mapear por este filtro. En este caso, como queremos mapear todos
 * los recurso debemos de adaptar la URL de mapeo. Normalmente
 * los filtros utilizan "comodines" o "*"
 * 
 * Al poner la URL como "/*" estamos diciendo que este filtro va a 
 * mapear todas las URL del servidor
 */
@WebFilter("/*")
public class FiltroTiempo extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public FiltroTiempo() {
        super();
    }

	public void init(FilterConfig fConfig) throws ServletException {
		// Este método se ejecuta cuando se va a dar de alta el filtro en el servidor
		// Este método se ejecuta una única vez
		System.out.println("init -> Filtro creandose en el servidor");
	}
	
	public void destroy() {
		// Este método se ejecuta cuando se va a destruir el filtro
		// Este método se ejecuta una única vez
		System.out.println("destroy -> Filtro destruyendose...");
	}

	/**
	 * Este método se ejecuta cada vez que entremos en el filtro
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Antes del método chain.doFilter() podemos poner todo el código
		// que queremos que se ejecute antes de dejar continuar la petición
		// HTTP al recurso que estemos intentando acceder
		
		//Los objetos que llegan aquí normalmente son de tipo HttpServletRequest
		//lo que ocurre es que la interfaz Filter es muy generica y el tipo 
		//de request que implementamos es de tipo ServletRequest.
		//Por lo tanto, si queremos utilizar todos los métodos de HttpServletRequest
		//debemos de cambiar el tipo de referencia mediante un casting
		HttpServletRequest hsr = (HttpServletRequest)request;
		System.out.println("doFilter -> Entrando por el filtro a la URI: "
				+ hsr.getRequestURI());
		
		//Vamos a tomar el tiempo cuando entramos en el filtro
		//La clase Date es la clase más básica que podemos encontrar
		//en Java respecto al tiempo. Cuando instanciamos un objeto
		//de la clase Date se almacena dentro el número de milisegundos
		//que han pasado desde 01/01/1970 (fecha linux o unix) y lo
		//almacena en un "long"
		Date fechaInicial = new Date();
		System.out.println("doFilter -> Numero de milisegundos desde 1970: " 
				+ fechaInicial.getTime());
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		// Despues del método chain.doFilter() podemos poner todo el código
		// que queremos que se ejecute despues de que regrese la petición
		// HTTP al recurso que hemos accedido
		
		System.out.println("doFilter -> Saliendo por el filtro");
		Date fechaFinal = new Date();
		
		long tiempoProcesamiento = fechaFinal.getTime() - fechaInicial.getTime();
		System.out.println("doFilter -> El tiempo de procesamiento ha sido " 
				+ tiempoProcesamiento + " milisegundos");
		
	}



}
