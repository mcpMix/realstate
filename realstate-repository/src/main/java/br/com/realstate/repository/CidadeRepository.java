package br.com.realstate.repository;

import br.com.realstate.domain.Cidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository	
public interface CidadeRepository extends CrudRepository<Cidade, Long>{

}
