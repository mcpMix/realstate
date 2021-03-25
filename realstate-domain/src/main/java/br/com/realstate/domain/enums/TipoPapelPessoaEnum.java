package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoPapelPessoaEnum {

	FISICA("F"),
	JURIDICA("J");

	
	private String valor;
	
	private TipoPapelPessoaEnum(String valor) {
		this.valor = valor;
	}
	
	public TipoPapelPessoaEnum find(String val) {
	     return Arrays.stream(TipoPapelPessoaEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
	}
}
