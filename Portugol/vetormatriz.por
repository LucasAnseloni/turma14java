programa
{
	                        //Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
	                        //Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	funcao inicio()
	{
		inteiro matriz [3][3] = {{1,2,3},{4,5,6},{7,8,9}}
		inteiro vetor[3] = {2,3,4}

          escreva(vetor[0] * matriz[0][0])
           escreva("\n",vetor[1] * matriz[1][0])
            escreva("\n",vetor[2] * matriz[2][0])

              escreva("\n",vetor[0] * matriz[0][1])
           escreva("\n",vetor[1] * matriz[1][1])
            escreva("\n",vetor[2] * matriz[2][1])

              escreva("\n",vetor[0] * matriz[0][2])
           escreva("\n",vetor[1] * matriz[1][2])
            escreva("\n",vetor[2] * matriz[2][2])
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */