programa
{
	
	funcao inicio()
	{
		real indiceDePoluicao

		escreva (" Digite o indice de poluicao ")
		leia (indiceDePoluicao)

          se (indiceDePoluicao < 0.3){
          	escreva(" indice de poluicao aceitavel!!!")
          }
          senao se (indiceDePoluicao < 0.4) {
          	escreva ("industrias do grupo 1 por favor suspenderem as atividades!!!")
          }
          senao se (indiceDePoluicao < 0.5) {
          	escreva ("industrias do grupo 2 por favor suspenderem as atividades!!!")
          }
          senao se (indiceDePoluicao >= 0.5) {
          	escreva ("Todas as industrias  por favor suspenderem as atividades!!!")
          }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */