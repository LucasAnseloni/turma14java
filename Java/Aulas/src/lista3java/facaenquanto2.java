package lista3java;

import java.util.Scanner;

public class facaenquanto2
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int numeroDigitado;
		int soma = 0;
		int i = 0;
		
		System.out.println("Digite um numero :");
		numeroDigitado = leia.nextInt();
		
		do
		{
			i++;
			soma = soma +  i;
			
		} while (i < numeroDigitado);
		
		System.out.println(soma);
		
		
		leia.close();

	}

}
