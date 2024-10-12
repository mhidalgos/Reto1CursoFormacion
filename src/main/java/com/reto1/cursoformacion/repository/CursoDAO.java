package com.reto1.cursoformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reto1.cursoformacion.model.Curso;


@Repository
public interface CursoDAO extends JpaRepository<Curso, Integer>{
	
}

