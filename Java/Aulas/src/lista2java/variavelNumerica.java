package lista2java;

import java.util.Scanner;

public class variavelNumerica 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double variavelN;
		
		System.out.println("Digite um numero :");
		variavelN = leia.nextDouble();
		
		if (variavelN > 100)
		{
			System.out.println("você digitou "+variavelN+" e o valor digitado foi maior que 100 !!");
		}else
		{
			System.out.println(variavelN = 0);
		}
		
		
		
		
		
		leia.close();

	}

}
