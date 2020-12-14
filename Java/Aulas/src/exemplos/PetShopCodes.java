package exemplos;
import java.util.Scanner;
import Objetos.Pessoa;
public class PetShopCodes {
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		Pessoa clientePet = new Pessoa();
		
		System.out.println("Digite o nome: ");
		clientePet.nome = leia.next();
		
	}
}