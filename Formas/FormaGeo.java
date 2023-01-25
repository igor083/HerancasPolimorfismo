package exercicioHeranca.Formas;

public abstract class FormaGeo {
	protected Cor cor;

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public abstract Double area();

	public FormaGeo(Cor cor) {
		this.cor = cor;
	}

}
