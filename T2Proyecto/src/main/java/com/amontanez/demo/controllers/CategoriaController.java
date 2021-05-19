package com.amontanez.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@RequestMapping("/")
	public String inicio(Model model) {
		return "categoria/index";
	}
}
