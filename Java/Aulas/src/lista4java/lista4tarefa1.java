package lista4java;

public class lista4tarefa1
{

	public static void main(String[] args)
	{
		int num[] = {1,0,5,-2,-5,7};
		int num1[] = {1,0,5,-2,100,7};
		int soma;
		
		
		soma = num[0] + num[1] + num[5];
		System.out.printf("%d",soma);
		System.out.println("\n--------------------------------------");

		for (int i=0;i<6;i++)
		{
			System.out.println(num1[i]);
		}
	}

}
