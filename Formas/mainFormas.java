package exercicioHeranca.Formas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainFormas {
	public static void main(String args[]) {
		List<FormaGeo> lista =new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja calcuular a area de quantas fomas?");
		int contador = sc.nextInt();
		for (int i = 0; i < contador; i++) {
			System.out.println("Forma numero #" + (i + 1));
			System.out.println("Retangulo ou circulo? (r / c)");
			char forma = sc.next().charAt(0);
			if (forma == 'r') {
				Cor cor =escolheCor();

				System.out.println("Digite a altura: ");
				Double altura = sc.nextDouble();
				System.out.println("Digite a largura: ");
				Double largura = sc.nextDouble();

				FormaGeo retangulo = new Retangulo(cor, altura, largura);
				lista.add(retangulo);
			}
			else {
				Cor cor =escolheCor();
				System.out.println("Digite o raio: ");
				Double raio = sc.nextDouble();
				
				FormaGeo circulo = new Circulo(cor,raio);
				lista.add(circulo);
				
			}
		}
		System.out.println("Areas das formas: ");
	for(FormaGeo x : lista){
		System.out.printf("Area: %.2f %s",x.area(),x.getCor());
	}
		

	}

	private static Cor escolheCor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a cor: (p/a/v)");
		char c = sc.next().charAt(0);
		Cor cor;
		if (c == 'p') {
			cor = Cor.valueOf("PRETO");
			return cor;
		}

		else if (c == 'v') {
			cor = Cor.valueOf("VERMELHO");
			return cor;
		}

		else {
			cor = Cor.valueOf("AZUL");
			return cor;
		}
	}
}
