package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoFiancaEnum {

	FIADOR("F"), CAUCAO("R"), SEGURO("S");

	private String valor;

	private TipoFiancaEnum(String valor) {
		this.valor = valor;
	}
			
	public static TipoFiancaEnum find(String val)  {
	     return Arrays.stream(TipoFiancaEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() ->  new IllegalStateException(String.format("Unsupported type %s.", val)));
	}

}
