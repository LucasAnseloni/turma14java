programa
{
	
	funcao inicio()
	{
		cadeia disciplinas[4]
		inteiro notas[4]
		inteiro numero
		caracter sexoAluno

		escreva ("vc é masculino ou feminino digite [M] ou [F] ")
		leia ( sexoAluno)
		se (sexoAluno == 'M'){
			escreva("masculino \n")
		}
		se (sexoAluno == 'F'){
			escreva("Feminino \n")
		}


		disciplinas[0] = "portugues"
		disciplinas[1] = "matematica"
		disciplinas[2] = "ciencias"
		disciplinas[3] = "artes"


		para (inteiro x = 0; x < 4; x++){
		 escreva(disciplinas[x],"\n")
		 escreva("digite uma nota de 0 a 10 ")
		 leia(notas[x])
		 {
			
			}

          escreva(disciplinas[0]+ "\n")
           escreva(disciplinas[1]+ "\n")
            escreva(disciplinas[2]+ "\n")
             escreva(disciplinas[3]+ "\n")


		
	//	escreva("digite um numero de 0 a 3")
	//	leia(numero)
	//	escreva(times[numero])
		



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */