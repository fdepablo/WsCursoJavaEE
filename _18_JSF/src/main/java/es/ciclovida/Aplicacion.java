package es.ciclovida;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

//Este objeto será compartido por todos los usuarios
@ManagedBean
@ApplicationScoped
public class Aplicacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long contadorPaginas;

	public long getContadorPaginas() {
		return contadorPaginas;
	}

	public void setContadorPaginas(long contadorPaginas) {
		this.contadorPaginas = contadorPaginas;
	}

}
