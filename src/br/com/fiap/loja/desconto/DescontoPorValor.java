package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class DescontoPorValor extends Desconto {
	
	public DescontoPorValor(Desconto proximo, String valorDesconto) {
		super(proximo, valorDesconto);
	}

	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(valorDesconto));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getValor().compareTo(new BigDecimal(500)) > 0;
	}

}
