package treino1;

import java.util.Scanner;

public class cliente
{
	Scanner leia = new Scanner(System.in);

	public String nome;
	public String cpf;
	public int senha;
	


	
	public int retornaSenha()
	
	{
		
		while(senha != 1992)
		
		{
			System.out.println("digite a senha");
			this.senha = leia.nextInt();
			if (senha == 1992)
			{
				System.out.println("correta");
			}
			else 
			{
				System.out.println("incorreta");
			}
			
			
			
			
			
		} 
		return this.senha;
	}
	
	
}
