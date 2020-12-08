package lista2java;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		double baseTriangulo;
		double alturaTriangulo;
		double areaTriangulo;
		
		System.out.println("Digite a base do triangulo :");
		baseTriangulo = leia.nextDouble();
		
		System.out.println("Digite a altura do triangulo :");
		alturaTriangulo = leia.nextDouble();
		
		if (baseTriangulo >0 && alturaTriangulo >0)
		{
			areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
			System.out.println("A area do trinagulo é :"+areaTriangulo);
		}else
		{
			System.out.println("Digite valores positivos !!");
		}
		
		
		
		
		leia.close();

	}

}
