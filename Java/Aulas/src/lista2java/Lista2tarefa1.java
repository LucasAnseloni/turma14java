package lista2java;

import java.util.Scanner;

public class Lista2tarefa1 {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);

      double pesoTomate = 0.0;
      double pesoExcedente = 0.0;
      double multaPagar = 0.0;
      
      System.out.println("Digite o peso do tomate em KG :");
      pesoTomate = leia.nextDouble();
      
      if (pesoTomate >50)
      {
    	  pesoExcedente = pesoTomate-50;
    	  multaPagar = pesoExcedente * 4;
    	  System.out.println("O peso do tomate foi de :"+pesoTomate+" voce ultrapassou 50 KG!");
    	  System.out.println("voce irá pagar uma multa de R$:"+multaPagar+" por ter ultrapassado "+pesoExcedente+" KG");
      }
    	  
      if(pesoTomate <= 50)
      {
   	  System.out.println("Você não irá pagar multa!!");
      }
      	
      
      
      
      
      
      leia.close();

	}

}
