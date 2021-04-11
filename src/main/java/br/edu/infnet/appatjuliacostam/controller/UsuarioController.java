package br.edu.infnet.appatjuliacostam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	private Usuario usuario;
	
	@GetMapping(value = "/usuario")
	public String viewDetalheUsuario(Model model, Usuario usuario) {
		
		model.addAttribute("usuarios", usuarioService.ListaOrdenada(usuario));
		System.out.println("Lista atualizada com sucesso");
		System.out.println(usuario);
		
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
	
	@PostMapping(value = "/usuario/login")
	public String LoginAcess(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.autenticacao(email, senha);
		
		
		if (usuario != null) {
			
			model.addAttribute("user", usuario);
			
			return "redirect:/home";
		}
	
		model.addAttribute("alerta", "Email ou senha invalido for favor tente novamente");
		return "login";
	}

}
