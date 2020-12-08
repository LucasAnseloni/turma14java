package lista2java;

import java.util.Scanner;

public class meioambiente
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao;
		
		System.out.println("Digite o indice de poluição :");
		indicePoluicao = leia.nextDouble();
		
		if ( indicePoluicao >= 0.05 && indicePoluicao <=0.25)
		{
			System.out.println("indice de poluicao aceitavel !!");
		}
		else if ( indicePoluicao >0.25 && indicePoluicao <=0.3)
		{
			System.out.println("Grupo 1 suspender as atividades !!");
		}
		else if ( indicePoluicao >0.3 && indicePoluicao <=0.4)
		{
			System.out.println("Grupo 1 e 2 suspender as atividades !!");
		}
		else if ( indicePoluicao >0.4 && indicePoluicao <=0.5)
		{
			System.out.println("Todos os grupos suspender as atividades !!");
		}
		else
		{
			System.out.println("Digite um valor de indice de poluição aceitavel !!");
		}
		
		leia.close();

	}

}
