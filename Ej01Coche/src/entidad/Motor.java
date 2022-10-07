package entidad;

public class Motor {
	private int cv;
	private String tipo;
	private double consumo;
	
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", tipo=" + tipo + ", consumo=" + consumo + "]";
	}	
}
