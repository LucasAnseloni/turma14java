package lista4java1;

import java.util.Scanner;

public class lista4tarefa1
{

	public static void main(String[] args) 
	{//crie um vetor por leitura com 5 valores de pontuação de uma atividade
	                                       //e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	Scanner sc = new Scanner(System.in);
	final int TAMANHO = 5;
	double notas[] = new double[TAMANHO], maiorNota = -99.0;

	for (int i = 0; i < TAMANHO; i++) {
		System.out.println("\nDigite a " + (i + 1) + " nota:");
		notas[i] = sc.nextDouble();
		if (notas[i] > maiorNota) {
			maiorNota = notas[i];
		}
	}
	System.out.println("Notas:\n");

	for (int i = 0; i < TAMANHO; i++) {
		System.out.println(notas[i] + "\n");
	}
	System.out.println("A maior nota foi: " + maiorNota);
	sc.close();
}

}
