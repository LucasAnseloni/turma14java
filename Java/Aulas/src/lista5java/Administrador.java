package lista5java;

public class Administrador extends Pessoa
{
	Empregado E = new Empregado(1,4500,200);
	

	private double ajudaDeCusto;
	

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double retornaAjudaCusto()
	{
		return (E.salarioBase + this.ajudaDeCusto);
	}
	
}