programa
{
    inclua biblioteca Matematica

    funcao inicio()
    {
        inteiro numeroConta = 00001
        inteiro CPF = 12345, operacao
        real movimentacoes[10]
        inteiro numeroOperacoes = 10, boile, i = 0, aniversario
        real saldo = 0.0

        escreva ("Conta: "+numeroConta+"\nCPF do Titular: "+CPF+"\n")
        escreva("Bom dia.\n")

        escreva("Voce possui "+numeroOperacoes+" operacoes. Deseja realizar uma nova operacao?\n")
        escreva("Sim[1] ou Nao[0]\n")
        leia(boile)
        enquanto(boile == 1 e numeroOperacoes > 0){
            escreva("Qual operacao pretende realizar? Credito [1] ou Debito[2]:\n")
            leia(operacao)
            se(operacao == 1){
                escreva("Informe o valor da transação: R$")
                leia(movimentacoes[i])
                saldo += movimentacoes[i]
                i++
                numeroOperacoes--
            }senao se (operacao == 2){
                escreva("Informe o valor da transação: R$")
                leia(movimentacoes[i])
                se(saldo - movimentacoes[i] >= 0){
                    saldo -= movimentacoes[i]
                    i++
                    numeroOperacoes--
                }senao{
                    escreva("Saldo insuficiente para retirada do valor\n")
                }
            }senao(
                escreva("Opcao invalida. Tente novamente\n")
            )
            escreva ("\nSaldo Atual: R$",saldo,"\n")
            escreva("Voce ainda possui "+numeroOperacoes+" operacoes. Deseja realizar uma nova operacao?\n")
            escreva("Sim[1] ou Nao[0]\n")
            leia(boile)
        }

            escreva("É aniversario desta conta? Sim[1] Nao[2]\n")
            leia(aniversario)
            se(aniversario == 1){
                saldo *= 1.005
            }

            escreva ("\nSaldo Final do dia: R$",Matematica.arredondar(saldo, 2),"\n")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */