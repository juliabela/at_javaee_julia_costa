package br.edu.infnet.appatjuliacostam.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appatjuliacostam.model.negocio.Venda;

@Repository
public interface IVendaRepository extends CrudRepository<Venda, Integer> {

	
}
