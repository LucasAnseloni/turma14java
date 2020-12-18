package exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args)
	
	{
		
		File arquivo = new File("C:\\temp\\lista.txt");
		Scanner leia = null;
		
		try 
		{
			leia = new Scanner(arquivo);
			while (leia.hasNextLine())
			{
				System.out.println(leia.nextLine());
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("erro de arquivo" + e.getMessage());
		}
		finally
		{
			if (leia != null)
			{
				leia.close();
			}
		}

	}

}
