package aire_et_périmètre_cercle;

import java.util.Scanner;

public class Aire_et_périmètre_cercle {

	public static void main(String[] args) {
		System.out.println("Ce programme calcule le périmètre et l'aire d'un cercle");
		Scanner scan = new Scanner(System.in);
		int reprise = 1;
		do {
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1- Calcul d'aire");
			System.out.println("2- Calcul du périmètre");
			System.out.print("Faites un choix: ");
			int choix = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			
			switch (choix) {
				case 1:
					System.out.println("Calcul d'aire:");
					System.out.print("Entrez le rayon du cercle: ");
					float r = scan.nextFloat();
					scan.nextLine();
					System.out.println("L'aire de ce cercle est : "+((double)(r*r)*(double)(3.14))+"m²");
					System.out.println("");
				break;
				
				case 2:
					System.out.println("Calcul de périmètre:");
					System.out.print("Entrez le rayon du cercle");
					float r0 = scan.nextFloat();
					scan.nextLine();
					System.out.println("Le périmètre de ce cecle est :"+((double)(r0)*2*(3.14))+"m²");
					System.out.println("");
				break;
				
				default:
					System.out.println("Aucune correspondance !");
					System.out.println("");
				break;
			}
			System.out.println("Voulez-vous recommencer ?");
			System.out.println("1- Oui");
			System.out.println("2- Non");
			System.out.print("Faites un choix: ");
			reprise = scan.nextInt();
			System.out.println("");
		}
		while(reprise==1);
		
		if(reprise!=1) {
			System.out.println("Au revoir");
		}

	}

}