package com.reto1.cursoformacion.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private int horas; 
	private String info;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha_inicio;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha_fin;
	
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	private List<Profesor> profesores;
	
	public Curso () {
		
	}
	
	public Curso(Integer id, String nombre, int horas, String info, LocalDate fecha_inicio, LocalDate fecha_fin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.info = info;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public LocalDate getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
}
