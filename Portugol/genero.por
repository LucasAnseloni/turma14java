programa
{
	
	funcao inicio()
	{

		caracter opcao

		escreva("{M} Masculino, {F} Feminino e {O} outros:")
		leia (opcao)
		se (opcao == 'M' ou opcao == 'm')    {
			escreva("Pessoa é do genero Masculino!")
					}
		senao se (opcao =='F' ou opcao =='f' ){
			escreva(" A pessoa é do genero Feminino")
					}
          senao se (opcao == 'O'ou opcao == 'o'){
          	escreva("Pessoa é do genero que quiser !")
          }
          senao{
          	escreva("vc escolheu uma tecla errada")
          }
		escreva ("fim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */