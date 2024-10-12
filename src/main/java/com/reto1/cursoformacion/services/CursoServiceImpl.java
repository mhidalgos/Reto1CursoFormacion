package com.reto1.cursoformacion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto1.cursoformacion.model.Curso;
import com.reto1.cursoformacion.repository.CursoDAO;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDAO cursoDAO;
	@Override
	public Curso create(Curso curso) {
		return cursoDAO.save(curso);
	}

	@Override
	public Optional<Curso> read(Integer id) {
		return cursoDAO.findById(id);
	}

	@Override
	public void update(Curso curso) {
		cursoDAO.save(curso);
		
	}

	@Override
	public void delete(Integer id) {
		cursoDAO.deleteById(id);
	}

}
