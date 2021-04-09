package br.edu.infnet.appatjuliacostam.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatjuliacostam.model.negocio.Animal;
import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;
import br.edu.infnet.appatjuliacostam.model.repository.IAnimalRepository;

@Service
public class AnimalService {
	
	
	@Autowired
	private IAnimalRepository animalRepository;
	
	public void Incluir(Animal animal) {
		animalRepository.save(animal);
	}
	
	public void Excluir(Integer id) {
		animalRepository.deleteById(id);
	}
	
	public List<Animal> ObterLista() {
		return (List<Animal>)animalRepository.findAll();
	}
	
	public List<Animal> ObterLista(Usuario usuario) {
		return (List<Animal>)animalRepository.obterlista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

}
