package exercicioHeranca.Contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContribuinteMain {

	public static void main(String[] args) {
		List<Contribuinte> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de contribuintes: ");
		int numC = sc.nextInt();

		for (int i = 0; i < numC; i++) {
			System.out.println("Pessoa fisica ou juuridica? (f/j)");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			Double renda = sc.nextDouble();

			if (tipo == 'f') {
				System.out.println("Gasto com saude: ");
				Double gastoSau = sc.nextDouble();
				Contribuinte contribuinte = new PessoaFisica(nome, renda, gastoSau);
				lista.add(contribuinte);

			} else {
				System.out.println("Numero de funcionarios: ");
				Integer numFuncionarios = sc.nextInt();
				Contribuinte contribuinte = new PessoaJuridica(nome, renda, numFuncionarios);
				lista.add(contribuinte);
			}

		}
		Double soma = 0.0;
		System.out.println("Impostos:");
		for (Contribuinte x : lista) {
			soma += x.imposto();
			System.out.printf("%s: $ %.2f \n", x.getNome(), x.imposto());
		}
		System.out.printf("\nTotal de imposto: $ %.2f", soma);
		sc.close();
	}
}
