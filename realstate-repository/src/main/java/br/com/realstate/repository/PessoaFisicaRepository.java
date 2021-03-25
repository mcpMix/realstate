package br.com.realstate.repository;

import br.com.realstate.domain.PessoaFisica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaFisicaRepository extends CrudRepository<PessoaFisica, Long>{
		
}
