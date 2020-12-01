programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio() // principal - roda o programa
	{
		//variaveis
		caracter tipoTemp // F - FAREH OU C - CELCIUS
		real temperatura
		inteiro tamanho
		
		//entradas
		
		linha()
		pula()
		escreva("        Calculo de temperaturas")
		pula()
		linha()
		pula()
		escreva("1 para Faren  retorna Celcius\n")
		escreva("2 para Celcius retorna Farenheiht\n")
		escreva("Digite o numero da opcao: ")
		leia (tipoTemp)
		escreva("Digite o tamanho da linha: ")
		leia(tamanho)
		minhalinha(tamanho)
		pula()
		
		para (inteiro x =1; x<=tamanho; x++)
		{
			escreva("░")
			
		}
		pula()
		se (tipoTemp == '1')
		{
			escreva("Digite a temperatura em Farenheint: ")
			leia (temperatura)
			escreva("Temperatura em Celcius: ",FarenParaCelcius(temperatura),"°C")	
		}
		senao se (tipoTemp=='2')
		{
			escreva("Digite a temperatura em Celcius: ")
			leia (temperatura)
			escreva("Temperatura em Celcius: ",CelciusParaFaren(temperatura),"°F")	
		}
		
	}
	// funcoes ou metodos
	funcao linha() //modularização - metodo - void
	{
		escreva("---------------------------------------")	
	}
	funcao pula(){
		escreva("\n")
	}
	funcao real FarenParaCelcius(real tempFaren) //retorna um valor celcius a parti de um faren
	{
		real tempCelcius = 0.0
		tempCelcius = mat.arredondar(((tempFaren - 32)/1.8),2)
		retorne tempCelcius
	}
	funcao real CelciusParaFaren(real tempCelcius) //escopo
	{
		real tempFaren = 0.0
		tempFaren = mat.arredondar(((tempCelcius * 1.8)+32),2)
		retorne tempFaren
	}
	funcao minhalinha(inteiro tamanho)
	{
		para (inteiro x = 1; x<=tamanho; x++)
		{
			escreva("|")
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */