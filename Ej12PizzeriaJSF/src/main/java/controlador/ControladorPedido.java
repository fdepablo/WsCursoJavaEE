package controlador;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import modelo.entidad.Pedido;
import modelo.entidad.Pizza;
import modelo.negocio.GestorPizza;

@ManagedBean
@RequestScoped
public class ControladorPedido {
	
	private String tamanio;
	private List<String> ingredientes;
	private String nombre;
	
	@ManagedProperty(value="#{gestorPizza}")
	private GestorPizza gp;
	
	@ManagedProperty(value="#{pedido}")
	private Pedido pedido;
	
	public String addPizza() {
		Pizza pizza = new Pizza();
		pizza.setIngredientes(ingredientes);
		pizza.setSize(tamanio);
		gp.calcularPrecio(pizza);
		
		pedido.getListaPizzas().add(pizza);
		
		System.out.println("Procesando pizza... " + pizza);
		
		return null;
	}
	
	public String procesarPedido() {
		pedido.calcularPrecio();
		pedido.setNombre(nombre);
		System.out.println("Procesando pedido... " + pedido);
		return "resultado";
	}	
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GestorPizza getGp() {
		return gp;
	}

	public void setGp(GestorPizza gp) {
		this.gp = gp;
	}
	
}
