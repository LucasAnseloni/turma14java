package loja;

public class Produto {

	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;

	public Produto(String nomeProduto, String codigo, double precoUnitario) {

		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
	}

	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {

		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdeProdutoEstoqu() {
		return qtdeProdutoEstoque;
	}

	// metodos
	public void tiraEstoque(int saida)
	{
		if(testarEstoque(saida))
		{
			this.qtdeProdutoEstoque -= saida;
		}
		
	
	else
	{
		System.out.println("estoque indispomivel!!");
	}

	public void adicionaEstoque(int entrada)
	{
		this.qtdeProdutoEstoque += entrada;
	}

	public boolean testarEstoque(int valor)
	{
		if (valor > this.qtdeProdutoEstoque) 
		{
			return false;
		}
		else if (valor ==0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque ==0)
		{
			return false;
		}
		else if (this.qtdeProdutoEstoque <0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
		
		public double venda(int qtdeVendida)
		{
			tiraEstoque(qtdeVendida);
			return qtdeVendida 
		}

	


	
}
}