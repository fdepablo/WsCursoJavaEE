package entidad;

public class Rueda {
	private String marca;
	private double pulgadas;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	@Override
	public String toString() {
		return "Rueda [marca=" + marca + ", pulgadas=" + pulgadas + "]";
	}
	
	
}
