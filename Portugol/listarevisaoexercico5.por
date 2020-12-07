programa
{
	       	//Faça um programa que leia um vetor de 5 posições para números reais
	        		//e, depois, um código inteiro. Se o código for zero, finalize o programa
	           		//	; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa
	                	//	. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
	funcao inicio()
	{
		real vetor[5] = {1.0,2.0,3.0,4.0,5.0}
		inteiro codigo

		escreva("Digite um codigo :")
		leia(codigo)

		se (codigo == 0)
		{
		    
		}
		senao se (codigo == 1)
		{
			escreva(vetor[4]," ",vetor[3]," ",vetor[2]," ",vetor[1]," ",vetor[0])
		}
		senao se (codigo == 2)
		{
			escreva(vetor[0]," ",vetor[1]," ",vetor[2]," ",vetor[3]," ",vetor[4])
		}
		senao se (codigo != 1) 
		{
			escreva("codigo invalido")
		}
		senao se (codigo != 2)
		{
			escreva("codigo invalido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */