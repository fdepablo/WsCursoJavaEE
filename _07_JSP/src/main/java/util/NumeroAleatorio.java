package util;

public class NumeroAleatorio {
	
	/**
	 * Genera un numero aleatorio entre los dos parametros de entrada
	 * @param min
	 * @param max
	 * @return
	 */
	public static int generarNumero(int min, int max) {
		int randomWithMathRandom = (int) ((Math.random() * (max - min)) + min);
		return randomWithMathRandom;
	}
}