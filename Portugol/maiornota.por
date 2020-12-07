programa
{
	
	funcao inicio() //Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o
	                 //escreva em seguida. Encontre após a maior pontuação e a apresente
	{
		inteiro numero[5],x,maiorNota = -1

		para (x=0;x<5;x++){
			escreva(" entre com um numero :")
			leia(numero[x])
			se (numero[x] > maiorNota)
			{
				maiorNota = numero[x]
			}
		}
		   para (x=0;x<5;x++){
			 escreva("\n" ,numero[x])
		}
		   
		  escreva("\n A maior nota foi :", maiorNota)
			
	}	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 7, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */