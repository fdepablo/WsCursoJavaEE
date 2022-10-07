package herencia;

public class Circulo extends Figura2D{
	
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		double area = Math.PI * (radio * radio);
		System.out.println("El area del circulo es: " + area);
	}

	@Override
	public void dibujar() {
		System.out.println("Este circulo es : " + getColor());
		System.out.println(" ****");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println(" ****");
	}

}
