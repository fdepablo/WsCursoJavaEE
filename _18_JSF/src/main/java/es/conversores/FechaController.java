package es.conversores;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FechaController implements Serializable{
	private static final long serialVersionUID = 1L;

	private Date date = new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String actualizarFecha(){
		System.out.println(date);
		return null;
	}
}
