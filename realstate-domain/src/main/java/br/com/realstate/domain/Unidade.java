package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import br.com.realstate.domain.enums.TipoImovelEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Getter @Setter
public class Unidade extends DomainModel<Unidade> {

	@Enumerated(EnumType.STRING)
	private TipoImovelEnum tipoImovel;
	
	@NotBlank(message = "Cidade é obrigatório.")
	private String cidade;
	@NotBlank(message = "Logradouro é obrigatório.")
	private String logradouro;
	@NotBlank(message = "Número é obrigatório.")
	private String numero;
	private String complemento;
	@NotBlank(message = "Uf é obrigatório.")
	private String uf;
	@JsonIgnore
	@NotBlank(message = "User é obrigatório.")
	private String user;
	@JsonIgnore
	@NotBlank(message = "DateUpdate é obrigatório.")
	private Date dateUpdate;
	
	

}
