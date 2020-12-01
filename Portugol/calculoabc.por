programa
{
	inclua biblioteca Matematica --> mat

	
	//
	funcao inicio()
	{
		inteiro numeroA , numeroB , numeroC , resultadoParcialr , resultadoParcials , resultadoD
		
		escreva ("Digite um o numero A:\n" )
		leia (numeroA)
		escreva ("Digite um o numero B:\n" )
		leia (numeroB)
		escreva ("Digite um o numero C:\n" )
		leia (numeroC)

		resultadoParcialr =  (numeroA + numeroB) * (numeroA + numeroB)
		
          resultadoParcials =  (numeroB + numeroC) * (numeroB + numeroC)
          
          resultadoD = (resultadoParcialr + resultadoParcials) / 2
          
		escreva ("O resultado do calculo é: " , resultadoD)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 55; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */