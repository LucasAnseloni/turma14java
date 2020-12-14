package Objetos;
import java.util.Scanner;
public class BootLoko {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//nome
		//genero
		//ano de nascimento
		// seja bem-vindo / bem-vinda
		// idade defina na tela:
		// idades abaixo de 18 - boot jovem [boot arduino]
		//idades entre 18  e 55 - javeiro [boot java]
		//idades acime 55 - old boot [boot da melhor idade]
		
		Scanner leia = new Scanner(System.in);	
		Pessoa cliente = new Pessoa();
		int idade;
		
		System.out.println("Digite o nome do cliente: ");
		cliente.nome = leia.next();
		System.out.println("Digite o genero: ");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		cliente.anoNascimento = leia.nextInt();
		
		cliente.retornaIidade();
		System.out.println(cliente.nome+" sua idade é "+cliente.idade);
		
	}
}