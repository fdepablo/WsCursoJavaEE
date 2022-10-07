package entidad;
public class Empleado {
	private String nombre, dni, rango;
	private int salario;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	public String toString() {
		return "Empleados [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	public int calcularSueldo() {
		return this.salario;
	}
}