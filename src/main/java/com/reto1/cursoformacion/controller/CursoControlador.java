package com.reto1.cursoformacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
