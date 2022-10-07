package herencia;

public abstract class Figura {
	private String color;
	
	//Cuando sabemos que una clase tiene un metodo pero no
	//sabemos como implementar, estamos ante metodos
	//abstractos.
	//Siempre que tengamos una metodo abstracta, debemos
	//de tener la clase como abstracta. Las clases
	//abstractar no pueden ser instanciadas, es decir,
	//no podemos crear objetos de ella. La función final
	//es que formen parte de un sistema de herencia.
	public abstract void dibujar();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
