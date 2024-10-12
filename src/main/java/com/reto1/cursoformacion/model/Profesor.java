package com.reto1.cursoformacion.model;

public class Profesor {

	
	private String nombre;
	private String apellidos;
	private String mail;
	
	
	public Profesor () {
		
	}
	public Profesor(String nombre, String apellidos, String mail) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
