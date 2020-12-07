programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()               /* A fórmula é IMC = peso / ( altura )2 
                                    Elabore um programa que leia o peso e a altura de um adulto e 
                                    mostre sua condição de acordo com a tabela abaixo. 
                                   IMC em adultos Condição 
                                    Abaixo de 18,5 Abaixo do peso 
                                    Entre 18,5 e 25 Peso normal 
                                     Entre 25 e 30 Acima do peso 
                                    Acima de 30 obeso
                                  */
                                  

	{
                  //variaveis = peso , altura
                  real peso = 0.0,altura = 0.0, IMC = 0.0

                  escreva("Digite seu peso em KG:")
                  leia(peso)

                   escreva("Digite sua altura em metros:")
                  leia(altura)

                  IMC = peso / (altura * altura)
                  escreva(mat.arredondar(IMC, 2))

                   se (IMC<18.5)
                  {
                  	escreva("\nVocê está abaixo do peso!")
                  }

                  senao se (IMC<25)
                  {
                  	escreva("\nSeu peso está normal!")
                  }
                 
                   senao se (IMC<30)
                  {
                  	escreva("\nVocê está acima do peso!")
                  }
                  senao se (IMC>30)
                  {
                  	escreva("\nVocê está obeso!")
            	   {
		
	}
}

	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 940; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */