package br.edu.infnet.appatjuliacostam.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatjuliacostam.model.negocio.Animal;

@Repository
public interface IAnimalRepository extends CrudRepository<Animal, Integer>{
	
	@Query("from Animal a where a.usuario.id=:id")
	List<Animal>obterlista(Integer id, Sort by);

}
