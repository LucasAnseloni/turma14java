package treino1;

public class ProdutoEletronico
{

	String nome;
	String categoria;
	double valor;
	
	
	
	
	



	public ProdutoEletronico(String nome, String categoria, double valor) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
	}








	public double retornaValor(double valor)
	{
		this.valor = this.valor *15;
		return valor;
	}
	
	
	
}
