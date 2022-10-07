package entidad;
public class JefeDeEquipo extends Empleado {
	private int incentivo;

	public JefeDeEquipo() {
		super();
		this.setRango("Jefe de Equipo");
	}
	
	public int getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public int calcularSueldo() {
		return this.getSalario() + this.incentivo;
	}

	public String toString() {
		return "rango = " + getRango() + ", Nombre = " + getNombre() + ", Dni = " + getDni()+ ", incentivo = " + incentivo + ",  Sueldo = " + calcularSueldo();
	}

	
	
}