programa            				
								
{
              
       
	
	
	funcao inicio()
	{
		real dinheiroCheque = 0.0
		real cartaoCredito = 0.0
		real duasVezes = 0.0
		real tresVezes = 0.0
		cadeia produto[4] = {"calça","bermuda","sapato","camisa"}
		real valorProduto = 0.0,valorProduto1 = 0.0,valorProduto2 = 0.0,valorProduto3 = 0.0
		caracter opcao = 'n'

		escreva("Bem vindo(a) a loja de roupas e calçados Generation Brasil\n")

		escreva ("\n[1] calça | [2] bermuda | [3] sapato | [4] camisa ")
		escreva ("\nESCOLHA A OPÇÃO DESEJADA: ")
		leia (opcao)

		se (opcao == '1')
		{
			escreva("Digite o valor da calça :")
			leia(valorProduto)
			dinheiroCheque = valorProduto * 0.8
			cartaoCredito = valorProduto * 0.85
			duasVezes = valorProduto / 2
			tresVezes = (valorProduto * 1.1) / 3
			escreva("Digite o numero da opção de como deseja pagar :\n [1] dinheiro/cheque no valor de:",dinheiroCheque," \n [2] cartao de crédito no valor de :",cartaoCredito,"\n [3] em duas vezes de :",duasVezes,"\n [4] em tres vezes de:",tresVezes,"\n")
			leia(opcao)
			se (opcao == '1')
			{
			escreva("O total a pagar é:",dinheiroCheque)
			}
			senao se (opcao == '2')
			{
			escreva("O total a pagar é:",cartaoCredito)
			}
			senao se (opcao == '3')
			{
			escreva("O total a pagar é 2 x:",duasVezes)
			}
			senao se (opcao == '4')
			{
			escreva("O total a pagar é 3 x:",tresVezes) 
			
			}
			escreva("\nObrigado pela compra volte sempre!!")
		}

		
			
		senao se (opcao == '2')
		{
			escreva("Digite o valor da bermuda :")
			leia(valorProduto)
			dinheiroCheque = valorProduto * 0.8
			cartaoCredito = valorProduto * 0.85
			duasVezes = valorProduto / 2
			tresVezes = (valorProduto * 1.1) / 3
			escreva("Digite o numero da opção de como deseja pagar :\n [1] dinheiro/cheque no valor de:",dinheiroCheque," \n [2] cartao de crédito no valor de :",cartaoCredito,"\n [3] em duas vezes de :",duasVezes,"\n [4] em tres vezes de:",tresVezes,"\n")
			leia(opcao)
			se (opcao == '1')
			{
			escreva("O total a pagar é:",dinheiroCheque)
			}
			senao se (opcao == '2')
			{
			escreva("O total a pagar é:",cartaoCredito)
			}
			senao se (opcao == '3')
			{
			escreva("O total a pagar é 2 x:",duasVezes)
			}
			senao se (opcao == '4')
			{
			escreva("O total a pagar é 3 x:",tresVezes) 
			
			}
			escreva("\nObrigado pela compra volte sempre!!")
		}
		
		
		
		senao se (opcao == '3')
		{
			escreva("Digite o valor do sapato :")
			leia(valorProduto)
			dinheiroCheque = valorProduto * 0.8
			cartaoCredito = valorProduto * 0.85
			duasVezes = valorProduto / 2
			tresVezes = (valorProduto * 1.1) / 3
			escreva("Digite o numero da opção de como deseja pagar :\n [1] dinheiro/cheque no valor de:",dinheiroCheque," \n [2] cartao de crédito no valor de :",cartaoCredito,"\n [3] em duas vezes de :",duasVezes,"\n [4] em tres vezes de:",tresVezes,"\n")
			leia(opcao)
			se (opcao == '1')
			{
			escreva("O total a pagar é:",dinheiroCheque)
			}
			senao se (opcao == '2')
			{
			escreva("O total a pagar é:",cartaoCredito)
			}
			senao se (opcao == '3')
			{
			escreva("O total a pagar é 2 x:",duasVezes)
			}
			senao se (opcao == '4')
			{
			escreva("O total a pagar é 3 x:",tresVezes) 
			
			}
			escreva("\nObrigado pela compra volte sempre!!")
		
			
		}
		senao se (opcao == '4')
		{
			escreva("Digite o valor da camisa :")
			leia(valorProduto)
			dinheiroCheque = valorProduto * 0.8
			cartaoCredito = valorProduto * 0.85
			duasVezes = valorProduto / 2
			tresVezes = (valorProduto * 1.1) / 3
				escreva("Digite o numero da opção de como deseja pagar :\n [1] dinheiro/cheque no valor de:",dinheiroCheque," \n [2] cartao de crédito no valor de :",cartaoCredito,"\n [3] em duas vezes de :",duasVezes,"\n [4] em tres vezes de:",tresVezes,"\n")
			leia(opcao)
			se (opcao == '1')
			{
			escreva("O total a pagar é:",dinheiroCheque)
			}
			senao se (opcao == '2')
			{
			escreva("O total a pagar é:",cartaoCredito)
			}
			senao se (opcao == '3')
			{
			escreva("O valor a pagar é 2 x:",duasVezes)
			}
			senao se (opcao == '4')
			{
			escreva("O valor a pagar é 3 x:",tresVezes) 
			
			}
			escreva("\nObrigado pela compra volte sempre!!")
			
		}


		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */