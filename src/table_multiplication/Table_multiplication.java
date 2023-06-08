package table_multiplication;

import java.util.Scanner;

public class Table_multiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("<---Programme de calcul--->");
		int reprise =1;
		do {
			System.out.println("1- Table de multiplication");
			System.out.println("2- Table de division");
			System.out.println("3- Table de soustraction");
			System.out.println("4- Table d'addition");
			System.out.print("Entrez 1, 2, 3 ou 4: ");
			int choix = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			
			switch (choix) {
				case 1:
					System.out.println("Vous avez choisit la table de multiplication");
					System.out.print("Entrez un nombre entier: ");
					int val = scan.nextInt();
					scan.nextLine();
					System.out.println("");
					for(int i=0; i<11; i++)
						System.out.println(val+" x "+i+" = "+(val*i));
					System.out.println("");
				break;
				
				case 2:
					System.out.println("Vous avez choisit la table de division");
					System.out.print("Entrez un nombre entier: ");
					int val1 = scan.nextInt();
					scan.nextLine();
					System.out.println("");
					for(int i=1; i<11; i++)
						System.out.println(val1+" / "+i+" = "+((float)val1/(float)i));
					System.out.println("");
				break;
				
				case 3:
					System.out.println("Vous avez choisit la table de soustraction");
					System.out.print("Entrez un nombre entier: ");
					int val2 = scan.nextInt();
					scan.nextLine();
					System.out.println("");
					for(int i=0; i<11; i++)
						System.out.println(val2+" - "+i+" = "+(val2-i));
					System.out.println("");
				break;
				
				case 4:
					System.out.println("Vous avez choisit la table d'addition");
					System.out.print("Entrez un nombre entier: ");
					int val3 = scan.nextInt();
					scan.nextLine();
					System.out.println("");
					for(int i=0; i<11; i++)
						System.out.println(val3+" + "+i+" = "+(val3+i));
					System.out.println("");
				break;
				
				default:
					System.out.println("Aucune correspondance !");
				break;
			}
			System.out.println("Voulez-vous recommencer ?");
			System.out.println("1- Oui");
			System.out.println("2- Non");
			System.out.print("Entrez 1 ou 2: ");
			reprise = scan.nextInt();
		}
		while(reprise==1);
		
		if(reprise==2)
			System.out.println("Au revoir !");
		
	}

}
