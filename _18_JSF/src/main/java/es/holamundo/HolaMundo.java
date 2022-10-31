package es.holamundo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
@RequestScoped
public class HolaMundo {
	
	private String valor;
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String enviarPagina3(){
		return "terceraPagina";
	}
	
	public String volverMismaPagina(){
		System.out.println("Me quedo en la misma página");
		return null;
	}
	
	//JSF nos proporciona una serie de anotaciones para poder
	//ejecutar código en el ciclo de vida de una MB
	
	//Con esta anotación estamos diciendo al contexto de JSF
	//que antes de que se cree este MB, se ejecute este método
	@PostConstruct
	public void antesDeCrear(){
		System.out.println("Construyendo el bean");
	}
	
	//Con esta anotación estamos diciendo al contexto de JSF
	//que antes de que se destruya este MB, se ejecute este método
	@PreDestroy
	public void antesDeDestruir(){
		System.out.println("destruyendo el bean");
	}
}
