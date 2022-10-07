package entidad;

import java.util.ArrayList;
import java.util.List;

public class MainCoche {

	public static void main(String[] args) {
		Rueda rtd = new Rueda();
		Rueda rti = new Rueda();
		Rueda rdd = new Rueda();
		Rueda rdi = new Rueda();
		
		rtd.setMarca("Pirelli");
		rtd.setPulgadas(15);
		
		rti.setMarca("Pirelli");
		rti.setPulgadas(15);
		
		rdd.setMarca("Michellin");
		rdd.setPulgadas(15);
		
		rdi.setMarca("Michellin");
		rdi.setPulgadas(15);
		
		List<Rueda> listaRuedas = new ArrayList<>();
		listaRuedas.add(rtd);
		listaRuedas.add(rti);
		listaRuedas.add(rdd);
		listaRuedas.add(rdi);
		
		Motor motor = new Motor();
		motor.setCv(375);
		motor.setConsumo(7.5);
		motor.setTipo("Gasolina");
		
		Coche coche = new Coche();
		coche.setColor("Azul");
		coche.setMarca("Ferreri");
		coche.setMatricula("CSW-7890");
		coche.setPrecio(100_000);
		
		coche.setListaRuedas(listaRuedas);
		coche.setMotor(motor);
		
		System.out.println(coche);
	}

}
