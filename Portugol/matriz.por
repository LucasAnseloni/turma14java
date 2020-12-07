programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro valores1[2][2],valores2[2][2]

		valores1[0][0] = 10
		valores1[0][1] = 9
		valores1[1][0] = 5
		valores1[1][1] = 8

		para (inteiro linha =0; linha <2; linha++){
			para ( inteiro coluna = 0; coluna < 2; coluna++){
				valores2[linha][coluna] = Util.sorteia(0,9)
				escreva(valores2[linha][coluna], " ")
			} escreva("\n")
		}

		

		



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */