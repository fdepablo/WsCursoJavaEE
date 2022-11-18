package modelo.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Pedido {
	private List<Pizza> listaPizzas;
	private double precioTotal;
	private String nombre;
	
	public Pedido() {
		listaPizzas = new ArrayList<>();
	}
	
	public List<Pizza> getListaPizzas() {
		return listaPizzas;
	}
	public void setListaPizzas(List<Pizza> listaPizzas) {
		this.listaPizzas = listaPizzas;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public void calcularPrecio() {
		for(Pizza pizza : listaPizzas) {
			precioTotal += pizza.getPrecio();
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pedido [listaPizzas=" + listaPizzas + ", precioTotal=" + precioTotal + ", nombre=" + nombre + "]";
	}
	
	
}
