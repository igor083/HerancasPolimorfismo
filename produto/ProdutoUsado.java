package exercicioHeranca.produto;

import java.time.LocalDate;

public class ProdutoUsado extends Product {
	private LocalDate dataFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String etiqueta() {
		return nome + ",(Usado) - preco: R$" + String.format("%.2f ", preco) + "Fabricado em: " + dataFabricacao;
	}
}
