package exercicioHeranca.Contribuinte;

public class PessoaFisica extends Contribuinte {
	private Double gastoSau;

	public Double getGastoSau() {
		return gastoSau;
	}

	public void setGastoSau(Double gastoSau) {
		this.gastoSau = gastoSau;
	}

	public PessoaFisica(String nome, Double rendaAno, Double gastoSau) {
		super(nome, rendaAno);
		this.gastoSau = gastoSau;
	}

	@Override
	public Double imposto() {
		if (this.rendaAno < 20000) {
			return rendaAno * 0.15 - gastoSau * 0.5;
		} else {
			return rendaAno * 0.25 - gastoSau * 0.5;
		}
	}

}
