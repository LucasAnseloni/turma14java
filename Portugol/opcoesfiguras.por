programa {
	
	funcao inicio() {
		real areaCirculo, areaTriangulo, areaRetangulo
		real raio, base, altura
		caracter op
		
		escreva("Digite o que quer calcular: ")
		escreva("\n----------------------------")
		escreva("\n[1] Área do Circulo")
		escreva("\n[2] Área do Triângulo")
		escreva("\n[3] Área do Retângulo")
		escreva("\n: ")
		leia(op)

		limpa()

		se ((op!='1') ou (op!='2') ou (op!='3')) {
		escreva ("opcao invalida")
		}

		escolha(op) {
			caso '1': 
				escreva("Digite o valor do raio: ")
				leia(raio)

				areaCirculo = (raio*raio) * 3.14

				escreva("A área do circulo é: "+ areaCirculo)	
			pare

			caso '2':
				escreva("Digite a base do triângulo: ")
				leia(base)

				escreva("Digite a altura do triângulo: ")
				leia(altura)

				areaTriangulo = (base*altura)/2

				escreva("A área do triângulo é: "+ areaTriangulo)	
			pare

			caso '3': 
				escreva("Digite o valor da base: ")
				leia(base)
				
				escreva("Digite o valor da altura: ")
				leia(altura)

				areaRetangulo = base*altura

				escreva("A área: "+ areaRetangulo)
			pare
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */