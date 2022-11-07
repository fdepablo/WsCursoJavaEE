package modelo.entidad;

import javax.persistence.Embeddable;

//Aquí le decimos que esta clase no va a ser entidad propia
//, es decir, no queremos una tabla en BBDD.
//Por ello no la anotamos con @Entity, la anotamos con 
//@Embeddable.
//De esta manera, sus atributos van a formar parte de los campos de 
//otra tabla, en este caso formara parte de la tabla Cliente
@Embeddable
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String ciudad;
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + "]";
	}	
}
