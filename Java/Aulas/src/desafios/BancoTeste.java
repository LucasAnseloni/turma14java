package desafios;


		import java.util.Scanner;

import Bancos.ContaCorrente;
import Bancos.ContaPoupanca;


		public class BancoTeste {
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				final int MAX_MOVIMENTOS = 3;
				int data, quantidadeTalao, numeroConta = 0;
				double valor;
				char opcao, operacao, opConta;
				System.out.println("Banco Teste para uso");
				do {
					System.out.println("[1] - Abertura de conta:");
					System.out.println("[2] - Acesso a uma conta existente");
					System.out.println("[3] - Sair");
					operacao = sc.next().charAt(0);
					if (operacao == '1') {
						System.out.println("1 - Conta Poupança");
						System.out.println("2 - Conta Corrente");
						System.out.println("3 - Conta Especial");
						System.out.println("4 - Conta Empresa");
						System.out.println("5 - conta Universitaria");
						System.out.print("Digite o numero de sua opção: ");
						opConta = sc.next().charAt(0);
						numeroConta++;
						sc.nextLine();
						System.out.println("Digite o seu CPF: ");
						String cpfConta = sc.nextLine();
						switch (opConta) {
						case '1':
							System.out.println("Digite a data de aniversario da conta: ");
							int dataAniversarioConta = sc.nextInt();
							ContaPoupanca cp = new ContaPoupanca(numeroConta, cpfConta, dataAniversarioConta);
							System.out.println("Digite a data de hoje: ");
							data = sc.nextInt();
							System.out.println("\nConta Poupança");
							System.out.println("Número da conta: " + cp.getNumConta());
							System.out.println("CPF: " + cp.getCpfConta());
							System.out.println("Aniversário da conta: " + cp.getDataAniversarioConta());
							for (int i = 0; i < MAX_MOVIMENTOS; i++) {
								do {
									System.out.println("Você quer [D] Depositar ou [R] Retirar?");
									opcao = sc.next().toUpperCase().charAt(0);
								} while (opcao != 'D' && opcao != 'R');
								if (opcao == 'D') {
									System.out.println("Digite o valor de depósito: ");
									valor = sc.nextDouble();
									cp.depositar(valor);
								} else {
									System.out.println("Digite o valor de retirada: ");
									valor = sc.nextDouble();
									cp.retirar(valor);
								}
							}
							cp.correcaoPoupanca(data);
							System.out.println("Saldo total: " + cp.getSaldoConta());
							
							break;
						case '2':
							ContaCorrente dm = new ContaCorrente(2, "319.561.590-88");
							System.out.println("\nConta Corrente");
							System.out.println("Número da conta: " + dm.getNumConta());
							System.out.println("CPF: " + dm.getCpfConta());
							for (int i = 0; i < MAX_MOVIMENTOS; i++) {
								do {
									System.out.println("Você quer [D] Depositar ou [R] Retirar?");
									opcao = sc.next().toUpperCase().charAt(0);
								} while (opcao != 'D' && opcao != 'R');
								if (opcao == 'D') {
									System.out.println("Digite o valor de depósito: ");
									valor = sc.nextDouble();
									dm.depositar(valor);
									;
								} else {
									System.out.println("Digite o valor de retirada: ");
									valor = sc.nextDouble();
									dm.retirar(valor);
									;
								}
							}
							System.out.println("Saldo total: R$ " + dm.getSaldoConta());
							dm.talao(dm.getTalao(), dm.getQtdTalao());
							break;
						case '3':
							System.out.println("WIP!!");
							break;
						case '4':
							System.out.println("WIP!!");
							break;
						case '5':	
							System.out.println("WIP!!");
							break;
						}
						
					}
					else if (operacao == '2')
					{
						System.out.println("wip");
					}
					else
					{
						
					}
					System.out.println("Continua S/N");
					opcao = sc.next().toUpperCase().charAt(0);
					if (opcao == 'N') {
						break;
					}
				} while (true);
			}
		}