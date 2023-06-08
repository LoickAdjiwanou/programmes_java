package factorielle;

import java.util.Scanner;

public class Factorielle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce prgramme calcule la factorielle d'un nombre entier positif");
		int reprise = 1;
		do {
			System.out.print("Entrez un nombre entier positif: ");
			int nbr = scan.nextInt();
			scan.nextLine();
			int z = factorielle(nbr);
			System.out.println("");
			System.out.println("La factorielle de "+nbr+" est: "+z);
			System.out.println("");
			System.out.println("Voulez-vous recommencer ?");
			System.out.println("1- Oui");
			System.out.println("2- Non");
			System.out.print("Entrez 1 ou 2: ");
			reprise = scan.nextInt();
			System.out.println("");
		}
		while(reprise==1);
		
		if(reprise==2)
			System.out.println("Au revoir !");
	}
	
	public static int factorielle(int x) {
		int y=1, i=1;
		while(i < x) {
			y = y*i;
			i++;
		}
		return y*x;
	}

}
