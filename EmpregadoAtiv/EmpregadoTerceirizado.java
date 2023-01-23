package exercicioHeranca.EmpregadoAtiv;

public class EmpregadoTerceirizado extends Empregado {

	private Double gastoAdic;

	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer horas, Double valorHora, Double gastoAdic) {
		super(nome, horas, valorHora);
		this.gastoAdic = gastoAdic;
	}

	public Double getGastoAdic() {
		return gastoAdic;
	}

	public void setGastoAdic(Double gastoAdic) {
		this.gastoAdic = gastoAdic;
	}

	@Override
	public Double pagamento() {
		return horas * valorHora + (gastoAdic * 1.1);
	}
}
