package lista4java;

import java.util.Scanner;

public class lista4tarefa2 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int num[] = new int [6];
		int soma=0;
		int contador=0;
		String numPar="";
		String numImpar="";
		
		
		for (int i =0;i<6;i++)
		{
			System.out.println("digite um numero :");
			num[i] = leia.nextInt();
			if (num[i] %2 ==0)
			{
				numPar = numPar +" "+ num[i];
				soma = soma + num[i];
			}
			else 
			{
				numImpar = numImpar+" "+ num[i];
				contador++;
			}
		   
		}
		
		
		
		System.out.println("A soma dos numeros pares é :"+soma+"\n"+"A quantidade de vezes que digitou numeros impares foi :"+contador);
	    System.out.println(numPar);
	    System.out.println(numImpar);
		
		
		
		
		
		
		leia.close();

	}

}
