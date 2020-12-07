	programa
	{						//Escrever um programa que leia uma quantidade desconhecida de números 
		               		//   e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
							//   A entrada de dados deve terminar quando for lido um número negativo.
		
		funcao inicio()
		{
	      inteiro contar0a25 = 0
	      inteiro contar26a50 = 0
	      inteiro contar51a75 = 0
	      inteiro contarAcima76 = 0
	      real numeroDigitado
	
	
	
	     
	     faca {
	     	escreva("\nDigite um numero :")
	      leia(numeroDigitado)
	      limpa()
	         se (numeroDigitado >=0 e numeroDigitado <=25)
	     {
	     	contar0a25 = contar0a25 +1
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 0 e 25 foi  :",contar0a25," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 26 e 50 foi  :",contar26a50," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 51 e 75 foi  :",contar51a75," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava acima de 75 foi  :",contarAcima76," \n")
	     	
	     }
	     senao se (numeroDigitado >25 e numeroDigitado <=50)
	     {
	     	contar26a50 = contar26a50 +1
	          escreva("\nA quantidade de vezes que o numero digitado estava entre 0 e 25 foi  :",contar0a25," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 26 e 50 foi  :",contar26a50," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 51 e 75 foi  :",contar51a75," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava acima de 75 foi  :",contarAcima76," \n")
	     
	     }
	     senao se (numeroDigitado >50 e numeroDigitado <=75)
	     {
	     	contar51a75 = contar51a75 +1
	          escreva("\nA quantidade de vezes que o numero digitado estava entre 0 e 25 foi  :",contar0a25," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 26 e 50 foi  :",contar26a50," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 51 e 75 foi  :",contar51a75," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava acima de 75 foi  :",contarAcima76," \n")
	     
	     }
	      senao se (numeroDigitado >75)
	     {
	     	contarAcima76 = contarAcima76 +1
	          escreva("\nA quantidade de vezes que o numero digitado estava entre 0 e 25 foi  :",contar0a25," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 26 e 50 foi  :",contar26a50," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava entre 51 e 75 foi  :",contar51a75," \n")
	     	escreva("\nA quantidade de vezes que o numero digitado estava acima de 75 foi  :",contarAcima76," \n")
	     
	     }
	     } enquanto (numeroDigitado >=0 )

	      escreva("\nA quantidade de vezes que o numero digitado estava entre 0 e 25 foi  :",contar0a25," \n")
		 escreva("\nA quantidade de vezes que o numero digitado estava entre 26 e 50 foi  :",contar26a50," \n")
		 escreva("\nA quantidade de vezes que o numero digitado estava entre 51 e 75 foi  :",contar51a75," \n")
		 escreva("\nA quantidade de vezes que o numero digitado estava acima de 75 foi  :",contarAcima76,"\n")
	    

	     }
	     
	   
	 
	    
	  
			
		
	}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */