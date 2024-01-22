/*Exercice 2 : programme sur les conditions (éditeur simple + ligne de commande)
2.1 Écrivez une classe "Test.java", ajouter une méthode main qui lit un nombre entier et indique 
s'il est positif, négatif ou s'il vaut zéro (n’oubliez pas de gérer l’interaction)
2.2 Ajouter la possibilité de savoir si le nombre est pair ou impair.
2.3 Que se passe-t-il si on saisit une valeur inattendue et comment régler ce problème ?*/

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int entier;
		
		//Lire un nombre entier et indiquer s'il est positif ou négatif
		
		System.out.println("Entrez un nombre entier : ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		if (scanner.hasNextInt()) {
			entier = scanner.nextInt();
		
			if(entier > 0) {
				System.out.println("Le nombre est positif");
			} else if (entier < 0) {
				System.out.println("Le nombre est négatif");
			} else if (entier == 0) {
				System.out.println("Le nombre n'est négatif ni positif");
			} else {
				System.out.println("Vous n'avez pas entré un entier. Réessayez");
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
