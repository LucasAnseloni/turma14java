import java.util.Scanner;





public class CadastroDeAnuncio {
	
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		
		double valorTotalInvestido;
		double valorInvestido;
		String nomeDoAnuncio;
		String nomeDoCliente;
		
		
		
		System.out.println("Digite o nome do seu anuncio:");
		nomeDoAnuncio = leia.next();
		
		System.out.println("Digite o nome do seu Cliente:");
		nomeDoCliente = leia.next();
		
		System.out.println("Digite o dia do inicio anuncio nesse formato dd:");
		int diaInicioAnuncio = leia.nextInt();
		
		System.out.println("Digite o mes do inicio anuncio nesse formato mm:");
		int mesInicioAnuncio = leia.nextInt();
		
		System.out.println("Digite o ano do inicio anuncio nesse formato aaaa:");
		int anoInicioAnuncio = leia.nextInt();
		
		System.out.println("Digite o dia do fim anuncio nesse formato dd:");
		int diaFimAnuncio = leia.nextInt();
		
		System.out.println("Digite o mes do fim anuncio nesse formato mm:");
		int mesFimAnuncio = leia.nextInt();
		
		System.out.println("Digite o ano do fim anuncio nesse formato aaaa:");
		int anoFimAnuncio = leia.nextInt();
	
		int qtgDiasDoAnuncio = (((anoFimAnuncio-anoInicioAnuncio)*365) + ((mesFimAnuncio - mesInicioAnuncio)*30) + (diaFimAnuncio - diaInicioAnuncio));
		System.out.println(qtgDiasDoAnuncio);
		
		System.out.println("Digite o valor que a empresa deseja investir por dia:");
		double valorInvestidoPorDia = leia.nextDouble();
		
		valorTotalInvestido = valorInvestidoPorDia * qtgDiasDoAnuncio;
		
		System.out.println("O valor total investido pela empresa é de: "+ valorTotalInvestido);
		
		
		
		double numeroDePessoasQueVisualizamOAnuncioOriginal = valorTotalInvestido*30;
		double numeroDePessoasQueClicaramNoAnuncio = (numeroDePessoasQueVisualizamOAnuncioOriginal*0.12);
		double numeroDePessoasQueCompartilharamOAnuncio = (numeroDePessoasQueClicaramNoAnuncio*0.15);
		double visualizacoesAtravesDoCompartilhamento = (numeroDePessoasQueCompartilharamOAnuncio*40);
		double numeromaximoDeCompartilhamento = (numeroDePessoasQueCompartilharamOAnuncio*4);
		double numeromaximoVisualizacaoCompartilhadoMesmoAnuncio = (numeromaximoDeCompartilhamento*40);
		double retornoNumeroMaximoDePessoasSomaAnuncioOriginalMaisCompartilhamentos = (numeroDePessoasQueVisualizamOAnuncioOriginal+numeromaximoVisualizacaoCompartilhadoMesmoAnuncio);
				
		System.out.println("O numero máximo aproximado de visualizacao do anuncio original somando os compartilhamentos do anuncio : "+retornoNumeroMaximoDePessoasSomaAnuncioOriginalMaisCompartilhamentos);
		System.out.println("O numero máximo aproximado de pessoas que podem clicar no anuncio é de: "+retornoNumeroMaximoDePessoasSomaAnuncioOriginalMaisCompartilhamentos*0.12+" pessoas");
		System.out.println("O numero máximo aproximado de visualizacao compartilhado o mesmo anuncio : "+numeromaximoVisualizacaoCompartilhadoMesmoAnuncio);
		
		
		
		leia.close();
	}

}
