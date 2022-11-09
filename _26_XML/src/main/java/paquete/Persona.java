package paquete;

public class Persona {
	private int id;
	private String nombre;
	private int edad;
	private TiposCafe tipoCafe;
	
	public TiposCafe getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(TiposCafe tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
