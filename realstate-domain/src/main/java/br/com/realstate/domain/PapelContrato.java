package br.com.realstate.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.realstate.domain.commons.DomainModel;
import br.com.realstate.domain.enums.TipoPapelPessoaEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PapelContrato  extends DomainModel<Contrato> {
	
	private Pessoa pessoa;
	@Enumerated(EnumType.STRING)
	private TipoPapelPessoaEnum papel;

}
