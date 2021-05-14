import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		double valorInvestido;
		
		
		System.out.println("Digite o valor que a empresa deseja investir em seu anuncio:");
		valorInvestido = leia.nextDouble();
		
		double numeroDePessoasQueVisualizamOAnuncioOriginal = valorInvestido*30;
		double numeroDePessoasQueClicaramNoAnuncio = (numeroDePessoasQueVisualizamOAnuncioOriginal*0.12);
		double numeroDePessoasQueCompartilharamOAnuncio = (numeroDePessoasQueClicaramNoAnuncio*0.15);
		double visualizacoesAtravesDoCompartilhamento = (numeroDePessoasQueCompartilharamOAnuncio*40);
		double numeromaximoDeCompartilhamento = (numeroDePessoasQueCompartilharamOAnuncio*4);
		double numeromaximoVisualizacaoCompartilhadoMesmoAnuncio = (numeromaximoDeCompartilhamento*40);
		double retornoNumeroMaximoDePessoasSomaAnuncioOriginalMaisCompartilhamentos = (numeroDePessoasQueVisualizamOAnuncioOriginal+numeromaximoVisualizacaoCompartilhadoMesmoAnuncio);
				
		System.out.println("O numero aproximado de pessoas  que visualizaram o anuncio original foi de: "+numeroDePessoasQueVisualizamOAnuncioOriginal+" pessoas");
		System.out.println("O numero aproximado de pessoas que clicaram no anuncio  foi de: "+numeroDePessoasQueClicaramNoAnuncio+" pessoas");
		System.out.println("O numero aproximado de pessoas que compartilharam o anuncio  foi de: "+numeroDePessoasQueCompartilharamOAnuncio+" pessoas");
		System.out.println("O numero aproximado de pessoas que visualizaram o anuncio atraves do compartilhamento foi de: "+visualizacoesAtravesDoCompartilhamento+" pessoas");
		System.out.println("O numero máximo de compartilhamento dos anuncios: "+numeromaximoDeCompartilhamento);
		System.out.println("O numero máximo de visualizacao compartilhado o mesmo anuncio : "+numeromaximoVisualizacaoCompartilhadoMesmoAnuncio);
		System.out.println("O numero máximo de visualizacao do anuncio original somando os compartilhamentos do anuncio : "+retornoNumeroMaximoDePessoasSomaAnuncioOriginalMaisCompartilhamentos);
		
		
		leia.close();
	}

}

