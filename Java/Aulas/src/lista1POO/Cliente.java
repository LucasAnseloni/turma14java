package lista1POO;

public class Cliente {
	public String nome;
	public char genero;
	public int anoNascimento;
	public int idade;

	

	public Cliente(String nome, char genero, int anoNascimento ) {
	
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
		
	}
	

	




	public void retornaIidade(int anoAtual) {
		this.idade = anoAtual - this.anoNascimento;
	}

}
