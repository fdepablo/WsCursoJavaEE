package es.selecciones;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class LiteralesManagedBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String literalMarcado = "Marque para continuar";
	
	public String getLiteralMarcado() {
		return literalMarcado;
	}

	public void setLiteralMarcado(String literalMarcado) {
		this.literalMarcado = literalMarcado;
	}
}
