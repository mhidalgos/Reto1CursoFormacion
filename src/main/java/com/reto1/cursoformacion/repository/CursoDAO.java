package com.reto1.cursoformacion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reto1.cursoformacion.model.Curso;


@Repository
public interface CursoDAO extends JpaRepository<Curso, Integer>{

	List<Curso> findByNombreContainingIgnoreCase(String nombre);	
}

