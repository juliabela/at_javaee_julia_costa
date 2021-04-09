package br.edu.infnet.appatjuliacostam.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.negocio.Venda;
import br.edu.infnet.appatjuliacostam.model.repository.IVendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private IVendaRepository vendaReprository;
	
	public void Incluir(Venda venda) {
		vendaReprository.save(venda);
	}
	
	public void Excluir(Integer id) {
		vendaReprository.deleteById(id);
	}
	
	public List<Venda> ObterLista() {
		return (List<Venda>)vendaReprository.findAll();
	}
	
	public List<Venda> ObterLista(Usuario usuario) {
		return (List<Venda>)vendaReprository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

}
