programa
{
	inclua biblioteca Util
	/*1 - SELECIONAR UM ESTUDANTE PELA MATRICULA E ADICIONAR UMA NOTA DE 1 A 10

	2 - INFORMAR SE DESEJA CONTINUAR SIM OU NÃO

	3 - SE SIM SELECIONAR NOVO ALUNO PELA MATRICULA E ADICIONAR NOTA DE 1 A 10

	4 - QUANDO SELECIONADO NÃO, LIMPA A TELA E MOSTRA A MATRICULA, NOME, SEXO E NOTA DO ALUNO OU ALUNA:

	SE NOTA ATÉ 5 - REPROVADO/REPROVADA [INCLUSIVE]
	SE NOTA ACIMA DE 5  E  MENOR QUE 8 - RECUPERAÇÃO
	SE NOTA IGUAL OU MAIOR QUE 8 APROVADO/APROVADA 

	5- LISTA APROVADOS
	6- LISTA REPROVADOS
	7- MULHERES
	8 - HOMENS
	9 - Por Nota Acima de x
	
	 */
	 
	funcao inicio()
	{
		cadeia alunos[39] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins",
		"Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira",
		"Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima",
		"Fernanda Agapito","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves",
		"Gideão da Silva Idelfonso","Gilson Amorim De Matos","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles",
		"Heloisa Beatriz De Oliveira Costa","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura",
		"José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni Barros",
		"Lucas Gonçalves da Silva","Luis felipe da Silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves",
		"Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almena","Vinicius Alves Miranda"}
 		cadeia matriculas[39]
		caracter generos[39]={'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F',
		'M','F','M','M','M','M','M','F','F','M','F','M'}
		inteiro notas [39]
		caracter opcao = 'n'
				
		escreva ("GENERATION BRASIL\n")
		enquanto (opcao != '0')
		{
		escreva ("\n[1] Listar todos os alunos | [2] Listar alunos do gênero Masculino | [3] Listar alunos do gênero Feminino \n[4] Listar alunos aprovados | [5] Listar alunos reprovados | [6] Listar por uma nota desejada | [0] Finalizar ")
		escreva ("\nESCOLHA A OPÇÃO DESEJADA: ")
		leia (opcao)

		para (inteiro i = 0; i < 39; i++)
		{
			se (i<9)
			{
			matriculas[i] = "G7-0"+(i+1)	
			}	
			senao
			{
			matriculas[i] = "G7-"+(i+1)
			}
		}
		para (inteiro i = 0; i < 39; i++)
		{
			notas[i] = Util.sorteia(0,10)
		}
		
		se (opcao == '1')
		{
			lista(matriculas, notas, alunos, generos)
		}
		senao se (opcao == '2')
		{
			generoMasculino(matriculas, notas, alunos, generos)	
		}
		senao se (opcao == '3')
		{
			generoFeminino(matriculas, notas, alunos, generos)	
		}
		senao se (opcao == '4')
		{
			aprovados(matriculas, notas, alunos, generos)
		}
		senao se (opcao == '5')
		{
			reprovados(matriculas, notas, alunos, generos)
		}
		senao se (opcao == '6')
		{
			notaEscolhida(matriculas, notas, alunos, generos)
		}
		}
	}

		funcao lista (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{
			cadeia codigoAluno
	
		para (inteiro i = 0; i < 39; i++)
		{
			escreva (matriculas[i]," - ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n")					
		}
		escreva ("\nEscolha um aluno pela matricula:")
		leia (codigoAluno)
		
		para (inteiro i = 0; i < 39; i++)
		{
			se (codigoAluno == matriculas[i])
			{
				escreva("\nAluno Escolhido: ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n")
			}
		}	
		escreva("\n")
		
		}

		funcao generoMasculino (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{
			para (inteiro i = 0; i < 39; i++)
		{
			se (generos[i] == 'M')
			escreva (matriculas[i]," - ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n") 					
		}
		
		}
		
		funcao generoFeminino (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{
			para (inteiro i = 0; i < 39; i++)
		{
			se (generos[i] == 'F')
			escreva (matriculas[i]," - ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n") 					
		}
		
		}

		funcao aprovados (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{
			para (inteiro i = 0; i < 39; i++)
			{
				se (notas[i] > 5 e generos[i] =='M')
				{
					escreva (matriculas[i]," - ",alunos[i]," - Nota: ",notas[i]," - APROVADO\n")
				}
				se (notas[i] > 5 e generos[i] =='F')
				{
				escreva (matriculas[i]," - ",alunos[i]," - Nota: ",notas[i]," - APROVADA\n")
				}
			}
			
		}
		funcao reprovados (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{
			para (inteiro i = 0; i < 39; i++)
			{
				se (notas[i] <= 5 e generos[i] =='M')
				{
					escreva (matriculas[i]," - ",alunos[i]," - Nota: ",notas[i]," - REPROVADO\n")
				}
				se (notas[i] <= 5 e generos[i] =='F')
				{
				escreva (matriculas[i]," - ",alunos[i]," - Nota: ",notas[i]," - REPROVADA\n")
				}
			}
			
		}
		funcao notaEscolhida (cadeia matriculas[], inteiro notas[], cadeia alunos[], caracter generos[])
		{	
			inteiro notaAluno = 0
			escreva ("Digite a nota desejada: ")
			leia (notaAluno)
			para (inteiro i = 0; i < 39; i++)
			{ 			
				se (notas[i] >= notaAluno)
				{
					escreva (matriculas[i]," - ",alunos[i]," - Genêro: ",generos[i]," - Nota: ",notas[i],"\n")
				}
			}
			
		} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */