package lista6java;

public class Preguica extends Animal
{
	
	public Preguica(String nome, int idade)
	{
		super (nome, idade );
	}

	public String subirEmArvore()
	{
		return "pregui�a subindo na arvore";
	}
	
	@Override
	public String emitirSom()
	{
	return "awwwwww";
	}
	
	
	

}
