package managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HolaMundo {
	private String mensaje;
	private String dato1;
	
	public HolaMundo() {
		this.setMensaje("Hola mundo");
	}
	
	public String ejecutarDato1() {
		this.dato1 += " (agregamos esto en el managed bean)";
		System.out.println("ejecutarDato1() -> Entrando: " + dato1);
		return "respuestaHolaMundo";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDato1() {
		return dato1;
	}

	public void setDato1(String dato1) {
		this.dato1 = dato1;
	}

}
