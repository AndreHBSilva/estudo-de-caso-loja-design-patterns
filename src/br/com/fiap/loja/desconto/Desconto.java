package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public abstract class Desconto {

	protected Desconto proximo;
	protected String valorDesconto;
	
	public Desconto(Desconto proximo, String valorDesconto) {
		super();
		this.proximo = proximo;
		this.valorDesconto = valorDesconto;
	}

	public final BigDecimal calcular(Pedido pedido) {
		if (deveAplicar(pedido)) {
			return aplicarDesconto(pedido);
		}
		
		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicarDesconto(Pedido pedido);

	protected abstract boolean deveAplicar(Pedido pedido);
}
