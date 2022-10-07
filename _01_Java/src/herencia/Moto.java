package herencia;

public class Moto extends Vehiculo{
	private boolean tieneMaletero;

	public boolean isTieneMaletero() {
		return tieneMaletero;
	}

	public void setTieneMaletero(boolean tieneMaletero) {
		this.tieneMaletero = tieneMaletero;
	}

	@Override
	public String toString() {
		return "Moto [tieneMaletero=" + tieneMaletero + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getMatricula()=" + getMatricula() + "]";
	}
	
	
}
