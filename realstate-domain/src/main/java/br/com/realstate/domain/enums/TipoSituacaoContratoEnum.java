package br.com.realstate.domain.enums;

import java.util.Arrays;

public enum TipoSituacaoContratoEnum {
	
	ATIVO("A"),
	INATIVO("I"),
	SUSPENSO("S"),
	SOBJUDICE("SJ");
	
	private String valor;
	
	private TipoSituacaoContratoEnum(String valor) {
		this.valor= valor;
	}
	
	public static TipoSituacaoContratoEnum find(String val) {
	     return Arrays.stream(TipoSituacaoContratoEnum.values())
	            .filter(e -> e.valor.equals(val))
	            .reduce((t1, t2) -> t1)
	            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", val)));
	}

}
