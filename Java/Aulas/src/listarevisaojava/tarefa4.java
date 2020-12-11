package listarevisaojava;

public class tarefa4 
{

	public static void main(String[] args) 
	{
		int j=-1;
		double soma=0.0;
		
		for (int i =1;i<=50;i++)
		{
			j = j +2;
			soma =soma + j/i;
			System.out.print(" + "+j+"/"+i);
		}
			System.out.printf("\nO resultado da soma é :%.2f",soma);
	}

}
