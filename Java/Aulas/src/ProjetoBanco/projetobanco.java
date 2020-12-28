package ProjetoBanco;

import java.util.Random;
import java.util.Scanner;

public class projetobanco
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		char opcaoMenuInicial, opcaoContinuar='S';
		int tamanhoLinha=80, numeroOperacoes=3;
		////String numeroConta="00001";
		//double saldoConta=0.00;		
		
		Random sorteia = new Random();

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
        double movimentacoes[] = new double[40];
        double tipoMovimentacoes[] = new double[40];
        
        contaPoupan�a(tamanhoLinha);
        
	}
	
	public static void contaPoupan�a(int tamanhoLinha) {
		Scanner leia = new Scanner (System.in);
		char opcaoContinuar='S';
		
		
		desenhaLinha(tamanhoLinha);		
		char operacao, continuar;	
		double valorMovimentacao[] = new double[10];
		double saldos[] = new double[10];
		char tipoMovimentacao[] = new char[10];
		int limiteOperacoes = 10, diaAniversario = 10, i = 0;
		
		saldos[0] = 0;
		do{
				
				System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
				operacao = leia.next().toUpperCase().charAt(0);
				System.out.printf("Informe o valor da transa��o: R$");
				valorMovimentacao[i] = leia.nextDouble();	
				
				if (operacao == 'C'){
					
					System.out.print("\nTransa��o realizada com sucesso.");	
					saldos[i] += valorMovimentacao[i];
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldos[i]);	
					desenhaLinha(tamanhoLinha);
					tipoMovimentacao[i] = 'C';
					i++;
				}
				
				
				else if (operacao == 'D'){
					
						if ((saldos[i] - valorMovimentacao[i])>=0){
							
							saldos[i] -= valorMovimentacao[i];
							System.out.print("\nTransa��o realizada com sucesso.");
							System.out.printf("\nSaldo Atual: R$%.2f\n",saldos[i]);	
							desenhaLinha(tamanhoLinha);
							tipoMovimentacao[i] = 'D';
							i++;
						}
						else if ((saldos[i]- valorMovimentacao[i]) < 0){
							
							System.out.println("\nVoc� nao possui saldo suficiente.");
							System.out.printf("Saldo Atual: R$%.2f\n",saldos[i]);	
							desenhaLinha(tamanhoLinha);
							tipoMovimentacao[i] = '-';
						}

				}
				
				System.out.print("\nDeseja realizar mais transa��es S/N? ");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
				saldos[i] = saldos[i-1];
				
				}while (opcaoContinuar == 'S' && i < limiteOperacoes);
				
				
			
		
			System.out.println("Digite o dia de hoje");
			int diaHoje = leia.nextInt();
			if(diaHoje == diaAniversario) {
				saldos[i] *= 1.05;
				System.out.println("Parabens! Voce recebeu uma bonifica��o de 5% em sua conta");
				System.out.printf("Seu saldo atual � de %.2f\n", saldos[i]);
			}
			
			System.out.println("Deseja mostras suas operacoes realizadas, S/N?");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
			if(opcaoContinuar == 'S') {
				for(i = 0; i < 10; i++) {
					if(valorMovimentacao[i] > 0) {
						if(tipoMovimentacao[i] == 'C') {
							System.out.printf("Credito no valor de %.2f reais\n", valorMovimentacao[i]);
						}else if(tipoMovimentacao[i] == 'D') {
							System.out.printf("Debito no valor de %.2f reais\n", valorMovimentacao[i]);
						}
					}
					
				}
			}	
    }
	
		
	static void desenhaLinha (int linha)
	{
		for (int i = 1; i<=linha; i++)
		{
			System.out.print("�");
		}
	}		
}

	
