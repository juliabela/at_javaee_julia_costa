package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appatjuliacostam.model.negocio.Venda;
import br.edu.infnet.appatjuliacostam.model.service.AnimalService;
import br.edu.infnet.appatjuliacostam.model.service.UsuarioService;
import br.edu.infnet.appatjuliacostam.model.service.VendaService;

@Controller
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@Autowired
	private AnimalService animalService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/venda")
	public String viewDetalheVenda(Model model) {
		model.addAttribute("vendas", vendaService.ObterLista());
		System.out.println("Lista atualizada com sucesso");
		
		model.addAttribute("compradores", animalService.ObterLista());
		
		model.addAttribute("usuarios", usuarioService.ObterLista());
		return "venda/detalhe";
	}
	
	@PostMapping(value = "/venda/incluir")
	public String incluir(Venda venda) {
		
		System.out.println("Venda Cadastrada com sucesso");
		System.out.println(venda.getNome());
		
		vendaService.Incluir(venda);
		return "redirect:/venda";
	}
	
	@GetMapping(value = "/venda/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		vendaService.Excluir(id);

		return "redirect:/venda";
	}
	
	
	
}
