package exercicioHeranca.Contribuinte;

public class PessoaJuridica extends Contribuinte {
	private Integer funcionarios;

	public PessoaJuridica(String nome, Double rendaAno, Integer funcionarios) {
		super(nome, rendaAno);
		this.funcionarios = funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	@Override
	public Double imposto() {
		if (funcionarios < 10) {
			return rendaAno * 0.16;
		} else {
			return rendaAno * 0.14;
		}
	}
}
