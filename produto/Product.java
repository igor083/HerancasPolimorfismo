package exercicioHeranca.produto;

public class Product {
	protected String nome;
	protected Double preco;

	public Product() {
	}

	public Product(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String etiqueta() {
		return nome + " preco: R$" + String.format("%.2f", preco);
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

}
