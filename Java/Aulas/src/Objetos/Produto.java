package Objetos;
public class Produto
{
	public String nomeProduto;
	public int qtdeProduto;
	public double valorUnitario;
	
	
	public Produto()
	{
		
	}
	//sobrecarga
	public Produto(String nomeProduto, int qtdeProduto, double valorUnitario)
	{
		super(); //depois explico
		this.nomeProduto = nomeProduto;
		this.qtdeProduto = qtdeProduto;
		this.valorUnitario = valorUnitario;
	}
	public Produto(String nomeProduto)
	{
		this.nomeProduto = nomeProduto;
		
	}
	
	
	
	
}