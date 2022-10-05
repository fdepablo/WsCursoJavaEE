package javabeans;

//Normalmente, las clases que creamos que representan entidades
//es muy habitual crearlas con estructura JavaBean
//Esta estructura nos dice que tenemos que tener los atributos
//privados y hacer metodos accesores y modificadores publicos
//lo que se conocen como setters y getters
//Este tipo de estructura es muy importante porque muchos 
//frameworks (librerias que usaremos para desarrollar programas
//de manera mas facil) nos piden que nuestras entidades sigan
//la convención de JavaBean
public class Animal {
	private String nombre;
	private String tipo;
	private int edad;
	
	//boton derecho -> source -> generate setter and getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//podemos sobrescribir el metodo toString() para 
	//que nos escriba el objeto de otra manera a la habitual
	//boton derecho -> source -> Generate toString	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
	}
}
