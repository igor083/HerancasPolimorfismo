package exercicioHeranca.EmpregadoAtiv;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmp {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Empregado> listEmp = new ArrayList<>();

		System.out.print("Digite a quantidade de funcionarios a serem analisados: ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println((i + 1) + "o" + " Empregado");
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor da hora: ");
			double valorHora = sc.nextDouble();
			sc.nextLine();
			System.out.println("E terceirizado? ");
			String terc = sc.nextLine();
			String ini = terc.toUpperCase();

			if (ini.equals("SIM")) {
				System.out.println("Gasto adicional: ");
				Double gasto = sc.nextDouble();
				Empregado empregado = new EmpregadoTerceirizado(nome, horas, valorHora, gasto);
				listEmp.add(empregado);

			} else {
				Empregado empregado = new Empregado(nome, horas, valorHora);
				listEmp.add(empregado);
			}
		}
		for (Empregado x : listEmp) {
			System.out.printf("%S - R$%.2f\n", x.getNome(), x.pagamento());
		}
		sc.close();
	}
}