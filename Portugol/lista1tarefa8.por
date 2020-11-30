programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real custoConsumidorCarro
		real custoFabricaCarro
		real percentagemDistribuidor
          real impostosPrecoFabrica
          const real VALORDISTRIBUIDOR = 0.28
          const real VALORIMPOSTO = 0.45

          escreva("Digite o preço de fabrica do carro:")
          leia(custoFabricaCarro)

          impostosPrecoFabrica = (custoFabricaCarro * VALORIMPOSTO)
          percentagemDistribuidor = (custoFabricaCarro * VALORDISTRIBUIDOR)

          custoConsumidorCarro = (custoFabricaCarro + impostosPrecoFabrica + percentagemDistribuidor)

          escreva("O custo final carro novo é "   + mat.arredondar(custoConsumidorCarro,1) + " reais. ")

          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */