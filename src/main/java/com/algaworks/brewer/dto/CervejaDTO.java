package com.algaworks.brewer.dto;

import java.math.BigDecimal;

import com.algaworks.brewer.enums.OrigemEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CervejaDTO {
	
	@EqualsAndHashCode.Include
	private Long codigo;
	
	private String sku;
	private String nome;
	private String origem;
	private BigDecimal valor;
	private String foto;
	
	public CervejaDTO(Long codigo, String sku, String nome, OrigemEnum origem, BigDecimal valor, String foto) {
		this.codigo = codigo;
		this.sku = sku;
		this.nome = nome;
		this.origem = origem.getDescricao();
		this.valor = valor;
		this.foto = foto;
	}
	
	
	
	

}
