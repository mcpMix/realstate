package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
		
@Getter
@Setter
@Entity
public class Usuario  extends DomainModel<Usuario> {

	@NotBlank
	private String nome;
	@NotBlank
	@Column(unique = true)
	private String login;
	@NotBlank
	@JsonIgnore
	private String senha;
	@NotNull	
	private Boolean isAtivo;
	@NotNull
	@OneToOne
	private Imobiliaria imobiliaria;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Role> roles;



}
