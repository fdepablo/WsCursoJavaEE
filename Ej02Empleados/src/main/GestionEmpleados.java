package main;

import java.util.ArrayList;
import java.util.List;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeDeEquipo;
import entidad.Programador;

public class GestionEmpleados {

	public static void main(String[] args) {
		//creamos a los Programador
		Programador p1 = new Programador();
		Programador p2 = new Programador();
		Programador p3 = new Programador();
		p1.setNombre("Paco");
		p1.setDni("67939338G");
		p1.setSalario(1500);
		p2.setNombre("Pepe");
		p2.setDni("25987466F");
		p2.setSalario(1500);
		p3.setNombre("Perico");
		p3.setDni("21458653T");
		p3.setSalario(1500);
		//creamos a los jefes de equipo
		JefeDeEquipo j1 = new JefeDeEquipo();
		JefeDeEquipo j2 = new JefeDeEquipo();
		j1.setNombre("Super Paco");
		j1.setDni("56987412N");
		j1.setSalario(1500);
		j1.setIncentivo(400);
		j2.setNombre("Super Pepe");
		j2.setDni("58963741Y");
		j2.setSalario(1500);
		j2.setIncentivo(650);
		//creamos un director
		Director d1 = new Director();
		d1.setNombre("Mega Paco");
		d1.setDni("56987412N");
		d1.setSalario(2000);
		d1.setCargaEmpleados(5);
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(p1);
		listaEmpleados.add(p2);
		listaEmpleados.add(p3);
		listaEmpleados.add(j1);
		listaEmpleados.add(j2);
		listaEmpleados.add(d1);
		
		for(Empleado e1 : listaEmpleados) {
			System.out.println(e1.calcularSueldo());
		}
	}
}