package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {

		final int tamanho = 80;
		double valorTotal = 0;
		char opcao, continua, continuaCompra;
		int anoNascimento, qtdeVendida, produtoCompra, entrada, anoAtual = 2020;
		String nome, cpf, compararProduto;
		char genero;

		List<Produto> lista = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();

		lista.add(new Produto("E-001", "Televisão", 1000.00, 10));
		lista.add(new Produto("E-002", "Celular", 1000.00, 10));
		lista.add(new Produto("E-003", "Notebook", 1000.00, 10));
		lista.add(new Produto("E-004", "Fogão", 1000.00, 10));
		lista.add(new Produto("E-005", "Geladeira", 1000.00, 10));
		lista.add(new Produto("E-006", "Lava e seca", 1000.00, 10));
		lista.add(new Produto("E-007", "Cooktop", 1000.00, 10));
		lista.add(new Produto("E-008", "Microondas", 1000.00, 10));
		lista.add(new Produto("E-009", "Fritadeira elétrica", 1000.00, 10));
		lista.add(new Produto("E-010", "Forno", 1000.00, 10));
		

		Scanner leia = new Scanner(System.in);

		linha(tamanho);
		System.out.println("\n\t\t\t\t   EletroLu");
		linha(tamanho);
		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nDigite seu gênero [M] Masculino,[F] Feminino ou [O] Não-Binário: ");
		genero = leia.next().toUpperCase().charAt(0);
		while (genero != 'M' && genero != 'F' && genero != 'O') {
			System.out.println("Valor incorreto. Digite seu gênero [M] Masculino,[F] Feminino ou [O] Não-Binário: ");
			genero = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		while (anoNascimento < 1850 || anoNascimento > anoAtual) {
			System.out.println("Ano incorreto. Digite novamente seu ano de nascimento: ");
			anoNascimento = leia.nextInt();
		}
		leia.nextLine();
		System.out.println("Digite o seu cpf: ");
		cpf = leia.nextLine();

		Cliente cliente1 = new Cliente(nome, genero, anoNascimento, cpf);
		do {
			linha(tamanho);
			if (tratamento(genero) == 'o') {
				System.out.println("\nSeja bem-vind" + tratamento(genero) + " a loja senhor " + cliente1.getNome());
			} else {
				System.out.println("\nSeja bem-vind" + tratamento(genero) + " a loja senhor" + tratamento(genero) + " "
						+ cliente1.getNome());
			}
			System.out.println("Cpf: " + cliente1.getCpf());
			System.out.printf("Idade: %d anos\n", cliente1.retornaIdade(anoAtual));

			linha(tamanho);

			System.out.println("\n[1] - Comprar produtos");
			System.out.println("[2] - Gerenciar estoques");
			System.out.println("[3] - Sair");
			System.out.println("\nDigite a opção: ");
			opcao = leia.next().charAt(0);
			while (opcao != '1' && opcao != '2' && opcao != '3') {
				System.out.println("Opção incorreto. Digite a opção: ");
				opcao = leia.next().charAt(0);
			}
			if (opcao == '1') {
				do {
					linha(tamanho);
					System.out.println("\n\t\t\t   Lista de Produtos");
					linha(tamanho);
					System.out.println("\nCódigo\t\tPreço\t     Quantidade\t\tProduto");
					for (Produto i : lista) {
						System.out.printf("\n%s\t\t%.2f\t\t%d\t\t%s", i.getCodigo(), i.getPrecoUnitario(),
								i.getQtdeProdutoEstoque(), i.getNomeProduto());
					}
					System.out.println("\n\nDigite o código do produto de [0 à 10] que será comprado: ");
					produtoCompra = leia.nextInt();
					if (produtoCompra < 10) {
						compararProduto = "E-00" + (produtoCompra);
					} else {
						compararProduto = "E-0" + (produtoCompra);
					}
					System.out.println("Digite a quantidade: ");
					qtdeVendida = leia.nextInt();
					while (qtdeVendida < 0) {
						System.out.println("Valor incorreto. Digite a quantidade: ");
						qtdeVendida = leia.nextInt();
					}
					for (Produto i : lista) {
						if (compararProduto.equals(i.getCodigo())) {
							if (i.venda(qtdeVendida)) {
								i.carrinho(qtdeVendida);
								valorTotal += i.carrinho(qtdeVendida);
								i.tiraEstoque(qtdeVendida);
								i.setQtdeVendida(qtdeVendida);
								carrinho.add(i);
							} else {
								System.out.println("\nQuantidade indisponível no estoque!");
							}
						}
					}
					System.out.print("\nVocê deseja comprar mais algum produto (S ou N)? ");
					continuaCompra = leia.next().toUpperCase().charAt(0);
					while (continuaCompra != 'S' && continuaCompra != 'N') {
						System.out.print("\nOpção incorreta. Você deseja comprar mais algum produto (S ou N)? ");
						continuaCompra = leia.next().toUpperCase().charAt(0);
					}
				} while (continuaCompra == 'S');
				
				
				Produto P = new Produto("",""  , 1000.00,10);
				P.avista(valorTotal);
				System.out.println("\nDigite [1] para pagar avista com 10% de desconto no valor de R$ "+P.avista(valorTotal));
				System.out.println("\nDigite [2] para pagar no débito no valor de R$ "+P.debito(valorTotal));
				System.out.println("\nDigite [3] para pagar no crédito com acrescimo de 5% no valor de R$ "+P.credito(valorTotal));
				System.out.print("\nDigite [4] para pagar parcelado em até 3x ");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao == '1')
				{	
					linha(tamanho);
					System.out.println("\n\t\t\t\t NOTA FISCAL");
					linha(tamanho);
					System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
					linha(tamanho);
					for (Produto i : carrinho) {
						System.out.printf("\n%s\t  %s\t\t   %d\t\t %.2f %.2f\n", i.getCodigo(), i.getNomeProduto(),
								i.getQtdeVendida(), P.avista(valorTotal)/i.getQtdeVendida(), (P.avista(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida() );
					}
					linha(tamanho);
					System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.avista(valorTotal));
					linha(tamanho);
				}
				if (opcao == '2')
				{	
					linha(tamanho);
					System.out.println("\n\t\t\t\t NOTA FISCAL");
					linha(tamanho);
					System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
					linha(tamanho);
					for (Produto i : carrinho) {
						System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
								i.getQtdeVendida(), P.debito(valorTotal)/i.getQtdeVendida(),( P.debito(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida() );
					}
					linha(tamanho);
					System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.debito(valorTotal));
					linha(tamanho);
				}
				if (opcao == '3')
				{	
					linha(tamanho);
					System.out.println("\n\t\t\t\t NOTA FISCAL");
					linha(tamanho);
					System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
					linha(tamanho);
					for (Produto i : carrinho) {
						System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
								i.getQtdeVendida(), P.credito(valorTotal)/i.getQtdeVendida(),( P.credito(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida());
					}
					linha(tamanho);
					System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.credito(valorTotal));
					linha(tamanho);
				}
				else if (opcao == '4')
				{
					System.out.printf("\nDigite [1] para pagar em 1 parcela no valor de R$ %.2f",P.parcelado(valorTotal));
					System.out.printf("\nDigite [2] para pagar em 2 parcelas no valor de R$ %.2f cada parcela ",P.parcelado(valorTotal)/2);
					System.out.printf("\nDigite [3] para pagar em 3 parcelas no valor de R$ %.2f cada parcela ",P.parcelado(valorTotal)/3);
					opcao = leia.next().toUpperCase().charAt(0);
					if (opcao == '1')
					{
						linha(tamanho);
						System.out.println("\n\t\t\t\t NOTA FISCAL");
						linha(tamanho);
						System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
						linha(tamanho);
						for (Produto i : carrinho) {
							System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
									i.getQtdeVendida(), P.parcelado(valorTotal)/i.getQtdeVendida(),( P.parcelado(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida());
						}
						linha(tamanho);
						System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.parcelado(valorTotal));
						linha(tamanho);
					}
					else if (opcao == '2')
					{
						linha(tamanho);
						System.out.println("\n\t\t\t\t NOTA FISCAL");
						linha(tamanho);
						System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
						linha(tamanho);
						for (Produto i : carrinho) {
							System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
									i.getQtdeVendida(), P.parcelado(valorTotal)/i.getQtdeVendida(),( P.parcelado(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida());
						}
						linha(tamanho);
						System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.parcelado(valorTotal));
						linha(tamanho);
					}
					else if (opcao == '3')
					{
						linha(tamanho);
						System.out.println("\n\t\t\t\t NOTA FISCAL");
						linha(tamanho);
						System.out.println("\nCÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
						linha(tamanho);
						for (Produto i : carrinho) {
							System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
									i.getQtdeVendida(), P.parcelado(valorTotal)/i.getQtdeVendida(),( P.parcelado(valorTotal)/i.getQtdeVendida()) * i.getQtdeVendida());
						}
						linha(tamanho);
						System.out.printf("\n\t\t\t\t\t    VL. TOTAL R$ %.2f\n",P.parcelado(valorTotal));
						linha(tamanho);
					}
				}
			
				System.out.print("\n\nVocê deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				if (continua == 'N')
				{
					System.out.println("\nObrigado! Volte sempre.");
				}
				while (continua != 'S' && continua != 'N') {
					System.out.print("\nOpção incorreta. Você deseja voltar para o menu (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} else if (opcao == '2') {
				do {
					linha(tamanho);
					System.out.println("\n\t\t\t  Controle de Estoque");
					linha(tamanho);
					System.out.println("\nCódigo\t\t     Quantidade\t\tProduto");
					for (Produto i : lista) {
						System.out.printf("\n%s\t\t\t%d\t\t%s", i.getCodigo(), i.getQtdeProdutoEstoque(),
								i.getNomeProduto());
					}
					System.out.println("\n\nDigite o código do produto que deseja repor o estoque : ");
					produtoCompra = leia.nextInt();
					if (produtoCompra < 10) {
						compararProduto = "E-00" + (produtoCompra);
					} else {
						compararProduto = "E-0" + (produtoCompra);
					}
					System.out.println("Digite a quantidade: ");
					entrada = leia.nextInt();
					if (entrada < 0) {
						System.out.println("Valor incorreto. Digite a quantidade: ");
						qtdeVendida = leia.nextInt();
					}
					for (Produto i : lista) {
						if (compararProduto.equals(i.getCodigo())) {
							if ((i.getQtdeProdutoEstoque() + entrada) > 10) {
								System.out.println("Quantidade  de estoque acima do permitido!");
							} else {
								i.adicionarEstoque(entrada);
							}
						}
					}
					System.out.print("\n\nVocê deseja comprar mais algum produto (S ou N)? ");
					continuaCompra = leia.next().toUpperCase().charAt(0);
					while (continuaCompra != 'S' && continuaCompra != 'N') {
						System.out.print("\nOpção incorreta. Você deseja comprar mais algum produto (S ou N)? ");
						continuaCompra = leia.next().toUpperCase().charAt(0);
					}
				} while (continuaCompra == 'S');
				System.out.println("\nVocê deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
				if (continua == 'N')
				{
					System.out.println("\nObrigado! Volte sempre.");
				}
				while (continua != 'S' && continua != 'N') {
					System.out.print("Opção incorreta. Você deseja voltar para o menu (S ou N)? ");
					continua = leia.next().toUpperCase().charAt(0);
				}
			} else {
				System.out.printf("Obrigado! Volte sempre.");
				continua = 'N';
			}
		} while (continua == 'S');
		//System.out.printf("Obrigado! Volte sempre.");
	}

	static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("═");
		}
	}

	public static char tratamento(char genero) {

		char pronome;

		if (genero == 'M') {
			pronome = 'o';
		} else if (genero == 'F') {
			pronome = 'a';
		} else {
			pronome = 'x';
		}
		return pronome;
	}
}