package lista3java;

public class lista3tarefa2
{

	public static void main(String[] args) 
	
	{
		int soma = 0;
		
		for (int i=0;i<=500;i++)
		{
			if (i%3==0 && i%2!=0)
			{
				soma+=i;
			}
		}
		
		System.out.println("o resultado da soma dos múltiplos impares de três é: "+soma);
	}

}
