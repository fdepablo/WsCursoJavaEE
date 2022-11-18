package modelo.entidad;

import java.util.List;

public class Pedido {
	private List<Pizza> listaPizzas;
	private double precioTotal;
	
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
}
