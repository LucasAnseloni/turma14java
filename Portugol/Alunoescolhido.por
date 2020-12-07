programa
{
	
	funcao inicio()
	{
		cadeia alunos[] = {"ED","GEANDRO","JESSICA","LUIZA"}
		caracter sexoAlunos[] = { 'M','M','F','F'}
		cadeia matriculas[4]
		cadeia aluno
		para (inteiro x=0; x< 4; x++)
		{
			matriculas[x] = "P1-"+(x+1)	
		}
		para (inteiro x=0; x< 4; x++){
			escreva("\nmatricula:", matriculas[x], " - ",alunos[x])
		}
		escreva("\nEscolha um aluno pela matricula:" )
		leia(aluno)
		para (inteiro x=0; x<4; x++) //molejão
		{
			se ( aluno == matriculas[x])
			{
				se( sexoAlunos[x] == 'M')
				{
					escreva("\nO aluno escolhido foi : ", alunos[x])
				}
				senao
				{
					escreva("\nA aluna escolhida foi : ", alunos[x])
				}
			}
			
		}
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */