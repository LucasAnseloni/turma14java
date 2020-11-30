programa
{
	
	funcao inicio()
	{
		inteiro diaNasc
		inteiro mesNasc
		inteiro anoNasc
		inteiro diferencaDia
          inteiro diferencaMes
          inteiro diferencaAno
          inteiro somaData
		
		
		escreva (" Digite seu dia de nascimento: \n")
		leia (diaNasc)
		diferencaDia = 27 - diaNasc
		escreva (" Digite seu mes de nascimento: \n") 
		leia (mesNasc)
		diferencaMes = (11 - mesNasc) * 30
		escreva (" Digite seu ano de nascimento: \n")
		leia (anoNasc)
		diferencaAno = (2020 - anoNasc) * 365
             

          somaData = (diferencaDia + diferencaMes +  diferencaAno)
          escreva ("Sua idade em numero de dias é: " , somaData	)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */