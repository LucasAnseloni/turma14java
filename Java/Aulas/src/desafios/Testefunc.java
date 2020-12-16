package desafios;

public class Testefunc {

	public static void main(String[] args) 
	{

		Funcionario F = new Funcionario("João",220,10.00);
		Terceiro T = new Terceiro("Maria",200,10.00,50.25);
		
		System.out.printf("O funcionario %s recebe de salario R$ %.2f\n",F.getNome(),F.pagamentoSalario());
		System.out.printf("O terceiro %s recebe de salario R$ %.2f",T.getNome(),T.pagamentoSalario());

	}

}
