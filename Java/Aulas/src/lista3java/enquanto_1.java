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
		    	System.out.println("O numero digitado � zero !");
		    } 
		    else 
		    {
		    	System.out.println("O numero digitado � negativo !");
		    } 
			
		}
		
		media = soma / contador;
		System.out.print("Voc� digitou "+contador+" numeros validos para o calculo ");
		System.out.print("\nA soma dos numeros que voc� digitou � "+soma);
		System.out.printf("\nA m�dia dos numeros que voc� digitou � %.2f",media);
		
		
		
		
		
		
		leia.close();

	}

}
