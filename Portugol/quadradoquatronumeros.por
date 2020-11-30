programa
{
	
	funcao inicio()
	{
		real numeroHum
		real numeroDois
		real numeroTres
		real numeroQuatro
		real quadranoNumeroHum
		real quadranoNumeroDois
		real quadranoNumeroTres
		real quadranoNumeroQuatro

          escreva (" Digite o numero Hum ")
          leia ( numeroHum) 

          
          escreva (" Digite o numero Dois ")
          leia ( numeroDois) 
          
          escreva (" Digite o numero Tres ")
          leia ( numeroTres) 
          
          escreva (" Digite o numero Quatro ")
          leia ( numeroQuatro) 

          quadranoNumeroHum = numeroHum * numeroHum
          quadranoNumeroDois = numeroDois * numeroDois
          quadranoNumeroTres = numeroTres * numeroTres
          quadranoNumeroQuatro = numeroQuatro * numeroQuatro

          se (quadranoNumeroTres >=1000) {
          	escreva ("O quadrado do terceiro numero é >=1000 sendo ---> " + quadranoNumeroTres)
          }
          senao {
          	escreva ("O quadrado do numero " + numeroHum + " é : " + quadranoNumeroHum + "O quadrado do numero " + numeroDois + " é : " + quadranoNumeroDois + "O quadrado do numero  " + numeroTres + " é : " + quadranoNumeroTres + "O quadrado do numero " + numeroQuatro + " é : " + quadranoNumeroQuatro ) 
          }

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */