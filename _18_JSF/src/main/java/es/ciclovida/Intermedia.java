package es.ciclovida;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Intermedia {
	
	@ManagedProperty(value="Inicial")
	private String palabra;
	@ManagedProperty(value="#{aplicacion}")
	private Aplicacion aplicacion;
	@ManagedProperty(value="#{usuario}")
	private User user;
	
	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public String enrutar(String direccion){
		System.out.println("Recibiendo peticion del usuario: " + user.getName());
		long actual = aplicacion.getContadorPaginas();
		aplicacion.setContadorPaginas(++actual);
		return direccion;
		
	}
	
}
