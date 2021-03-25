package br.com.realstate.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.realstate.domain.commons.DomainModel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pagamento  extends DomainModel<Contrato> {

	@NotBlank(message = "User é obrigatório.")
	private String user;
	@NotBlank(message = "DateUpdate é obrigatório.")
	private Date dateUpdate;

}
