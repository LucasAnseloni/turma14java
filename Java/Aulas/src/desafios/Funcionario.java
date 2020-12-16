package desafios;

public class Funcionario
{
	//atributos
	private String nome;
	private int horasMensais;
	private double valorHora;
	
	//construtores
	public Funcionario(String nome, int horasMensais, double valorHora) 
	{
		super();
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}

	//get and set
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasMensais() {
		return horasMensais;
	}


	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//metodos
	public double pagamentoSalario()
	{
		
		return (this.valorHora * this.horasMensais);
	}
	
	
	
}
