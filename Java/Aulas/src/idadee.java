import java.util.Scanner;

public class idadee {

	public static void main(String[] args) {
	  
		Scanner leia = new Scanner (System.in);
			
		int tempoAnos,ano,mes,dia;
		
		System.out.print("Digite o ano do seu nascimento :");
		ano = leia.nextInt();
		System.out.print("Digite o mes do seu nascimento");
		mes = leia.nextInt();
		System.out.print("Digite o dia do seu nascimento");
		dia = leia.nextInt();
		tempoAnos = (ano * 365)+(mes*30)+dia;
		System.out.println("Voce viveu"+tempoAnos+"dias");

		leia.close();
	}

}
