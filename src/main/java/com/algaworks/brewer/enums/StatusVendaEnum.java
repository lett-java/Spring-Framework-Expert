package com.algaworks.brewer.enums;

import lombok.Getter;

@Getter
public enum StatusVendaEnum {

	ORCAMENTO("Orçamento"), 
	EMITIDA("Emitida"), 
	CANCELADA("Cancelada");

	private String descricao;

	StatusVendaEnum(String descricao) {
		this.descricao = descricao;
	}

}
