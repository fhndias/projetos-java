package br.gov.prodegem.projetodesk.entidades;

import java.math.BigDecimal;

public class Carro {
	private Long id;
	private String modelo;
	private String montadora;
	private String placa;
	private String ano;
	private BigDecimal valorDaDiaria;
	private BigDecimal valorDaFracao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMontadora() {
		return montadora;
	}
	
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}

	public BigDecimal getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(BigDecimal valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	public BigDecimal getValorDaFracao() {
		return valorDaFracao;
	}

	public void setValorDaFracao(BigDecimal valorDaFracao) {
		this.valorDaFracao = valorDaFracao;
	}
	
}
