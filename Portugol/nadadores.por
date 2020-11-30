programa
{
	
	funcao inicio()
	{
		inteiro idadeNadadores

		escreva(" Digite a idade:")
		leia (idadeNadadores)

		se (idadeNadadores < 5){
			escreva ("idade nao permitida")
		} senao se (idadeNadadores <8){
			escreva("vc esta na turma infantil A")
		} senao se (idadeNadadores <12){
			escreva("vc esta na turma infantil B")
		} senao se (idadeNadadores <14){
			escreva("vc esta na turma juvenil A ")
		} senao se (idadeNadadores <18){
			escreva("vc esta na turma juvenil B ")
		} senao se (idadeNadadores >= 18){
			escreva("vc esta na turma Adultos ")
		}



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */