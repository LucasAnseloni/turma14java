import java.util.Scanner;

public class anomesessaidias {
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner (System.in);
		
		int segundos;
		
		
		System.out.println("Digite o tempo de evento da empresa em segundos:");
		segundos = leia.nextInt();
		
		int horas = segundos/3600;
		int minutos = (segundos % 3600) / 60;
		int segundos1  = (segundos % 3600)%60;
		
				
		System.out.println("O tempo do evento foi :"+"\n"+horas+" horas"+"\n"+minutos+" minutos"+"\n"+segundos1+" segundos");
		
		leia.close();
	}

}
