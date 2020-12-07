import java.util.Scanner;



public class celsiuspfare {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		double c;
		double f;
		
		System.out.println("Digite a temperatura em celsius :");
		c = leia.nextDouble();
		
		f = ((c*1.8)+32);
		
		System.out.println("A temperatura em farenheit é :"+f);
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
