package modelo.negocio;

import modelo.entidad.Pizza;

public class GestorPizza {

	public void calcularPrecio(Pizza pizza) {
		int precio = 0;
		
		//Calculamos el precio segun el tamaño
		switch (pizza.getSize()) {
		case "peque":
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
