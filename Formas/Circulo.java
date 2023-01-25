package exercicioHeranca.Formas;

public class Circulo extends FormaGeo {

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;

	}

	private Double raio;

	public Double getRaio() {
		return raio;
	}

	public Double area() {
		return raio * raio * 3.14159;
	}
}
