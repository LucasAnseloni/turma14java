package Objetos;
import java.util.Scanner;
public class LojaLoka
{
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente = new Pessoa("MARIA");
		
		Pessoa clienteAvulso = new Pessoa("EDNILSON",'M' );
	/*	
		clienteAvulso.nome = "EDNILSON";
		clienteAvulso.genero = 'M';
		clienteAvulso.anoNascimento = 1974;
		*/
		
		//String produto = "Vestido";
		//int qtde = 10;
		//double valorProduto = 100.00;
		
		// a classe se chamar Produto
		//nomeProduto
		//qtdeEstoque
		//valorUnitario
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camisa - 20,00 - 20 em estoque
		// calça jeans - 60,50 - 5 em estoque
		// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
		
		Produto item1 = new Produto(); //usando o construtor vazio
		Produto item2 = new Produto("BLUSA",20,50.00);
		Produto item3 = new Produto("CAMISA");
		Produto item4 = new Produto("CALÇA JEANS");
		
			
		item1.nomeProduto = "VESTIDO";
		item1.qtdeProduto = 3;
		item1.valorUnitario = 100.00;
		
						
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		System.out.println("Vc é Masculuno, Feminino ou Outros: [M/F/O]");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o seu ano de nascimento: ");
		cliente.anoNascimento = leia.nextInt();
		cliente.retornaIidade();
		System.out.printf("Bom dia %s, sua idade é %d \n", cliente.nome, cliente.idade);
		//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
		//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);
		
		System.out.println(cliente.nome);
		System.out.println(clienteAvulso.nome);
		
		
		
	}
}