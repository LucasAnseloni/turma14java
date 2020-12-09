package lista3java;

import java.util.Scanner;

public class enquanto_1 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double numeroDigitado = 0;
		double soma =0 ;
		double media ;
		int contador =0;
		
		
		
		
		
		while (numeroDigitado >= 0)
		{
			System.out.println("Digite um numero : ");
			numeroDigitado = leia.nextInt();
		    if (numeroDigitado >0)
		    {
			contador = contador + 1;
			soma += numeroDigitado;
			
		    }
		    else if (numeroDigitado ==0)
		    {
		    	System.out.println("O numero digitado é zero !");
		    } 
		    else 
		    {
		    	System.out.println("O numero digitado é negativo !");
		    } 
			
		}
		
		media = soma / contador;
		System.out.print("Você digitou "+contador+" numeros validos para o calculo ");
		System.out.print("\nA soma dos numeros que você digitou é "+soma);
		System.out.printf("\nA média dos numeros que você digitou é %.2f",media);
		
		
		
		
		
		
		leia.close();

	}

}
