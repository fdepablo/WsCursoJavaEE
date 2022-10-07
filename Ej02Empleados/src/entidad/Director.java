package entidad;
public class Director extends Empleado{
	private int cargaEmpleados;

	public Director() {
		super();
		this.setRango("Director");
	}
	
	public int getCargaEmpleados() {
		return cargaEmpleados;
	}

	public void setCargaEmpleados(int cargaEmpleados) {
		this.cargaEmpleados = cargaEmpleados;
	}
	
	public int calcularSueldo() {
		return this.getSalario() + this.cargaEmpleados * 100;
	}

	public String toString() {
		return "rango = " + getRango() + ",  Nombre = " + getNombre() + ", Dni = " + getDni() + ", Carga Empleados = " + cargaEmpleados + ", Sueldo = " + calcularSueldo();
	}
}
