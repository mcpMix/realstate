package br.com.realstate.repository;

import br.com.realstate.domain.PessoaJuridica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaJuridicaRepository extends CrudRepository<PessoaJuridica, Long>{
			
}
