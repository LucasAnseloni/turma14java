programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	 
	funcao inicio()
	{
		cadeia clientes[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins",
		"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
		"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
		"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves",
		"Gideão da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
		"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni Barros",
		"Lucas Gonçalves da Silva","Luis Felipe da Silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves",
		"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
 		cadeia numeroConta
 		cadeia contas[39]
 		caracter generos[39]={'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F',
		'M','F','M','M','M','M','M','F','F','M','F','M'}
		caracter opcao = 'n'
		real movimentacoes [5]
		
				
		escreva ("G7-BANK\n")
		escreva ("\nNumero da conta: ")
		leia (numeroConta)
		
		para (inteiro i = 0; i < 39; i++)
		{
			se (i<9)
			{
			contas[i] = "0000"+(i+1)	
			}	
			senao
			{
			contas[i] = "000"+(i+1)
			}
		}
		para (inteiro i = 0; i < 39;i++)
		{
			se (numeroConta == contas[i])
			{
				se (generos[i] == 'M')
				{
					escreva ("Bem-Vindo ",clientes[i],"\n")
				}
				senao se (generos[i] == 'F')
				{
					escreva ("Bem-Vinda ",clientes[i],"\n")
				}
			}
			
		}
		
		enquanto (opcao != '1' e opcao != '2' e opcao != '3' e opcao != '4' e opcao != '5')
		{
		   escreva ("Escolha o tipo de conta\n")
		escreva ("[1]Conta-Poupança | [2]Conta-Corrente | [3]Conta-Especial | [4]Conta-Empresa | [5]Conta-Universitária")
		leia (opcao)
		}
		
		se (opcao == '4')
		{
			empresa()            
		}
		senao se (opcao == '1')
		{
			poupanca()
		}
		senao se (opcao == '2')
		{
			corrente()	
		}
		senao se (opcao == '3')
		{
			especial()
		}
		senao se (opcao == '5')
		{
			universitaria()
		}
	}
		

               funcao poupanca ()

               
               {
               	real movimentacoes[10] 
        cadeia numeroConta = "00001", cpf = "12345"
        real saldo = 0.0, acrescimoRecebido = 0.00
        inteiro diaAniversario = 10, diaAtual
        caracter tipoTransacao


        escreva ("BEM-VINDO AO G7 BANK\n\n")
        escreva ("Conta-Poupança:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n")

        para (inteiro i=0; i<3; i++)
        {
            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
            leia (tipoTransacao)
            se (tipoTransacao == 'C' ou tipoTransacao == 'c')
            {
                escreva("Informe o valor da transação: R$")
                leia (movimentacoes[i])
                saldo+=movimentacoes[i]
                escreva ("Transação Realizada com sucesso\n")
                escreva ("Saldo atual: R$",saldo,"\n")
            }
            senao se (tipoTransacao == 'D' ou tipoTransacao == 'd')
            {
                escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                     se (saldo-movimentacoes[i] >= 0)
                {
                saldo-=movimentacoes[i]
                escreva ("Transação Realizada com sucesso\n")
                escreva ("Saldo atual: R$",saldo,"\n")
                }
                   senao se (saldo-movimentacoes[i] < 0)
                {
                    escreva ("Você nao possui saldo suficiente \n")
                    escreva ("Saldo atual: R$",saldo,"\n")
                }
            }
        }
			escreva("É aniversario desta conta? Sim[1] Nao[2]\n")
                leia(diaAniversario)
                se(diaAniversario == 1){
                acrescimoRecebido = saldo * 0.005
                saldo += acrescimoRecebido 
                
            escreva ("\nHoje é o aniversário da sua conta\nVocê recebeu uma rentabilidade extra de: R$",acrescimoRecebido)
                }
        
            escreva ("\nSaldo atual: R$",mat.arredondar(saldo,2))
        
        escreva ("\nOBRIGADO POR UTILIZAR O G7 BANK\n\n")
               }

			funcao corrente ()
			{
				  real movimentacoes[10]                           // - SOLICITAR NOVO TALÃO E ALTERAR A NUMERAÇÃO
        cadeia numeroConta = "00001", cpf = "12345" ,talaoCheque = "T-0" 
        real saldo = 0.0
        caracter tipoTransicao, aceiteTalaoCheque
        inteiro codigoTalao = 0

        escreva ("BEM-VINDO AO G7 BANK\n\n")

        escreva ("Conta-Corrente:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n\n")
        para (inteiro i = 0; i < 3; i++)
        {
            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
            leia (tipoTransicao)
                se (tipoTransicao == 'C' ou tipoTransicao=='c')
                {
                    escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                    saldo+=movimentacoes[i]
                }
                senao se (tipoTransicao =='D' ou tipoTransicao =='d')
                {
                    escreva("Informe o valor da transação: R$")
                    leia (movimentacoes[i])
                    saldo-=movimentacoes[i]
                    
                }  se (saldo < = 0)
                 {
                	escreva ("Você nao possui saldo suficiente!! \n")
                }
         
        	 escreva ("Você possui talão de cheque disponivel : ",talaoCheque,codigoTalao,"\nDeseja solicitar [S]Sim ou [N]Não: ")
        leia (aceiteTalaoCheque)
        se (aceiteTalaoCheque == 'S' ou aceiteTalaoCheque == 's')
        {
        
        	escreva("Seu novo codigo de talao de cheque é :", talaoCheque,codigoTalao++, "\n")
        }

       
        	
        		
    }
      escreva("\nOBRIGADO POR UTILIZAR O G7 BANK")  
			}

               funcao especial()
               {real movimentacoes[10] 
        cadeia numeroConta = "00001", cpf = "12345"
        real saldo = 0.0, valorLimite = 5000.0, valorEmprestimo = 0.0
        caracter tipoTransacao, aceiteEmprestimo

        escreva ("BEM-VINDO AO G7 BANK\n\n")
        escreva ("Conta-Empresa:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n")

        para (inteiro i = 0; i < 10; i++)
        {
            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
            leia (tipoTransacao)
            se (tipoTransacao == 'C' ou tipoTransacao=='c')
            {
                escreva("Informe o valor da transação: R$")
                leia (movimentacoes[i])
                escreva ("Transação Realizada com sucesso.")
                saldo+=movimentacoes[i]
            }
            senao se (tipoTransacao =='D' ou tipoTransacao =='d')
            {
                escreva("Informe o valor da transação: R$")
                leia (movimentacoes[i])
                escreva ("Transação Realizada com sucesso.")
                saldo-=movimentacoes[i]
            }

            escreva ("\nSaldo atual: R$",saldo,"\n\n")
            escreva ("Valor do Limite: R$",valorLimite,"\nDeseja solicitar [S]Sim ou [N]Não: ")
            leia (aceiteEmprestimo)

            se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
            {
                escreva ("Digite o valor que deseja solicitar: R$")
                leia (valorEmprestimo)
            }
se (valorEmprestimo > 0 e valorEmprestimo <=valorLimite)
            {
                saldo+=valorEmprestimo
                valorLimite-=valorEmprestimo
                escreva ("Solicitação realizada com sucesso\n")
                escreva ("Saldo Atual: R$",saldo,"\n")
                escreva ("Limite de Empréstimo: R$",valorLimite,"\n")
            }
            senao se (valorEmprestimo > 0 e valorEmprestimo > valorLimite)
            {
                escreva ("\n\nValor solicitado não autorizado\n\n")
            }
        }
        escreva ("OBRIGADO POR UTILIZAR O G7 BANK\n\n")
               }

			funcao empresa ()
			{
				   real movimentacoes[3] 
        cadeia numeroConta = "00001", cpf = "12345"
        real saldo = 0.0, limiteEmprestimo = 5000.0, valorEmprestimo = 0.0
        caracter tipoTransacao, aceiteEmprestimo

        escreva ("BEM-VINDO AO G7 BANK\n\n")
        escreva ("Conta-Empresa:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n")

        para (inteiro i = 0; i < 3; i++)
        {
            escreva("\nQual transação deseja realizar [C]Credito ou D[Débito]: ")
            leia (tipoTransacao)
            se (tipoTransacao == 'C' ou tipoTransacao=='c')
            {
                escreva("Informe o valor da transação: R$")
                leia (movimentacoes[i])
                escreva ("Transação Realizada com sucesso.")
                saldo+=movimentacoes[i]
            }
            senao se (tipoTransacao =='D' ou tipoTransacao =='d')
            {
                escreva("Informe o valor da transação: R$")
                leia (movimentacoes[i])
                escreva ("Transação Realizada com sucesso.")
                saldo-=movimentacoes[i]
            }

            escreva ("\nSaldo atual: R$",saldo,"\n\n")
            escreva ("Limite de Empréstimo: R$",limiteEmprestimo,"\nDeseja solicitar [S]Sim ou [N]Não: ")
            leia (aceiteEmprestimo)

            se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
            {
                escreva ("Digite o valor que deseja solicitar: R$")
                leia (valorEmprestimo)
            }
se (valorEmprestimo > 0 e valorEmprestimo <= limiteEmprestimo)
            {
                saldo+=valorEmprestimo
                limiteEmprestimo-=valorEmprestimo
                escreva ("Solicitação realizada com sucesso\n")
                escreva ("Saldo Atual: R$",saldo,"\n")
                escreva ("Limite de Empréstimo: R$",limiteEmprestimo,"\n")
            }
            senao se (valorEmprestimo > 0 e valorEmprestimo > limiteEmprestimo)
            {
                escreva ("Valor solicitado não autorizado\n\n")
            }
        }
        escreva ("\nOBRIGADO POR UTILIZAR O G7 BANK\n\n")
}

               funcao universitaria()
               {
               	 real movimentacoes[3] 
        cadeia numeroConta = "00001", cpf = "12345"
        real saldo = 0.0, limiteEmprestimo = 1000.0, valorEmprestimo = 0.0
        caracter tipoTransicao, aceiteEmprestimo

		escreva("BEM VINDO AO G7 BANK")
		escreva("\n")
		escreva("\n")
		
       	escreva ("Conta-Universitária:",numeroConta,"\nCPF do Titular:",cpf,"\nSaldo: R$:",saldo,"\n\n")
      	 
      	 para (inteiro i = 0; i < 3; i++){
      	 	escreva("\n")
      	 	escreva("Qual transação deseja realizar [C]Credito ou D[Débito]: ")
      	 	leia(tipoTransicao)
      	 		se (tipoTransicao == 'C' ou tipoTransicao == 'c'){
      	 			escreva("Informe o valor da transação: R$")
      	 			leia(movimentacoes[i])
      	 			saldo = saldo + movimentacoes[i]  	 			
      	 		}

      	 		senao se (tipoTransicao == 'D' ou tipoTransicao == 'd'){
      	 			escreva("Informe o valor da transação: R$")
      	 			leia(movimentacoes[i])
      	 			saldo = saldo - movimentacoes[i]
      	 		}
      	 		senao{
      	 			escreva("\n")
      	 			escreva("ERRO! Por favor, digite novamente!")
      	 			escreva("\n")
      	 		}	

      	 		escreva ("Saldo atual: R$",saldo,"\n\n")
      	 }
			
			escreva("\n")
      		escreva("Saldo atual: R$", saldo)
      		escreva("\n")
      		escreva("Limite de Empréstimo: R$", limiteEmprestimo)
      		escreva("\n")
      		escreva("\n")
      		escreva("Deseja solicitar [S]Sim ou [N]Não: ")
       		leia (aceiteEmprestimo)

         		   se (aceiteEmprestimo == 'S' ou aceiteEmprestimo == 's')
         		   {
               		escreva ("Digite o valor que deseja solicitar: R$")
               	 	leia (valorEmprestimo)
               	 	 se (valorEmprestimo > 0 e valorEmprestimo <= limiteEmprestimo){
		                saldo = saldo + valorEmprestimo
		                limiteEmprestimo = limiteEmprestimo - valorEmprestimo             
           		 }
           		 senao 
           		 {
           		 	escreva("\nTransação não autorizada\n")
           		 }

           		}
              		 	senao se (aceiteEmprestimo == 'N' ou aceiteEmprestimo == 'n'){
               		escreva("\n")
               		escreva ("OBRIGADO POR UTILIZAR O G7 BANK")
           			 }
           		 
         			 escreva("\n")
         		  	escreva("Saldo atual: R$", saldo)
      			escreva("\n")
      			escreva("Limite de Empréstimo: R$", limiteEmprestimo)
      			escreva("\n")
      			escreva("\n")
      			escreva ("OBRIGADO POR UTILIZAR O G7 BANK")
               }

              
               
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1481; 
 * @DOBRAMENTO-CODIGO = [85, 142, 189, 242, 296];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */