package br.edu.infnet.appatjuliacostam.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appatjuliacostam.model.negocio.Animal;

@Repository
public interface IAnimalRepository extends CrudRepository<Animal, Integer>{

}
