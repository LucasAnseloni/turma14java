package exemplos;

import java.util.Scanner;

public class listaalunos
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = {"Allen de Lima Vieira","Andr� de Brito Silva da Costa","B�rbara Liboni Guerra","Beatriz Martins",
				"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
				"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
				"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco Jos� Pires","Gabriel Enrique Cabral Silva","Gabriel S�rgio Nascimento Santos Gon�alves",
				"Gide�o da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gon�alves da Silva","Gustavo Rabelo Teles",
				"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
				"Jos� Jorge Hauck J�nior","Juliana Santos Andr�","K�lven Cleiton de Ara�jo Brand�o","La�s Lima Santos","Lucas anseloni Barros",
				"Lucas Gon�alves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalh�es","Marcos Eduardo Gomes Gon�alves",
				"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Ver�nica Navarro Almena","Vinicius Alves Miranda"};
		
		char generos[]={'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','M','F','M','F','F','M','F',
				'M','F','M','M','M','M','M','F','F','M','F','M'};
		
		int matriculas[] = new int[40];
		double notas[] = new double[40];
		String aux;
		int matricula;
		int pesquisa = 0;
		
		for (int i =0;i<40;i++)
		{
		
			matriculas[i] = i+1;
		}
		System.out.println("MAT\tTIPO\tNOME");
		for (int i =0;i<40;i++)
		{
			if (generos[i] == 'M')
			{
				aux = "Aluno";
			}
			else
			{
				aux = "Aluna";
			}
		System.out.printf("%d \t%s \t%s \n",matriculas[i],aux,alunos[i]);
		}
		
		System.out.println("Digite a matricula do aluno para incluir nota");
		matricula = leia.nextInt();
		for (int i = 0; i<40;i++)
		{
			if (matriculas[i] == matricula)
			{
				pesquisa = i;
			}
		}
		System.out.println("Foi escolhido :");
		System.out.printf("%d \t%s \n",matriculas[pesquisa],alunos[pesquisa]);
		System.out.println("Digite a nota :");
		notas[pesquisa] = leia.nextDouble();
	}

}
