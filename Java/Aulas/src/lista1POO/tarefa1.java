package lista1POO;

import java.util.Scanner;

public class tarefa1 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in); 

		Cliente cliente = new Cliente("Lucas",  'M', 1992 );
		
		cliente.retornaIidade(2020);
		System.out.println(cliente.idade);
	
		
		leia.close();
				
	}

}
