package es.ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class JavaScriptController {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
