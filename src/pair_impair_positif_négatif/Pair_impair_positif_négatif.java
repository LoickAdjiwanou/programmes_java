package pair_impair_positif_n�gatif;

import java.util.Scanner;

public class Pair_impair_positif_n�gatif {

	public static void main(String[] args) {
		System.out.println("Ce programme d�termine la parit� et le signe d'un nombre");
		int reprise=1;
		do {
			System.out.print("Veuillez enter un nombre entier: ");
			Scanner scan = new Scanner(System.in);
			int val = scan.nextInt();
			scan.nextLine();
			if(val%2==0) {
				if(val>0)
					System.out.println("Le nombre "+val+" est pair et positif.");
				else
					System.out.println("Le nombre "+val+" est pair et n�gatif.");
			}
			else {
				if(val<0)
					System.out.println("Le nombre "+val+" est impair et n�gatif.");
				else
					System.out.println("Le nombre "+val+" est impair et positif.");
			}
			System.out.println("");
			System.out.println("Voulez-vous recommencer ?");
			System.out.println("1- Oui");
			System.out.println("2- Non");
			System.out.print("Entrez 1 ou 2: ");
			reprise = scan.nextInt();
		}
		while(reprise==1);
		
		if(reprise==2) {
			System.out.println("Au revoir !");
		}
		
	}
}
