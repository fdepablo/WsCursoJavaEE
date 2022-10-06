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
	
	//Constructores
	//Es un metodo especial al cual java invoca cada vez que creemos
	//un objeto
	//Si no creais ningún constructor, java crea uno por vosotros
	//de manera automática, pero en cuanto creeis un constructor
	//java no creara más constructores
	//El constructor que crea java por defecto es a traves del nombre
	//de la clase
	public Animal() {
		super();//Este sería el constructor por defecto que crea
		//Podemos add las sentencias que queramos para inicializar
		//los objetos
		this.nombre = "";
		this.edad = 1;
	}
	
	//podemos sobrecargar constructores
	//podemos crear constructores con boton derecho -> source -> 
	//genenerate constructor using fields
	public Animal(String nombre, String tipo, int edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	
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
