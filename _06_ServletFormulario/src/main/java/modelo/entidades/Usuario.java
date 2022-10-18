package modelo.entidades;

import java.util.List;

//JavaBean
public class Usuario {
	private String email;
	private String password;
	private List<String> listaIntereses;
	private String sexo;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getListaIntereses() {
		return listaIntereses;
	}
	public void setListaIntereses(List<String> listaIntereses) {
		this.listaIntereses = listaIntereses;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password + ", listaIntereses=" + listaIntereses + ", sexo="
				+ sexo + "]";
	}	
}
