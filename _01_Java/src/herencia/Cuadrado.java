package herencia;

public class Cuadrado extends Figura2D{
	private int lado;

	@Override
	public void calcularArea() {
		int area = lado * lado;
		System.out.println("El area del cuadrado es : " + area);		
	}

	@Override
	public void dibujar() {
		System.out.println("Este cuadrado es : " + getColor());
		System.out.println("********");
		System.out.println("*      *");
		System.out.println("*      *");
		System.out.println("*      *");
		System.out.println("********");
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}	
	
}
