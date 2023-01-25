package exercicioHeranca.Formas;

public class Retangulo extends FormaGeo {
	public Retangulo(Cor cor, Double altura, Double largura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;

	}

	private Double altura;
	private Double largura;

	public Double getAltura() {
		return altura;
	}

	public Double getLargura() {
		return largura;
	}

	@Override
	public Double area() {
		return altura*largura;
	}

}
