package lista7java;

import java.util.ArrayList;
import java.util.Collection;

public class ControleEstoque
{

	public static void main(String[] args) 
	{
		Collection <String> listaEstoque = new ArrayList();
		
		listaEstoque.add("televisão");
		listaEstoque.add("fogão");
		listaEstoque.add("rádio");
		listaEstoque.add("notebook");
		listaEstoque.add("geladeira");
		
		System.out.println("lista de estoque :"+listaEstoque);
		
		listaEstoque.remove("televisão");
		
		System.out.println("lista de estoque removido televisão :"+listaEstoque);
		System.out.println("lista estoque atualizada!");
		for (String estoque : listaEstoque)
		{
			System.out.println(estoque);
		}
		
	}

}
