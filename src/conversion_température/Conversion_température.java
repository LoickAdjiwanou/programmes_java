package conversion_température;

import java.util.Scanner;

public class Conversion_température {

	public static void main(String[] args){
		System.out.println("Ceci est un programme de conversion:");
		int reprise = 1;
		do {
			System.out.println("Quel type de conversion souhaitez-vous éffectuer ?");
			System.out.println("1- Degré vers Fahrenheit");
			System.out.println("2- Fahrenheit vers Degré");
			System.out.print("Entrez 1 ou 2: ");
			Scanner scan = new Scanner(System.in);
			int choix = scan.nextInt();
			
			switch(choix) {
			case 1:
				System.out.println("Vous avez choisit une conversion de Degré vers Fahrenheit.");
			break;
				
			case 2:
				System.out.println("Vous avez choisit une conversion de Fahrenheit vers Degré.");
			break;
			
			default:
				do {
					System.out.println("Quel type de conversion souhaitez-vous éffectuer ?");
					System.out.println("1- Degré vers Fahrenheit");
					System.out.print("2- Fahrenheit vers Degré");
					System.out.print("Entrez 1 ou 2: ");
					choix = scan.nextInt();
				}
				while(choix<1 && choix>2);
			break;
			}
			
			if(choix==1) {
				System.out.print("Veuillez entrer la température en degré: ");
				scan.nextLine();
				float temp = scan.nextFloat();
				float resultat = (float)((temp/0.55556)+32);
				System.out.println("La température que vous avez entré correspond à "+resultat+"Fahrenheits");
				System.out.println("");
			}
			else {
				System.out.print("Veuillez entrer la température en Fahrenheit: ");
				scan.nextLine();
				float temp1 = scan.nextFloat();
				float resultat1 = (float)(0.55556*(temp1-32));
				System.out.println("La température que vous avez entré correspond à "+resultat1+"Degrés");
				System.out.println("");
			}
			
			System.out.println("Voulez vous faire une autre conversion ?");
			System.out.println("1- Oui");
			System.out.println("2- Non");
			System.out.print("Entrez 1 ou 2: ");
			scan.nextLine();
			reprise = scan.nextInt();
		}
		while(reprise == 1);
		System.out.println("");
		if(reprise==2) {
			System.out.print("Au revoir !");
		}

	}
}
