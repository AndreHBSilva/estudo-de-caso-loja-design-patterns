package br.com.fiap.loja.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class Iss implements Imposto {

	private final BigDecimal VALOR_IMPOSTO = new BigDecimal(0.1);
	
	@Override
	public BigDecimal calcular(Pedido pedido) {
		return pedido.getValor().multiply(VALOR_IMPOSTO);
	}

}
