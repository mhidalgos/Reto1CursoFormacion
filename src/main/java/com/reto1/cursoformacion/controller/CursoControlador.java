package com.reto1.cursoformacion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reto1.cursoformacion.model.Curso;
import com.reto1.cursoformacion.services.CursoService;

@Controller
@RequestMapping ("/cursos")
public class CursoControlador {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping ("")
	public String mostrar (Model model) {
		model.addAttribute("cursos", cursoService.findAll());
		return "cursos/show";
	}

	@GetMapping ("/create")
	public String crear(){
		return "cursos/create";
	}
	
	@PostMapping ("/save")
	public String save(Curso curso) {
		cursoService.create(curso);
		return "redirect:/cursos";
	}
	@GetMapping ("/buscar")
	public String mostrar(@RequestParam(value = "query", required = false) String query, Model model) {
	    List<Curso> cursos;
	    if (query != null && !query.isEmpty()) {
	        cursos = cursoService.findByNombre(query);
	    } else {
	        cursos = cursoService.findAll();
	    }
	    model.addAttribute("cursos", cursos);
	    model.addAttribute("query", query);
	    return "cursos/show";
	}
}
