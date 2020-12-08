package lista2java;

import java.util.Scanner;

public class anoidadeinteiro 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		int idade;
		
		System.out.println("Digite o ano do seu nascimento :aaaa");
		anoNascimento = leia.nextInt();
				
			System.out.println("A sua idade é de :"+idade(anoNascimento)+" anos");	
			if (idade(anoNascimento) < 18)
			{
				System.out.println("Oi, você tem "+idade(anoNascimento)+" anos e é considerado infanto -juvenil");
			}
			else if (idade(anoNascimento) > 18 && idade(anoNascimento) <60)
			{
				System.out.println("Oi, você tem "+idade(anoNascimento)+" anos e é considerado Adulto");
			}
			else //if (idade(anoNascimento) > 60)
			{
				System.out.println("Oi, você tem "+idade(anoNascimento)+" anos e é considerado Idoso");
			}
				

	}
	  
	
           static int idade(int anoNascimento)
           {
        	   int calculo;
        	   calculo = 2020 - anoNascimento;
        	   return calculo;
           }
           
}
