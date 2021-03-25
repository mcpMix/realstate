package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoCompetenciaEnum {
	
	ATUAL("A"),
	PASSADA("P");
	
	private String valor;
	
	private TipoCompetenciaEnum(String valor) {
		this.valor = valor;
	}
	
	public static TipoCompetenciaEnum find(String val) {
	     return Arrays.stream( TipoCompetenciaEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
	}
}
