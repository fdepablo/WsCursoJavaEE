package entidad;

import java.util.List;

public class Coche {
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private double precio;
	
	private Motor motor;
	private List<Rueda> listaRuedas;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public List<Rueda> getListaRuedas() {
		return listaRuedas;
	}
	public void setListaRuedas(List<Rueda> listaRuedas) {
		this.listaRuedas = listaRuedas;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula
				+ ", precio=" + precio + ", motor=" + motor + ", listaRuedas=" + listaRuedas + "]";
	}
	
	
}
