package exercicioHeranca.produto;

public class ProdutoImportado extends Product {

	private Double taxaAlfan;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfan) {
		super(nome, preco);
		this.taxaAlfan = taxaAlfan;

	}

	public Double precoTotal() {
		return preco + taxaAlfan;
	}

	@Override
	public String etiqueta() {
		return nome + " preco: R$" + String.format("%.2f (Taxado em: %.2f)", this.precoTotal(), taxaAlfan);
	}
}
