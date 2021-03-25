package br.com.realstate.repository;

import br.com.realstate.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long>  {

}
	