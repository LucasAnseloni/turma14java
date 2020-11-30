programa                                       
{            inclua biblioteca Matematica --> mat     
	
	funcao inicio()                  //
	                                // 
	                                //
	{
		real horasTrabalhadas
		cadeia codigoHoras
		real excessoHoraExtra = 0.0
		real salarioAdicional = 0.0
		real salarioFixo = 0.0
		real salarioTotal

		escreva ("Digite o codigo das horas trabalhadas: " )
		leia (codigoHoras)


		escreva ("Digite as horas trabalhadas: " )
		leia (horasTrabalhadas)


		se (horasTrabalhadas > 50){
			escreva ("Limite de hora extra excedido!!\n")
          excessoHoraExtra = horasTrabalhadas - 50
          salarioAdicional = excessoHoraExtra * 20
          salarioFixo = horasTrabalhadas * 10
          salarioTotal = salarioAdicional + salarioFixo
               escreva ("O salario excedente a ser pago é de : " + salarioAdicional + " reais e o salario total é " + salarioTotal + " reais ")
		}
			 senao {
			 	escreva ("O salario a ser pago é de :" + horasTrabalhadas * 10 + " reais")
			 }


          
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */