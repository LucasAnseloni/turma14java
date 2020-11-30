programa
{
	inclua biblioteca Matematica
	
	
	funcao inicio()
	{
		inteiro tempoEvento
		real tempoHoras
		inteiro tempoMinutos
		inteiro tempoSegundos
		
		escreva ("Digite o tempo do evento da empresa : ")
		leia (tempoEvento)

		tempoHoras = tempoEvento / 3600.0
		escreva (" O tempo do evento em Horas é : " + Matematica.arredondar(tempoHoras,2) + " H\n")

		tempoMinutos = tempoHoras * 60
		escreva (" O tempo de evento em minutos é :" + tempoMinutos + " M\n")

		tempoSegundos = tempoEvento
		escreva (" O tempo de evento em segundos é : " + tempoSegundos + " S\n")

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */