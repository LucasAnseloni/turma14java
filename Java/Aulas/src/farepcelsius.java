import java.util.Scanner;

public class farepcelsius {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.println("Digite a temperatura em farenheit :");
		f = leia.nextDouble();
		
		c = ( (f - 32) *0.5555555556);
		
		System.out.println("A temperatura em celcius é :"+c);
		
		
		
		
		
		
		
		leia.close();

	}

}
