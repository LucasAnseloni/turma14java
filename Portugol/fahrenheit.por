programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real grausCelsius
		real fahrenheit
		
		escreva ("Digite o grau : ")
		leia (fahrenheit)

		grausCelsius = ( (fahrenheit - 32) *0.5555555556)
		escreva ("O grau fahrenheit em grausCelsius é " + Matematica.arredondar(grausCelsius,2 ) + " c")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */