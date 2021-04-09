 package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcessoController {
	
	
	@GetMapping(value = "/home")
	public String home() {
		
		return "index";
	}
	
	@GetMapping(value = "/")
	public String login() {
		
		return "login";
	}
	

}
