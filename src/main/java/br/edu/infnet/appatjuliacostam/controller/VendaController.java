package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.negocio.Venda;
import br.edu.infnet.appatjuliacostam.model.service.AnimalService;
import br.edu.infnet.appatjuliacostam.model.service.VendaService;

@Controller
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@Autowired
	private AnimalService animalService;
	
	
	@GetMapping(value = "/venda")
	public String viewDetalheVenda(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("vendas", vendaService.ObterLista(usuario));
		System.out.println("Lista atualizada com sucesso");
		
		model.addAttribute("compradores", animalService.ObterLista(usuario));
		
		
		return "venda/detalhe";
	}
	
	@PostMapping(value = "/venda/incluir")
	public String incluir(Venda venda, @SessionAttribute("user") Usuario usuario) {
		
		
		System.out.println("Venda Cadastrada com sucesso");
		System.out.println(venda.getNome());
		
		venda.setUsuario(usuario);		
		
		vendaService.Incluir(venda);
		
		return "redirect:/venda";
	}
	
	@GetMapping(value = "/venda/{id}/excluir")
	public String excluir(Model model ,@PathVariable Integer id) {
		
		vendaService.Excluir(id);
	
		return "redirect:/venda";
		
	}
	
	
	
}
