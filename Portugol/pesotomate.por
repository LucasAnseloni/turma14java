programa                                       
{            inclua biblioteca Matematica --> mat     
	
	funcao inicio()                  //50 kilos
	                                // 4 reais por kilo excedido
	                                //menos que isso paga nada
	{
		real pesoTomates
		real excessoPesoTomate = 0.0
		real multaExcesso = 0.0

		escreva ("Digite o peso dos tomates : " )
		leia (pesoTomates)


		se (pesoTomates > 50){
			escreva ("Limite de peso excedido deverá pagar multa!!\n")
          excessoPesoTomate = pesoTomates - 50
          multaExcesso = excessoPesoTomate * 4
               escreva ("O valor a ser pago é de : " + mat.arredondar(multaExcesso,2) + " reais ")
			 
		} 

          senao{
          	escreva ("Peso menor ou igual que 50 KG não pagará multa!!")
          }

          



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 503; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */