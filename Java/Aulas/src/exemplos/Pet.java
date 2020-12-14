package exemplos;

public class Pet
{
	public int idadePet;
	public boolean femea;
	public char especie; 
	public String raca;
	
	public Pet(char especie)
	{
		this.especie = especie;
	}

	public Pet(boolean femea, char especie, String raca) {
		super();
		this.femea = femea;
		this.especie = especie;
		this.raca = raca;
	}
	
	public String retornaEspecie(char tipoPet)
	{
		String especie;
		if(tipoPet == 'C')
		{
			especie = "canino";
			
		}
		else if (tipoPet == 'F')
		{
			especie = "felino";
		}
		else if (tipoPet == 'P')
		{
			especie = "peixe";
		}
		else
		{
			especie = "indefinida";
		}
		
		return especie;
	}
	
	
	
	
}
