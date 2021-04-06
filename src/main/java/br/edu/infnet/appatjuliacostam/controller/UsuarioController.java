package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String viewDetalheUsuario(Model model) {		
		model.addAttribute("usuarios", usuarioService.ObterLista());
		System.out.println("Lista atualizada com sucesso");
		return "usuario/detalhe";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
	
		usuarioService.Incluir(usuario);
		System.out.println("Usuario Cadastrado com sucesso");
		System.out.println(usuario.getNome());
		
		return "redirect:/usuario";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.Excluir(id);
		
		return "redirect:/usuario";
	}

}
