package lista7java;

import java.util.ArrayList;
import java.util.Collection;

public class ControleEstoque
{

	public static void main(String[] args) 
	{
		Collection <String> listaEstoque = new ArrayList();
		
		listaEstoque.add("televis�o");
		listaEstoque.add("fog�o");
		listaEstoque.add("r�dio");
		listaEstoque.add("notebook");
		listaEstoque.add("geladeira");
		
		System.out.println("lista de estoque :"+listaEstoque);
		
		listaEstoque.remove("televis�o");
		
		System.out.println("lista de estoque removido televis�o :"+listaEstoque);
		System.out.println("lista estoque atualizada!");
		for (String estoque : listaEstoque)
		{
			System.out.println(estoque);
		}
		
	}

}
