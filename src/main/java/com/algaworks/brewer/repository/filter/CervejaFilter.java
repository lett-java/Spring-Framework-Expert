package com.algaworks.brewer.repository.filter;

import java.math.BigDecimal;

import com.algaworks.brewer.enums.OrigemEnum;
import com.algaworks.brewer.enums.SaborEnum;
import com.algaworks.brewer.model.Estilo;

public class CervejaFilter {

	private String sku;
	private String nome;
	private Estilo estilo;
	private SaborEnum sabor;
	private OrigemEnum origem;
	private BigDecimal valorDe;
	private BigDecimal valorAte;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public SaborEnum getSabor() {
		return sabor;
	}

	public void setSabor(SaborEnum sabor) {
		this.sabor = sabor;
	}

	public OrigemEnum getOrigem() {
		return origem;
	}

	public void setOrigem(OrigemEnum origem) {
		this.origem = origem;
	}

	public BigDecimal getValorDe() {
		return valorDe;
	}

	public void setValorDe(BigDecimal valorDe) {
		this.valorDe = valorDe;
	}

	public BigDecimal getValorAte() {
		return valorAte;
	}

	public void setValorAte(BigDecimal valorAte) {
		this.valorAte = valorAte;
	}

}
