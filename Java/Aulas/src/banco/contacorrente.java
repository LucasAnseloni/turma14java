package banco;

import java.util.Random;
import java.util.Scanner;

public class contacorrente {

	public static void main(String[] args) 
	{
		Random sorteia = new Random();
		Scanner leia = new Scanner(System.in);

		String nomeClientes[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins",
				"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
				"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
				"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves",
				"Gide�o da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
				"Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni Barros",
				"Lucas Gon�alves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves",
				"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almena","Vinicius Alves Miranda"};
		char genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
				'M','F','M','M','M','M','M','F','F','M','F','M'};
		int numeroConta[] = new int [40];
		int tipoConta[] = new int [40];
		double saldoConta[] = new double [40];
	//	int talao[] = new int[3];
		char operacao, opcaoContinuar,opcao='s',opcaoT='s';

	//	corrente(opcao);

	//}

	//	public static double  corrente  (int saldo) {
	//		Scanner leia = new Scanner(System.in);
			double movimentacoes=0 ;                        
			String talaoCheque = "T-0" ;
			char tipoTransicao, aceiteTalaoCheque;
			int codigoTalao =0;
			int talao[] = new int[3];
			int quantidadeTalao=0;
			int contaTalao=0;
			double saldo=0;


		/*	System.out.println("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
			tipoTransicao = leia.next().charAt(0);
			if (tipoTransicao == 'C' || tipoTransicao=='c')
			{
				System.out.println("Informe o valor da transa��o: R$");
				movimentacoes = leia.nextDouble();
				saldo+=movimentacoes;
				System.out.println(saldo);
			}
			else if (tipoTransicao =='D' || tipoTransicao =='d')
			{
				System.out.println("Informe o valor da transa��o: R$");
				movimentacoes =  leia.nextDouble();
				saldo-=movimentacoes;
				
			} 
			if (saldo <= 0)
			{
				System.out.println("Voc� nao possui saldo suficiente!! \n");
			}
		*/	
		//	do {
			for (int i =0;i<3;i++)
			{
				System.out.println("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
				tipoTransicao = leia.next().charAt(0);
				if (tipoTransicao == 'C' || tipoTransicao=='c')
				{
					System.out.println("Informe o valor da transa��o: R$");
					movimentacoes = leia.nextDouble();
					saldo+=movimentacoes;
					System.out.println(saldo);
				}
				else if (tipoTransicao =='D' || tipoTransicao =='d')
				{
					System.out.println("Informe o valor da transa��o: R$");
					movimentacoes =  leia.nextDouble();
					saldo-=movimentacoes;
					
				} 
				if (saldo <= 0)
				{
					System.out.println("Voc� nao possui saldo suficiente!! \n");
				}
			System.out.printf("\nVoc� possui tal�o de cheque disponivel : %s%d \nDeseja solicitar [S]Sim ou [N]N�o:",talao[i],codigoTalao);
			aceiteTalaoCheque = leia.next().charAt(0);
			if (aceiteTalaoCheque == 'S' || aceiteTalaoCheque == 's')
			{
				
				System.out.println("Qual a quantidade voc� deseja solicitar ?");
				quantidadeTalao = leia.nextInt();
				if  (contaTalao <=3 &&  quantidadeTalao + contaTalao  <=3 )
				{
					contaTalao += quantidadeTalao;
					System.out.printf("Seu novo codigo de talao de cheque � T-%s%d:", talao[i],codigoTalao++, "\n");
					System.out.println("\nvoce deseja fazer uma nova transa��o [S]Sim ou [N]N�o: ?");
					opcaoT = leia.next().toUpperCase().charAt(0);
					if (opcaoT == 'S' || opcaoT == 's')
					{
						System.out.println("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
						tipoTransicao = leia.next().charAt(0);
						if (tipoTransicao == 'C' || tipoTransicao=='c')
						{
							System.out.println("Informe o valor da transa��o: R$");
							movimentacoes = leia.nextDouble();
							saldo+=movimentacoes;
							System.out.println(saldo);
						}
						else if (tipoTransicao =='D' || tipoTransicao =='d')
						{
							System.out.println("Informe o valor da transa��o: R$");
							movimentacoes =  leia.nextDouble();
							saldo-=movimentacoes;
							
						} 
						if (saldo <= 0)
						{
							System.out.println("Voc� nao possui saldo suficiente!! \n");
						}
					}
					else 
					{
						System.out.println("Fim do programa");
						//break;
					}
				}
				else if (!(contaTalao <=3 &&  quantidadeTalao + contaTalao  <=3 ))
				{
					System.out.println("\nlimite de talao ultrapassado");
				}	
				   
				}
			else if (aceiteTalaoCheque == 'N' || aceiteTalaoCheque == 'n') 
			{
				System.out.println("voce deseja fazer uma nova transa��o [S]Sim ou [N]N�o: ?");
				opcaoT = leia.next().toUpperCase().charAt(0);
				if (opcaoT == 'S' || opcaoT == 's')
				{
					System.out.println("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
					tipoTransicao = leia.next().charAt(0);
					if (tipoTransicao == 'C' || tipoTransicao=='c')
					{
						System.out.println("Informe o valor da transa��o: R$");
						movimentacoes = leia.nextDouble();
						saldo+=movimentacoes;
						System.out.println(saldo);
					}
					else if (tipoTransicao =='D' || tipoTransicao =='d')
					{
						System.out.println("Informe o valor da transa��o: R$");
						movimentacoes =  leia.nextDouble();
						saldo-=movimentacoes;
						
					} 
					if (saldo <= 0)
					{
						System.out.println("Voc� nao possui saldo suficiente!! \n");
					}
				}
				else 
				{
					System.out.println("Fim do programa");
					//break;
				}
				break;
			}
			
			
			
			
			}
			
	
		}


	

}
