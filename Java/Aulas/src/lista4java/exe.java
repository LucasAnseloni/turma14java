package lista4java;

public class exe
{

	public static void main(String[] args)
	{
		int num[] = {1,0,5,-2,-5,7};
		int num1[] = {1,0,5,-2,100,7};
		int soma = 0;
		
		for (int j=0;j<6;j++)
		{
			if (num[j] == num[0])  
			{
				soma = soma + num[j];
			}
			else if (num[j] == num[1])
			{
				soma = soma + num[j];
			}
			else if (num[j] == num[5])
			{
				soma = soma + num[j];
			}
			
		}
		
		for (int i=0;i<6;i++)
		{
			System.out.println(num1[i]);
		}
		
		System.out.println(soma);
	}

}
