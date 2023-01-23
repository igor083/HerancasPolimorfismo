package exercicioHeranca.produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) throws ParseException {
		List<Product> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a quantidade de produtos: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println((i + 1) + "o" + " Produto");
			System.out.println("Comum, usado ou importado? (c/u/i)");
			char estado = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Preco: ");
			Double preco = sc.nextDouble();
			if (estado == 'i') {
				System.out.println("Taxa de alfandega: ");
				Double taxa = sc.nextDouble();

				Product produto = new ProdutoImportado(nome, preco, taxa);
				lista.add(produto);
			}
			if (estado == 'c') {
				Product produto = new Product(nome, preco);
				lista.add(produto);
			}
			if (estado == 'u') {
				SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("Data de fabricacao: (dd/mm/aaaa)");
				String data = sc.nextLine();
				LocalDate dataFab = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product produto = new ProdutoUsado(nome, preco, dataFab);
				lista.add(produto);
			}

		}
		System.out.println("Etiquetas de preco: ");
		for (Product x : lista) {
			System.out.println(x.etiqueta());
		}

	}

}
