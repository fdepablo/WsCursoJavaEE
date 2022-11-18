package modelo.entidad;

import java.util.List;

public class Pizza {
	private String nombreCliente;
	private String size;
	private List<String> ingredientes;
	private int precio;
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	@Override
	public String toString() {
		return "Pizza [nombreCliente=" + nombreCliente + ", size=" + size + ", ingredientes=" + ingredientes
				+ ", precio=" + precio + "]";
	}
	
	
}
