package entidad;
public class Programador extends Empleado {
	
	public Programador() {
		super();
		this.setRango("Programador");
	}

	public String toString() {
		return "rango = " + getRango() + ", Nombre = " + getNombre() + ", Dni = " + getDni()+ ", Sueldo = " + calcularSueldo();
	}
	
}