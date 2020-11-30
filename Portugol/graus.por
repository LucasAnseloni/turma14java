programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real grausCelsius
		real fahrenheit
		
		escreva ("Digite o grau : ")
		leia (grausCelsius)

		fahrenheit = (grausCelsius * 1.8 + 32 )
		escreva ("O grau celsius em fahrenheit é " + Matematica.arredondar(fahrenheit,2) )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */