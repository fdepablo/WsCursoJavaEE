package modelo.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "animales")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true,length = 255,nullable = false,name = "nombre_animal")
	private String nombre;
	private String tipo;
	private double peso;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecheNacimiento;
	
	@Transient
	private double pesoAproximado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public Date getFecheNacimiento() {
		return fecheNacimiento;
	}
	public void setFecheNacimiento(Date fecheNacimiento) {
		this.fecheNacimiento = fecheNacimiento;
	}
	public double getPesoAproximado() {
		return pesoAproximado;
	}
	public void setPesoAproximado(double pesoAproximado) {
		this.pesoAproximado = pesoAproximado;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", fecheNacimiento="
				+ fecheNacimiento + ", pesoAproximado=" + pesoAproximado + "]";
	}
	
	
	
	
}
