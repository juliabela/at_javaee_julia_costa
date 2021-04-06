package br.edu.infnet.appatjuliacostam.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	public void Incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void Excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> ObterLista() {
		return (List<Usuario>)usuarioRepository.findAll();
	}
}
