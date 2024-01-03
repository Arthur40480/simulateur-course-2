import java.util.Scanner;

public class Verification {
		// Méthode pour vérifier la saisie utilisateur du choix de la course :
		public static int verificationUserChoice(Scanner scanner) {
			int userChoice;
			
			// On boucle tant que l'utilisateur n'a pas rempli une bonne saisie :
			while(true) {
				if(scanner.hasNextInt()) {
					userChoice = scanner.nextInt();
						
					if(userChoice < 1 || userChoice > 4) {
						System.out.print("Veuillez saisir un choix correct (1 - 4) :");
					}else {
						break;
					}
				}else {
					System.out.print("Veuillez saisir un choix correct (1 - 4) :");
					scanner.next();
				}
			}		
			return userChoice;
		}
		
		// Méthode pour vérifier la saisie utilisateur pour le nombre de chevaux :
		public static int verificationNumberHorses(Scanner scanner) {
			int numberHorses;
			
			// On boucle tant que l'utilisateur n'a pas rempli une bonne saisie :
			while(true) {
				if(scanner.hasNextInt()) {
					numberHorses = scanner.nextInt();
					
					if(numberHorses < 12 || numberHorses > 20) {
						System.out.print("Veuillez saisir un nombre de chevaux correct (12 - 20) :");
					}else {
						break;
					}
				}else {
					System.out.print("Veuillez saisir un nombre de chevaux correct (12 - 20) :");
					scanner.next();
				}
			}
			return numberHorses;
		}
}
