package exemplos;

import java.util.Scanner;

import Objetos.Pessoa;
import Objetos.Produto;

public class PetDoEd {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa clientePet = new Pessoa();
		Produto produtoPet1 = new Produto("racao purina",10,250.25);
		Produto produtoPet2 = new Produto("osso",100,10);
		char tipoPet;
		
		Pet dog1 = new Pet(true,'C',"labrador");
		Pet cat1 = new Pet('F');
		Pet pet1 = new Pet('A');
		
		
		System.out.println("Pet do Ed");
		System.out.println("ola cliente, por favor digite seu nome");
		clientePet.nome = leia.next();
		System.out.println("vc é m ou f");
		clientePet.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("vc deseja comprar produtos para qual tipo de pet ");
		System.out.println("F , C , P");
		tipoPet = leia.next().toUpperCase().charAt(0);
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
		
		
	}

}
