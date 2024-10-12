package com.reto1.cursoformacion.model;

import java.util.Date;

public class Curso {
	private Long id;
	private String nombre;
	private int horas; 
	private String info;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	public Curso () {
		
	}
	
	public Curso(Long id, String nombre, int horas, String info, Date fecha_inicio, Date fecha_fin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.info = info;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	
}
