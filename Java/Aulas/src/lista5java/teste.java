package lista5java;

import java.util.Scanner;

public class teste
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Fornecedor F = new Fornecedor(40,30);
		Pessoa P = new Pessoa("Lucas Barros","40554036","Rua jose gomes da silva");
		Empregado E = new Empregado(199,4500.00,0);
		Administrador A = new Administrador();
		Operario O = new Operario();
		
		
		
		
		
	/*	System.out.println("Digite o nome");
		F.nome = leia.next();
		System.out.println("Digite o endereço");
		F.endereco = leia.next();
		System.out.println("Digite o telefone");
		F.telefone = leia.next();
		
	*/	
		
		
	//	System.out.printf("\nNome:%s \nEndereço:%s \nTelefone:%s\n",F.nome,F.endereco,F.telefone);
		
		
		
		P.mostrarDados();
		
		F.setValorCredito(850.60);
		F.setValorDivida(400.00);
		System.out.printf("\nSeu saldo é de:%.2f",F.obterSaldo());
		F.setValorCredito(40);
		System.out.printf("\nO valor do seu limite é de:%.2f\n",F.getValorCredito());
		System.out.printf("O salário base é de %.2f:",E.salarioBase);
		System.out.printf("\nO salário liquido a receber é de R$%.2f:",E.calcularSalario());
		O.setValorProducao(10000);
		O.setComissao(1000);
		
		System.out.printf("\nO valor da sua comissão é de R$%.2f \n",O.retornaComissao());
		A.setAjudaDeCusto(200);
		System.out.printf("O valor do salario + ajuda de custo é :%.2f\n",A.retornaAjudaCusto());
		
		leia.close();
	}

}
