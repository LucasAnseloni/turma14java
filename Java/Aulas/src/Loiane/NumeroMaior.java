package Loiane;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		char letra;
	
		
		System.out.println("digite uma letra :");
		letra = leia.next().toUpperCase().charAt(0);
		
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
		{
			System.out.println("vogal");
		}
		
		else 
		{
			System.out.println("consoante");
		}
		
		
		
		
		
		leia.close();
		
		
		
		
		
		

	}

}
