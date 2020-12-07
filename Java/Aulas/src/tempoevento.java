import java.util.Scanner;

public class tempoevento {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		int seg;
		
		System.out.println("Tempo de duracao de funcionamento da fabrica em segundo :");
		seg = leia.nextInt();
		
		int horas = seg/3600;
		int minutos = (seg%3600)/60;
		int segundos = (seg%3600)%60;
		
		System.out.println("A fábrica funcionou :"+"\nhoras"+horas+"\nminutos"+minutos+"\nsegundos"+segundos);
        
		leia.close();
	}

}
