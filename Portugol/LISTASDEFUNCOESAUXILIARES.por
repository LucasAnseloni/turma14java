programa  ***************** matriz****************
{
    funcao inicio()											//DECLARACAO VARIAVEIS 
    														// cadeia clientes[2] = {"lucas","carol"}
    														// caracter genero[2] = {'M','F'}
    {
        //Declaração de uma matriz de inteiros
        // de duas linhas e duas colunas já inicializado.
        inteiro matriz[2][2] = {{15,22},{10,11}}

        //Atribui -1 na primeira linha e segunda
        // coluna da matriz.
        matriz[0][1] = -1

        //Imprime o valor 15 correspondente  
        // a primeira linha e primeira coluna da matriz.
        inteiro i = 0
        escreva(matriz[i][0])
        escreva("\n")

        //Imprime o valor 11 correspondente  
        // a última linha e última coluna da matriz.
        escreva(matriz[1][1])

        //Declaração de uma matriz de reais de 
        // duas linhas e quatro colunas.
        real outra_matriz[2][4]

        //Declaração de uma matriz de caracteres onde o tamanho
        // de linhas e colunas são definidos pela inicialização
        caracter jogo_velha[][] = {{'X','O','X'}
                                  ,{'O','X','O'}
                                  ,{' ',' ','X'}}

    }
}


programa ***************vetor*****************
{
	
	funcao inicio()
	{
		inteiro gols [5] = {1,2,3,4,5}

         escreva (gols [0])
		
	}
}


programa ***************para****************
{
    funcao inicio()
    {
		inteiro tab

		para (inteiro c=1; c<=10; c++)
		{
			tab=c*3
			escreva ("3 x ", c, " = ", tab, "\n")
		}
	}
}




programa **************se*******************
{
        funcao inicio()
        {
					  
			inteiro num

			escreva ("Digite um número: ")
			leia (num)

			se (num==0)
			{
				escreva ("O número digitado é 0")
			}
  
		}
}

programa ******************enquanto*****************
{
    funcao inicio()
	{
		caracter parar
		parar = 'N'

		enquanto (parar != 'S')
		{
			escreva ("deseja parar o laço? (S/N)")
			leia (parar)
		}
	}
}	

programa **************façaenquanto****************
{
    funcao inicio()
    {
		real aresta, area

		faca 
		{
			escreva ("Informe o valor da aresta: ")
			leia (aresta)
		} enquanto (aresta <= 0)

		area=aresta*aresta
		escreva("A área é: ", area)
    }
}



programa   ***************senao****************
{  
    funcao inicio()  
    { 
    	real nota
    	escreva("digite a nota do aluno")
    	leia(nota)
    	se(nota >= 9)
    	{
    		escreva("O aluno foi um desempenho muito bom na prova")
		}
   		senao se (nota >= 7)
   		{
   			escreva("O aluno teve um desempenho bom na prova")
   		}
   		senao se (nota >= 6)
   		{
   			escreva("O aluno teve um desempenho razoável na prova")
   		}
   		senao
   		{
   			escreva("O aluno teve um desempenho mau na prova")
   		}
  	}  
}  


programa ************se ************senao*************
{
	funcao inicio()
	{
					  
		inteiro hora

		escreva ("Digite a hora: ")
		leia (hora)
		
		se (hora >= 6 e hora <= 18)
		{
			escreva ("É dia")
		}
		senao
		{
			escreva ("É noite")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */