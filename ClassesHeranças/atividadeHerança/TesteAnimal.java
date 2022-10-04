package listaHeranca;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Gato[]gato = new Gato[5];
		Cao[]dog = new Cao[5];
		Homem[]man = new Homem[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Nome do gato: ");
			gato[i]= new Gato(ent.nextLine());
		}
		for(int i=0; i<5; i++) {
			System.out.println("Nome do Cão: ");
			dog[i]= new Cao(ent.nextLine());
		}
		for(int i=0; i<5; i++) {
			System.out.println("Nome do Homem: ");
			man[i]= new Homem(ent.nextLine());
		}
		
		for(int i=0; i< 5; i++) {
			System.out.println("Gato: " + gato[i].getNome() + " : " + gato[i].getFala());
		}
		System.out.println("\n");
		for(int i=0; i< 5; i++) {
			System.out.println("Cão: " + dog[i].getNome() + " : " + dog[i].getFala());
		}
		System.out.println("\n");

		for(int i=0; i< 5; i++) {
			System.out.println("Homem: " + man[i].getNome() + " : " + man[i].getFala());

		}
		ent.close();
	}

}
