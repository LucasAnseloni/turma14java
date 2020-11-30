programa
{
	
	funcao inicio()
	
	{
		real mediaNotas
		real notaMatematica
		real notaPortugues
		real notaQuimica
		real Passou
		funcao fatorial (Passou: cadeia): cadeia
		

		escreva (" Digite a nota da prova de matematica : " )
		leia (notaMatematica)
		escreva (" Digite a nota da prova de portugues : " )
		leia (notaPortugues)
		escreva (" Digite a nota da prova de quimica : " )
		leia (notaQuimica)

          mediaNotas = (notaMatematica + notaPortugues + notaQuimica) / 3
		escreva (" A média das notas é : " + mediaNotas)

	}
	{

		se mediaNotas >= 7 entao 
		retorne (Passou)
		
	}	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 594; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */