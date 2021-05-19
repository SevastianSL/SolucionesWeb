package com.amontanez.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amontanez.demo.entity.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "usuario/index";
	}

}
