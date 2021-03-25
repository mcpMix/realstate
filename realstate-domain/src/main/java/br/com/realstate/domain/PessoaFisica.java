package br.com.realstate.domain;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;	

@Getter @Setter
@Entity
@DiscriminatorValue(value = "F")
public class PessoaFisica extends Pessoa {

	@NotBlank
	@NotEmpty
	@Column(unique = true)
	private String cpf;
	
	@NotBlank
	@NotEmpty	
	private String sobreNome;
	

}
