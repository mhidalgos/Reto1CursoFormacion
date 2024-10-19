package com.reto1.cursoformacion.services;

import java.util.List;
import java.util.Optional;

import com.reto1.cursoformacion.model.Curso;

public interface CursoService {
	public Curso create (Curso curso);
	public Optional<Curso> read (Integer id);
	public void update (Curso curso);
	public void delete (Integer id);
	public List<Curso> findAll();
}
