package lista2java;

import java.util.Scanner;

public class Lista2Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String codigoOperario;
		int numeroHoras;
		double salarioExcedente;
		double horasExtras;
		double salarioTotal1;
		double salarioTotal2;
		double salarioFixo;
		
		System.out.println("Digite o codigo do operario :");
		codigoOperario = leia.next();
		
		System.out.println("Digite as horas do operario :");
		numeroHoras = leia.nextInt();
		
		if (numeroHoras >50)
		{
			horasExtras = numeroHoras - 50;
			salarioExcedente = horasExtras * 20;
			salarioFixo = (numeroHoras - horasExtras)*10 ;
			salarioTotal2 = salarioExcedente + salarioFixo;
			System.out.println("O salario fixo a receber é de R$:"+salarioFixo+" e o salario de hora extra é de :"+salarioExcedente);
		}if(numeroHoras <=50)
		{
			
			salarioExcedente = 0;
			salarioTotal1 = numeroHoras * 10;
			System.out.println("O salario a receber é de R$:"+salarioTotal1);
		}
		
		
		
		
		leia.close();

	}

}
