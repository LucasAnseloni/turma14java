package lista2java;

import java.util.Scanner;

public class nadadores
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite sua idade :");
		idade = leia.nextInt();
		
		if (idade < 5)
		{
			System.out.println("Sua idade não é permitida !!");
		} 
		else if (idade >=5 && idade <=7)
		{
			System.out.println("Você esta na categoria infantil A ");
		}
		else if (idade >=8 && idade <=11)
		{
			System.out.println("Você esta na categoria infantil B ");
		}
		else if (idade >=12 && idade <=13)
		{
			System.out.println("Você esta na categoria juvenil A ");
		}
		else if (idade >=14 && idade <=17)
		{
			System.out.println("Você esta na categoria juvenil B ");
		}
		else if (idade >=18)
		{
			System.out.println("Você esta na categoria adultos ");
		}
		
		
		leia.close();

	}

}
