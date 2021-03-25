package br.com.realstate.domain.enums;



import br.com.realstate.commos.utils.Exception.ImobileServiceException;

import java.util.Arrays;

public enum TipoPessoaEnum {

	FISICA("F"),
	JURIDICA("J");

	
	private String valor;
	
	private TipoPessoaEnum(String valor) {
		this.valor = valor;
	}
	
	public TipoPessoaEnum find(String val) {
	     return Arrays.stream(TipoPessoaEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)	
	            .orElseThrow(() -> new ImobileServiceException(String.format("Unsupported type %s.", val)));
	}
}
