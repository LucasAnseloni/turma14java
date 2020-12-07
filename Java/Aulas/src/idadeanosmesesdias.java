import java.util.Scanner;

public class idadeanosmesesdias {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int quantidadeDias;
		int numeroAnos;
		int numeroMeses;
	//	int numeroDias;
		
		System.out.println("Digite a quantidade de dias :");
		quantidadeDias = leia.nextInt();
		
		numeroAnos = quantidadeDias / 365;
		numeroMeses = (numeroAnos * 12)%365;
		System.out.println(numeroAnos+"\n"+numeroMeses);
		
		leia.close();

	}

}
