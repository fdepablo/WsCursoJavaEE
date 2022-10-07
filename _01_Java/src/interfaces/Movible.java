package interfaces;

//Una interfaz es una colección de metodos abstractos
//(Todos tienen que ser abstractos)
//Las interfaces no son instanciables, serán usadas
//por otras clases que implementen la interfaz

//Una interfaz sirve para definir métodos que DEBEN
//de tener las clases que la implementan. La otra opción
//sería declarar la clase como abstracta

//Una interfaz es como contrato o compromiso que tendrán
//que cumplir las clases que al implementen

//Las interfaces definen el QUE tienen que hacer las
//clases que la implementen, no dirán el COMO.

//Una clase puede implementar todas las interfaces que necesite
//No es necesario seguir un sistema de herencia para implementar

/**
 * Se recomienda que las clases que implementen esta interfaz
 * tengan un atributo 'posicion' de tipo entero
 * @author Armando Ramos
 *
 */
public interface Movible {
	/**
	 * Este método hará que el objeto se mueva a su minima velocidad
	 */
	public void moverseLento();
	
	/**
	 * Este método hará que el objeto se mueva a su máxima velocidad
	 */
	public void moverseRapido();
	
	/**
	 * Este método hará que el objeto se muevo X metros pasados por
	 * parametros
	 * @param metros, representa el numero de metros que se movera el objeto
	 */
	public void moverse(int metros);
	
	//Las interfaces puedes poner atributos, pero esos atributos
	//son constantes. No hace falta poner 'final'
	public int MAX_VELOCIDAD_CABALLO = 50;	
}