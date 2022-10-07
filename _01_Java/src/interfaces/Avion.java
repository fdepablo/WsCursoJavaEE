package interfaces;

public class Avion implements Movible{
	private int posicion;
	
	//Una constante en una variable que no cambia el valor
	//se pone con la palabra 'final"
	public static final int MAX_VELOCIDAD = 500;

	@Override
	public void moverseLento() {
		posicion += 50;
	}

	@Override
	public void moverseRapido() {
		posicion += MAX_VELOCIDAD;
		
	}

	@Override
	public void moverse(int metros) {
		if(metros >= MAX_VELOCIDAD) {
			moverseRapido();
		}else {
			posicion += metros;
		}
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
}
