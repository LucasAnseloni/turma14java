import java.util.Scanner;

public class notasalunosmediafinal
{

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double mediaNotas;
		
		System.out.println("Digite a primeira nota :");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota :");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota :");
		nota3 = leia.nextDouble();
		
		mediaNotas = ((nota1 *2) + (nota2 * 3) + (nota3 * 5 )) /10;
		System.out.println(mediaNotas);
		
		leia.close();

	}

}
