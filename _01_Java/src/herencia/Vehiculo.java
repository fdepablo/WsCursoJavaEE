package herencia;

//La herencia es una herramienta muy poderosa dentro de la 
//poo, la cual nos permite reutilizar código dentre de 
//nuestra aplicación

//La primera regla de la herencia es que cuando una clase
//hereda de otra, automáticamente coje todos sus atributos
//y todos sus métodos

//La segunda regla de la herencia es que con una referencia
//de una clase padre, podemos apuntar a cualquier objeto
//hijo que extienda de la misma, pero solo podemos usar
//los metodos de la referencia que estemos usando, no
//del objeto al que estamos apuntando

//Podemos cambiar la referencia de un objeto mediante el 
//casting, es decir, si nosotros sabemos que una referencia
//esta apuntando a un objeto concreto podemos decirla a
//java que nos cambie la referencia

//Siempre que ejecutemos un metodo con una referncia, siempre
//se ejecutará el metodo del objeto al que estemos apuntando
//no importara el metodo de la referencia. Esta caracteristica
//se llama polimorfismo
public class Vehiculo {
	private String marca;
	private String modelo;
	private String matricula;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarMatricula() {
		System.out.println("Soy el vehiculo con la matricula " + this.matricula);
	}
	
	//Para sobreescribir un metodo en java tenemos que hacer que el metodo tenga
	//la misma firma que el metodo padre
	//La firma de un metodo consta de:
	//1- El nombre del metodo
	//2- El numero de parametros de entrada de un método
	//3- El tipo de parametros de entrada de un método
	
	//Las anotaciones en java tienen el formato "@NOMBRE_ANOTACION"
	//Su función es añadir funcionalidad en tiempo de compilación
	//o en tiempo de ejecución
	
	//En este caso, la anotación @Override es una anotación de comprobación.
	//Comprueba en tiempo de compilación que el metodo que tiene debajo
	//tiene la misma firma que el metodo padre.
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
}
