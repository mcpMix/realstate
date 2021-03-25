package br.com.realstate.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;	

@Getter @Setter
@Entity
@DiscriminatorValue(value = "J")
public class PessoaJuridica extends Pessoa {

	private String cnpj;
		
	private String nomeFantasia;
	
	private String nomeResponsavel;

}
