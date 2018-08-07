package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoCartao extends Pagamento {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1l;
	/**
	 * 
	 */
	private Integer numeroParcelas;

	public PagamentoCartao() {
		super();

	}

	public PagamentoCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(id, estado, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

}
