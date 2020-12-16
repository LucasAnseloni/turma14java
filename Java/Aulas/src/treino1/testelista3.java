package treino1;

import java.util.Scanner;

public class testelista3
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		
		ProdutoEletronico f = new ProdutoEletronico("celular","portatil",500);
		{
		//	System.out.println("digite o valor do celular");
		//	f.valor =  leia.nextDouble();
		//	f.categoria = "portatil";
		//	f.nome = "celular";
		//	f.valor = 150;
			
		//	f.retornaValor(150);
			
			System.out.printf("O valor do %s com taxa é de %.2f %s: ",f.nome,f.valor,f.categoria);
			
		}
				
		
		leia.close();
		
		

	}

}
