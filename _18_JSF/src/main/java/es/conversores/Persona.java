package es.conversores;

import java.util.Objects;

public class Persona {
	private String nombre;
	private String dni;
	
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
	
	//Cuando usamos conversores debemos de sobreescribir el método 'hashcode'
	//y 'equals' boton derecho -> source
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}		
}
