package com.amontanez.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

	@RequestMapping("/")
	public String inicio(Model model) {
		return "empleado/index";
	}
}
