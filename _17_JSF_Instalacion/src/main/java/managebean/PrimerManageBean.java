package managebean;

import javax.faces.bean.ManagedBean;

//Los Managed Bean (MB) hacen función de controlador y para poder acceder
//a ellos debemos de pasar a traves del Faces Servlet
//En algunos sitios los Managed Bean son también llamados Backing Bean

//Existen 2 maneras de dar de alta un MB en JSF
//1- Anotaciones (desde la version 2.0 JSF)
//2- Dentro del faces-config.xml

//Los managed bean se crean a partir de POJOs, acronimo de
//Plain Old Java Object, que son objetos sencillos que no tienen
//funcionalidades añadidas a traves de la herencia. Se busca
//facilitar la utilización de los mismos

//Aquí tambien se aplica el concepto de IoC o Inversión de control
//Es decir, nosotros no gestionamos los objetos de esta clase
//, los gestiona JSF

//Los managed bean se van a dar de alta en el contexto de JSF
//con el nombre de la clase en notación "lowerCamelCase",
//es decir, en este caso con el nombre "primerManageBean"

//Además, el ciclo de vida de los MB está asociado a su scope
//que tendremos 3, el de request, el de session y el de aplicattion
//Por defecto, el scope de un MB es el de request

@ManagedBean
public class PrimerManageBean {

	private String saludo;
	private String nombre;
	private String valorSegundaPagina;

	public PrimerManageBean() {
		this.saludo = "Hola a todos, primer saludo JSF";
		this.nombre = "";
	}
	
	public String procesarNombre() {
		System.out.println("El nombre enviado es: " + nombre);
		if(this.nombre.equalsIgnoreCase("peter")) {
			System.out.println("procesarNombre -> Ha entrado PETER!!!!");
			this.valorSegundaPagina = this.nombre + " HA LLEGADO!!!";
			return "segundaPagina";//Hacemos un RequestDispatcher (por defecto)
		}else {
			this.nombre = "Valor cambiado :)";
			return null;//Cuando retornamos null, volvemos a la misma pagina
		}
		
	}
	
	//Otra manera de mandar información es como parametro de entrada del método
	public String procesarNombre(String valor) {
		System.out.println("El valor introducido es: " + valor);
		this.nombre = valor;
		return null;
	}
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Si solo vamos a utilizar un atributo para 
	//leer, con hacer el get es suficiente
	public String getValorSegundaPagina() {
		return valorSegundaPagina;
	}
	
	
}
