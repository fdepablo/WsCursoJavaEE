package es.conversores;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FechaController{

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
