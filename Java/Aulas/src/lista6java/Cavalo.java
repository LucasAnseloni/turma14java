package lista6java;

public class Cavalo extends Animal
{

	public Cavalo (String nome, int idade)
	{
		super(nome,idade);
	}

	public String correr()
	{
		return "cavalo correndo";
	}
	
	@Override
	public String emitirSom()
	{
	return "Ri ri ";
	}
	
	
	
	
	
}
