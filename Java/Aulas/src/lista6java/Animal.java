package lista6java;

public class Animal
{

	public String nome;
	public int idade;
	
	
	
	public Animal(String nome, int idade, String som) {
		super();
		this.nome = nome; 
		this.idade = idade;
		}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String emitirSom()
	{
	return "";
	}
	
	public Animal (String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	
	
	
	
}
