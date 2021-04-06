package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appatjuliacostam.model.negocio.Animal;
import br.edu.infnet.appatjuliacostam.model.service.AnimalService;

@Controller
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;

	
	@GetMapping(value = "/animal")
	public String viewDetalheAnimal(Model model) {		
		
		model.addAttribute("animais", animalService.ObterLista());
		System.out.println("Lista atualizada com sucesso");
		return "animal/detalhe";
	}
	
	@PostMapping(value = "/animal/incluir")
	public String incluir(Animal animal) {
		
		animalService.Incluir(animal);
		
		System.out.println("Animal Cadastrado com sucesso");
		System.out.println(animal.getNome());
		
		
		return "redirect:/animal";
	}
	
	@GetMapping(value = "/animal/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		animalService.Excluir(id);
		
		return "redirect:/animal";
	}
	
}
