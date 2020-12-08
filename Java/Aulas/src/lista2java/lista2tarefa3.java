package lista2java;

import java.util.Scanner;

public class lista2tarefa3
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double num1;
		double num2;
		double num3;
		double num4;
		double quadradonum1;
		double quadradonum2;
		double quadradonum3;
		double quadradonum4;
		
		
		System.out.println("Digite o primeiro numero :");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero :");
		num2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro numero :");
		num3 = leia.nextDouble();
		
		
		quadradonum3 = num3 * num3;
		
		
		if (quadradonum3 >=1000)
		{
			
			
			System.out.println(quadradonum3+"\nfim de programa !!");
		    
		}
		else 
		{
			
			
			System.out.println("Digite o quarto numero :");
			num4 = leia.nextDouble();
			
			quadradonum4 = num4 * num4;
			quadradonum1 = num1 * num1;
			quadradonum2 = num2 * num2;
			
			
			System.out.println(num1+" sua raiz quadrada é :"+quadradonum1+"\n"+num2+" sua raiz quadrada é :"+quadradonum2+"\n"+num3+" sua raiz quadrada é :"+quadradonum3+"\n"+num4+" sua raiz quadrada é :"+quadradonum4+"\n");
			
		}
		
		
		
		
		
		
		
		
		
		leia.close();

	
		
		
	}

}
