package lista6java;

public class LerAnimais {

	public static void main(String[] args) {
		
		Animal a = new Cachorro("cachorro",10);
		Animal b = new Cavalo("cavalo",15);
		Animal c = new Preguica("preguiça",12);
		
		System.out.printf("O %s tem %d anos e faz:%s ",a.nome,a.idade,a.emitirSom());
		System.out.printf("\nO %s tem %d anos e faz :%s ",b.nome,b.idade,b.emitirSom());
		System.out.printf("\nA %s tem %d anos e faz :%s ",c.nome,c.idade,c.emitirSom());
		
		
		

	}

}
