package exercicioHeranca.Contribuinte;

public abstract class Contribuinte {
	public String getNome() {
		return nome;
	}

	public Double getRendaAno() {
		return rendaAno;
	}

	protected String nome;
	protected Double rendaAno;

	public Contribuinte(String nome, Double rendaAno) {

		this.nome = nome;
		this.rendaAno = rendaAno;
	}

	public abstract Double imposto();
}
