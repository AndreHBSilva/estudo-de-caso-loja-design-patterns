package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Pedido pedido) {
		Desconto cadeiaDeDesconto = 
			new DescontoPorValor(
				new DescontoPorQuantidade(
						new SemDesconto(), "0.05"
				), 
			"0.1");
		
		return cadeiaDeDesconto.calcular(pedido);
	}
}
