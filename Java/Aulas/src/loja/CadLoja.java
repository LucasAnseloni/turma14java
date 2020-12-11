package loja;

import java.util.Scanner;

public class CadLoja {

	private static final int TAMANHO = 80;

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String produtos[] = { "TELEVISAO", "CELULAR", "NOTEBOOK", "FOGAO", "GELADEIRA", "LAVAESECA", "COOKTOP",
				"MICROONDAS", "FORNO", "FRITADEIRA" };
		double valores[] = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
		int estoques[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		String codigos[] = { "E-01", "E-02", "E-03", "E-04", "E-05", "E-06", "E-07", "E-08", "E-09", "E-10" };
		char opcao = 's';
		String opcaoProduto;
		int opcaoUnidades = 0;
		int aux = 0;

		for (int i = 0; i < 10; i++) {
			estoques[i] = 10;
			codigos[i] = (i < 9) ? "E-00" + (i + 1) : "E-0" + (i + 1);

		}

		do {

			linha(TAMANHO);
			System.out.print("\n");
			System.out.println("                        ELETROLU");
			linha(80);
			System.out.println("\n[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			System.out.println("DIGITE A OPÇÃO: ");
			char opcaoMenu = leia.next().charAt(0);

			switch (opcaoMenu) {
			case '1':
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("\nSeja bem-vind%s a EletroLu %s!!!\n\n", voltaGenero(generoCliente), nomeCliente);
				linha(80);
				System.out.println("\nCODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
				linha(80);
				System.out.println();

				for (int i = 0; i < 10; i++) {
					System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n", codigos[i], valores[i], estoques[i], produtos[i]);
				}

				linha(80);
				do {
					System.out.println("\nEscolha o produto pelo codigo :");// if (codigos[x].equals(escolha))
					opcaoProduto = leia.next().toUpperCase();
				} while (!(opcaoProduto.equals("E-001")) && !(opcaoProduto.equals("E-002"))
						&& !(opcaoProduto.equals("E-003")) && !(opcaoProduto.equals("E-004"))
						&& !(opcaoProduto.equals("E-005")) && !(opcaoProduto.equals("E-006"))
						&& !(opcaoProduto.equals("E-007")) && !(opcaoProduto.equals("E-008"))
						&& !(opcaoProduto.equals("E-009")) && !(opcaoProduto.equals("E-010")));
				for (int i = 0; i < 10; i++) {
					if (codigos[i].equals(opcaoProduto)) {
						System.out.println("Quantas unidades deseja comprar ?");
						opcaoUnidades = leia.nextInt();
						aux = i;

						if (opcaoUnidades <= estoques[i]) {
							estoques[i] -= opcaoUnidades;

						} else {
							System.out.println("Quantidade não permitida !");
						}

					}

				}
				System.out.printf("%s %d %.2f", produtos[aux], opcaoUnidades, valores[aux]);
				break;

			case '2':
				System.out.println("WIP"); // work in progress
				break;

			case '3':
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;

			}
			System.out.println("\nVoce gostaria de continuar [1] sim , [2] não");
			opcao = leia.next().charAt(0);
		} while (opcao == '1');

		leia.close();

	}

	public static void linha(int TAMANHO) {
		for (int i = 0; i < TAMANHO; i++)
			System.out.print("-");
	}

	public static String voltaGenero(char generoCliente) {

		String tipo;
		if (generoCliente == 'M') {
			tipo = "o";
		} else if (generoCliente == 'F') {
			tipo = "a";
		} else if (generoCliente == 'O') {
			tipo = "x";
		} else {
			tipo = "*";
		}

		return tipo;

	}

}
