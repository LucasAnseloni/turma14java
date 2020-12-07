import java.util.Scanner;

public class custoveiculo {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double custoConsumidor;
		double custoFabrica;		
		double imposto = 0.45;
		double percentagem = 0.28;
		double taxaTotal;
		
		System.out.println("Digite o custo de fabrica do carro :");
		custoFabrica = leia.nextDouble();
		
		taxaTotal = (imposto + percentagem);
		custoConsumidor = custoFabrica * (taxaTotal + 1);
		
        System.out.println("O custo para o consumidor é de :"+custoConsumidor);
        
        leia.close();
	}

}
