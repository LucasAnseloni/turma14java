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
				
			System.out.println("A sua idade � de :"+idade(anoNascimento)+" anos");	
			if (idade(anoNascimento) < 18)
			{
				System.out.println("Oi, voc� tem "+idade(anoNascimento)+" anos e � considerado infanto -juvenil");
			}
			else if (idade(anoNascimento) > 18 && idade(anoNascimento) <60)
			{
				System.out.println("Oi, voc� tem "+idade(anoNascimento)+" anos e � considerado Adulto");
			}
			else //if (idade(anoNascimento) > 60)
			{
				System.out.println("Oi, voc� tem "+idade(anoNascimento)+" anos e � considerado Idoso");
			}
				

	}
	  
	
           static int idade(int anoNascimento)
           {
        	   int calculo;
        	   calculo = 2020 - anoNascimento;
        	   return calculo;
           }
           
}
