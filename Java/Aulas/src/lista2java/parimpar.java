package lista2java;

import java.util.Scanner;

public class parimpar 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("digite um numero :");
		numero = leia.nextInt();
		
		if (numero > 0 && numero %2==0)
		{
			System.out.println("o numero digitado é positivo e ele é um numero par ");
		}
		else if (numero < 0 && numero %2==0)
		{
			System.out.println("o numero digitado é negativo e ele é um numero par ");
		}
		else if (numero < 0 && numero %2!=0)
		{
			System.out.println("o numero digitado é negativo e ele é um numero impar ");
		}
		else
		{
			System.out.println("o numero digitado é positivo e ele é um numero impar ");
		}
		
		
		
		leia.close();

	}

}
