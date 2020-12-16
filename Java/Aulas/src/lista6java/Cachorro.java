package lista6java;

public class Cachorro extends Animal
{

	public Cachorro(String nome,int idade)
	{
		super(nome,idade);
	}
	
	public String correr()
	{
		return "cachorro correndo";
	}

	@Override
	public String emitirSom()
	{
	return "Au au ";
	}
	
	
	
}
