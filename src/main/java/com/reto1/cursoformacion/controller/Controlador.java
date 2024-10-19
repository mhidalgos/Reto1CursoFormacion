package com.reto1.cursoformacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reto1.cursoformacion.services.CursoService;

@Controller
@RequestMapping ("")
public class Controlador {
	
	@Autowired
	private CursoService cursoService;

	@GetMapping ("")
	public String home (Model model) {
		model.addAttribute("cursos", cursoService.findAll());
		return "administrador/home";
	}
}
