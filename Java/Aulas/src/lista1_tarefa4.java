import java.util.Scanner;

public class lista1_tarefa4 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		int numeroa;
		int numerob;
		int numeroc;
		
		System.out.println("Digite o numero de a :");
		numeroa = leia.nextInt();
		
		System.out.println("Digite o numero de b :");
		numerob = leia.nextInt();
		
		System.out.println("Digite o numero de c :");
		numeroc = leia.nextInt();
		
		int R = (numeroa + 3) * (numeroa + 3);
		int S = (numerob + numeroc) *  (numerob + numeroc);
		int D = (R + S) / 2;
		
		System.out.println("O resultado do calculo é :"+D);
		
		leia.close();

	}

}
