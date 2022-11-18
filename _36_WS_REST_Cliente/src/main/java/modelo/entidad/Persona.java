package modelo.entidad;

//Esta sera la entidad con la que vamos a trabajar en nuestro servicio REST

//Copiamos las entidades de nuestro servicio rest para trabajar con el mismo
//formato de información
public class Persona{
	
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		super();
	}	

	public Persona(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
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

	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	
}
