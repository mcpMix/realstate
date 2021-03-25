package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import br.com.realstate.domain.enums.TipoPessoaEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter @Setter
@Entity
public class Imobiliaria  extends DomainModel<Imobiliaria> {

	@NotBlank(message = "Cidade é obrigatório.")
	private String nome;
	
	@NotBlank(message = "Tipo de pessoa é obrigatório.")
	@Enumerated(value= EnumType.STRING)
	private TipoPessoaEnum tipoPessoaEnum;
	
	@NotBlank(message = "Tipo de pessoa é obrigatório.")
	private String cpfCnpj;
	
	@NotBlank(message = "Creci é obrigatório.")
	private String creci;
	
	@Lob
	private byte[] logo;
	
	private String telFixo;
	private String email;
	private String telCel;
	@NotBlank(message = "Cidade é obrigatório.")
	private String cidade;
	@NotBlank(message = "Logradouro é obrigatório.")
	private String logradouro;
	@NotBlank(message = "Bairro é obrigatório.")
	private String bairro;
	@NotBlank(message = "Cep é obrigatório.")
	private String cep;
	@NotBlank(message = "Número é obrigatório.")
	private String numero;
	private String complemento;
	@NotBlank(message = "Uf é obrigatório.")
	private String uf;
	@JsonIgnore
	@NotBlank(message = "User é obrigatório.")
	private String user;
	@JsonIgnore
	@NotNull(message = "DateUpdate é obrigatório.")
	private Date dateUpdate;

}
