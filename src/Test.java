/*Exercice 2 : programme sur les conditions (�diteur simple + ligne de commande)
2.1 �crivez une classe "Test.java", ajouter une m�thode main qui lit un nombre entier et indique 
s'il est positif, n�gatif ou s'il vaut z�ro (n�oubliez pas de g�rer l�interaction)
2.2 Ajouter la possibilit� de savoir si le nombre est pair ou impair.
2.3 Que se passe-t-il si on saisit une valeur inattendue et comment r�gler ce probl�me ?*/

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int entier;
		
		//Lire un nombre entier et indiquer s'il est positif ou n�gatif
		
		System.out.println("Entrez un nombre entier : ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		if (scanner.hasNextInt()) {
			entier = scanner.nextInt();
		
			if(entier > 0) {
				System.out.println("Le nombre est positif");
			} else if (entier < 0) {
				System.out.println("Le nombre est n�gatif");
			} else if (entier == 0) {
				System.out.println("Le nombre n'est n�gatif ni positif");
			} else {
				System.out.println("Vous n'avez pas entr� un entier. R�essayez");
			}

			
			//Indiquer s'il est pair ou impair


			if(entier%2 == 0) {
				System.out.println("Le nombre entier est pair");
			} else {
				System.out.println("Le nombre est impair");
			}
		
		
		// 
		} else {
			System.out.println("Erreur : Veuillez entrer un nombre entier valide.");
		} //Fin de if (scanner.hastNextInt();
			
			
		
		


}

}
