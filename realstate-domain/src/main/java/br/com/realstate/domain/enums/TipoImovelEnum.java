package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoImovelEnum {
	
	CASA("C"),
	APARTAMENTO("A"),
	LOJA("L"),
	GALPAO("G"),
	GARAGEM("GG");
	
	private String valor;
	
	private TipoImovelEnum(String valor) {
		this.valor = valor;
	}
	
	public static TipoImovelEnum find(String val) {
	     return Arrays.stream(TipoImovelEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() ->  new IllegalStateException(String.format("Unsupported type %s.", val)));
	}

}
