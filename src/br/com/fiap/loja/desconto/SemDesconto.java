package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null, "0.0");
	}

	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

}
