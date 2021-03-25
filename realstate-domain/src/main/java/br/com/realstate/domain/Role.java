package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Getter @Setter
public class Role extends DomainModel<Role> {

	@NotBlank
	private String nome;
		
	@NotBlank
	private String descricao;
		
	@ManyToMany
	private List<Usuario> usuarios;


}
