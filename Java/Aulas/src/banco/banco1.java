package banco;

import java.util.Random;
import java.util.Scanner;

public class banco1 {

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
        int talao[] = new int[40];
        char operacao, opcaoContinuar,opcao='1';
        
  /*      for ( int i=0;i<40;i++)
        {
            System.out.println("digite");
        	saldoConta[i] = leia.nextDouble();
        	
        }
        
   */     
       double saldoAtual=saldoConta[40], valorOperacao;
       
       System.out.println("deseja realizar uma tran��o [1] sim [2] nao ");
       opcao = leia.next().toUpperCase().charAt(0);
		do
		{
			for (int i = 0; i < 40; i++)
			{
				System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transa��o: R$");
				valorOperacao = leia.nextDouble();
				if (operacao == 'C')
				{
					System.out.print("\nTransa��o realizada com sucesso.");	
					saldoAtual = saldoAtual + valorOperacao;
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					
				}
				else if (operacao == 'D')
				{
					if ((saldoAtual - valorOperacao)>=0)
					{
						saldoAtual = saldoAtual - valorOperacao;
						System.out.print("\nTransa��o realizada com sucesso.");
						System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					
					}
					else if ((saldoAtual - valorOperacao) < 0)				
					{
						System.out.println("\nVoc� nao possui saldo suficiente.");
						System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
						
					}
				}
			}
		
        
		}while(opcao == '1');
	}
}
