package conversion_temp�rature;

import java.util.Scanner;

public class Conversion_temp�rature {

	public static void main(String[] args){
		System.out.println("Ceci est un programme de conversion:");
		int reprise = 1;
		do {
			System.out.println("Quel type de conversion souhaitez-vous �ffectuer ?");
			System.out.println("1- Degr� vers Fahrenheit");
			System.out.println("2- Fahrenheit vers Degr�");
			System.out.print("Entrez 1 ou 2: ");
			Scanner scan = new Scanner(System.in);
			int choix = scan.nextInt();
			
			switch(choix) {
			case 1:
				System.out.println("Vous avez choisit une conversion de Degr� vers Fahrenheit.");
			break;
				
			case 2:
				System.out.println("Vous avez choisit une conversion de Fahrenheit vers Degr�.");
			break;
			
			default:
				do {
					System.out.println("Quel type de conversion souhaitez-vous �ffectuer ?");
					System.out.println("1- Degr� vers Fahrenheit");
					System.out.print("2- Fahrenheit vers Degr�");
					System.out.print("Entrez 1 ou 2: ");
					choix = scan.nextInt();
				}
				while(choix<1 && choix>2);
			break;
			}
			
			if(choix==1) {
				System.out.print("Veuillez entrer la temp�rature en degr�: ");
				scan.nextLine();
				float temp = scan.nextFloat();
				float resultat = (float)((temp/0.55556)+32);
				System.out.println("La temp�rature que vous avez entr� correspond � "+resultat+"Fahrenheits");
				System.out.println("");
			}
			else {
				System.out.print("Veuillez entrer la temp�rature en Fahrenheit: ");
				scan.nextLine();
				float temp1 = scan.nextFloat();
				float resultat1 = (float)(0.55556*(temp1-32));
				System.out.println("La temp�rature que vous avez entr� correspond � "+resultat1+"Degr�s");
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
