package interfaces;

//Con la palabra implements, haremos que una clase implemente
//una interfaz
public class Caballo implements Movible{
	private int posicion;

	@Override
	public void moverseLento() {
		posicion +=2;		
	}

	@Override
	public void moverseRapido() {
		posicion +=20;		
	}

	@Override
	public void moverse(int metros) {
		if(metros >= 20) {
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
