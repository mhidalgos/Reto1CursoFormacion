package com.reto1.cursoformacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/administrador")
public class Controlador {

	@GetMapping ("")
	public String home () {
		return "administrador/home";
	}
}
