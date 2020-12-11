package listarevisaojava;

import java.util.Scanner;

public class tarefa2 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		double peso;
		double altura;
		double imc;
		
		System.out.println("Digite seu peso :");
		peso = leia.nextDouble();
		System.out.println("Digite sua altura :");
		altura = leia.nextDouble();
		
		imc = peso / (altura * altura);
		System.out.printf("IMC =%.2f",imc);
		
		if (imc <18.5)
		{
			System.out.println("\nVocê está abaixo do peso ideal !");
		}
		else if (imc >=18.5 && imc <25)
		{
			System.out.println("\nVocê está com o peso ideal !");
		}
		else if (imc >=25 && imc <=30)
		{
			System.out.println("\nVocê está com sobrepeso !");
		}
		else if (imc >30)
		{
			System.out.println("\nVocê está obeso !");
		}
		
		leia.close();

	}

}
