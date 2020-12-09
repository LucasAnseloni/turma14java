package loja;

import java.util.Scanner;

public class CadLoja {

	private static final int TAMANHO = 80;

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char opcao = 's';

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
			case '1': {
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s a EletroLu %s!!!", voltaGenero(generoCliente), nomeCliente);

				break;

			}
			case '2': {
				System.out.println("WIP"); // work in progress
				break;
			}
			case '3': {
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;
			}

			}
			System.out.println("\nVoce gostaria de continuar [1] sim , [2] não");
			opcao = leia.next().charAt(0);
		} while (opcao == '1');

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
