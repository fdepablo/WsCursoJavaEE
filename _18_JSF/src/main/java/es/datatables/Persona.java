package es.datatables;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Persona {
	private String nombre;
	private String dni;
	
	public Persona() {

	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
