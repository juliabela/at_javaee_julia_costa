package br.edu.infnet.appatjuliacostam.model.repository;

import org.springframework.stereotype.Repository;
import br.edu.infnet.appatjuliacostam.model.negocio.Usuario;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer>{

}
