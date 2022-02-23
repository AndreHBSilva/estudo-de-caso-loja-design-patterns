package br.com.fiap.loja.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.Pedido;

public class CalculadoraDeImposto {
	
	public BigDecimal calcular(Pedido pedido, Imposto imposto) {
		return imposto.calcular(pedido);
	}

}
