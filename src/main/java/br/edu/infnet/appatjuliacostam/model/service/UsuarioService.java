package br.edu.infnet.appatjuliacostam.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	
	
	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}

	public void Incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void Excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> ObterLista() {
		return (List<Usuario>)usuarioRepository.findAll();
	}
	
	public List<Usuario> ListaOrdenada(Usuario usuario) {
		return (List<Usuario>)usuarioRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	
}
