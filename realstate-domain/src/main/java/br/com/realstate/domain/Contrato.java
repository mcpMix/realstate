package br.com.realstate.domain;

import br.com.realstate.domain.commons.DomainModel;
import br.com.realstate.domain.enums.TipoCompetenciaEnum;
import br.com.realstate.domain.enums.TipoContratoEum;
import br.com.realstate.domain.enums.TipoFiancaEnum;
import br.com.realstate.domain.enums.TipoSituacaoContratoEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
	
@Entity
@Getter @Setter
public class Contrato extends DomainModel<Contrato> {

	@NotNull
	@OneToOne
	private Pessoa locador;
	@NotNull
	@OneToOne
	private Pessoa locatario;
	@NotNull
	@Enumerated(value= EnumType.STRING)
	private TipoFiancaEnum fianca;
	@NotNull
	@OneToOne
	private Unidade unidade;
	private Date dataInicio;
	@NotNull(message = "Data de fim obrigatória.")
	private Date datafinal;
	@NotNull(message ="Dia de pagamento é obrigatório")
	private Integer diaVencimento;
	@NotNull(message = "Valor é obrigatório.")
	private Double valor;
	@NotNull(message ="Tipo de contrato é obrigatório.")
	private TipoContratoEum tipoContrato;
	@NotNull(message ="Tipo de situação é obrigatório.")
	private TipoSituacaoContratoEnum tipoSituacao;
	@NotNull(message ="Tipo competência obrigatório.")
	private TipoCompetenciaEnum tipoCompetencia;
	
	@NotNull
	private Imobiliaria imobiliaria;
	@JsonIgnore
	@NotBlank(message = "User é obrigatório.")
	private String user;
	@JsonIgnore
	@NotBlank(message = "DateUpdate é obrigatório.")
	private Date dateUpdate;
	

	

}
