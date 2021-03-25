package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoContratoEum {

	COMERCIAL("C"), RESIDENCIAL("R");

	private String valor;

	private TipoContratoEum(String valor) {
		this.valor = valor;
	}
			
	public static TipoContratoEum find(String val) {
	     return Arrays.stream(TipoContratoEum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
	}

}
