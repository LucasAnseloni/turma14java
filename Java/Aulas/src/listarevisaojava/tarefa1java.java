package listarevisaojava;

import java.util.Scanner;

public class tarefa1java
{
     
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double precoEtiqueta;
		double precoFinal;
		int opcao;
		
		System.out.println("Digite o pre�o de etiqueta do produto :");
		precoEtiqueta = leia.nextDouble();
		
		System.out.println("\n[1] - � vista em dinheiro ou cheque");
		System.out.println("\n[2] - � vista no cart�o de cr�dito");
		System.out.println("\n[3] - Parcelado em duas vezes");
		System.out.println("\n[4] - Parcelado em tr�s vezes");
		System.out.println("\nDigite qual op��o de pagamento: ");
		
		opcao = leia.nextInt();
		
		if (opcao ==1)
		{
			precoFinal = precoEtiqueta * .8;
			System.out.printf("O pre�o de R$ %.2f est� saindo por R$ %.2f",precoEtiqueta,precoFinal);
		}
		else if (opcao ==2)
		{
			precoFinal = precoEtiqueta * .85;
			System.out.printf("O pre�o de R$ %.2f est� saindo por R$ %.2f",precoEtiqueta,precoFinal);
		}
		else if (opcao ==3)
		{
			precoFinal = precoEtiqueta ;
			System.out.printf("O pre�o de R$ %.2f est� saindo por R$ %.2f",precoEtiqueta,precoFinal);
		}
		else if (opcao ==4)
		{
			precoFinal = precoEtiqueta * 1.1;
			System.out.printf("O pre�o de R$ %.2f est� saindo por R$ %.2f",precoEtiqueta,precoFinal);
		}
		else
		{
			System.out.println("\nOp��o invalida");
		}
		
		leia.close();

	}

}
