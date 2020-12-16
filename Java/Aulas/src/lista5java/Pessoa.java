package lista5java;

public class Pessoa 
{
		//atributos
	public String nome;
	public String endereco;
	public String telefone;
	public char genero;
	
	
	//construtor
	
	public Pessoa() 
	{
		
	}




	public Pessoa(String nome) 
	{
		
		this.nome = nome;
	}




	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	// get and setters


	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public void mostrarDados()
	{
		System.out.printf("Nome:%s\nEndereço:%s\nTelefone:%s",this.nome,this.telefone,this.endereco);
	}




	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
		
	
	
	
	
	
}
