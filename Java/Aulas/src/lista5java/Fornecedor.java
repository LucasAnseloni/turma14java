package lista5java;

public class Fornecedor extends Pessoa
{

	public double valorCredito;
	public double valorDivida;
	
	
	   //construtor
	public Fornecedor ()
	{
		
	}
	
	
public Fornecedor(double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}


/*	public Fornecedor(double i, double j)
	{
		this.valorCredito = i;
		this.valorDivida = j;
	}
*/	
	// get e set
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//metodo
	public double obterSaldo()
	{
		return (this.valorCredito - this.valorDivida);
		
	}
	
	
	
	
	
}
