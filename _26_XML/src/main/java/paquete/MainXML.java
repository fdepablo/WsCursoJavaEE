package paquete;

public class MainXML {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setId(23);
		p.setNombre("Steve");
		p.setEdad(24);
		p.setTipoCafe(TiposCafe.SOLO);//"solo", "SOLO", "CAFE_SOLO"
		p.setTipoCafe(TiposCafe.CAPUCHINO);
		
		System.out.println(p.getTipoCafe());

		otropaquete.Persona p2 = new otropaquete.Persona();
		p2.setDni("3456789F");
		p2.setNombre("Peter");
		p2.setApellidos("Parker");
	}

}
