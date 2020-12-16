package lista5java;

public class Operario extends Pessoa
{

	public double valorProducao;
	public double comissao;
	
	
	
	
	public Operario() {
		super();
	}




	public Operario(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}




	public double getValorProducao() {
		return valorProducao;
	}




	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}




	public double getComissao() {
		return comissao;
	}




	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double retornaComissao()
	{
		return ((this.valorProducao / this.comissao) * 100);
	}
	
	
	
}
