package modelo.negocio;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import modelo.entidad.Pizza;

@ManagedBean(name = "gestorPizza")
@ApplicationScoped
public class GestorPizza {

	public void calcularPrecio(Pizza pizza) {
		int precio = 0;
		
		//Calculamos el precio segun el tamaño
		switch (pizza.getSize()) {
		case "pequenia":
			precio = 5;
			break;
		case "mediana":
			precio = 10;
			break;
		case "grande":
			precio = 15;
			break;
		default:
			break;
		}
		
		//Calculamos el precio segun los ingredientes
		int precioIngredientes = pizza.getIngredientes().size();
		precio += precioIngredientes;
		
		pizza.setPrecio(precio);
	}
}
