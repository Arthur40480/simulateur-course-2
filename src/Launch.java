import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Launch {

	public static void startRace(Scanner scanner, ArrayList<HashMap<String, Integer>> horseList, int[] speed, int[][] throwOfDice ) {
		Random random = new Random();
		int turnNumber = 1;
		
		System.out.println("-------------------------------- DEBUT DE LA COURSE --------------------------------");
		System.out.println();
		while(horseList.stream().anyMatch(horse ->(horse.get("Distance") < 2400 && horse.get("DQ") == 0))) {
						
			System.out.println("                            TOUR " + turnNumber);
			System.out.println("------------------------------------------------------------------------------------");
			horseList.stream().forEach(horse -> {
				if(horse.get("DQ") == 1) {
					System.out.println("Le cheval numéro " + horse.get("Numero") + " est disqualifier !");
					
				} else if(horse.get("Distance") >= 2400) {
					System.out.println("Le cheval numéro " + horse.get("Numero") + " est arriver !");
					
				} else {
					// On assigne a notre variable throwDice le lancer de dès entre 1 et 6 grace à la classe Random :
					int throwDice = (random.nextInt(6)) + 1;
					if(horse.get("Vitesse") == 6 && throwDice == 6) {
						horse.put("DQ", 1);
						System.out.println("Passage au galop du cheval numéro " + horse.get("Numero") + ", il est donc disqualifier !");
						
					} else {
						// On assigne la nouvelle vitesse qui est égale à : TableauDeJetDeDés[Vitesse actuelle][Jet de dès - 1] :
						horse.put("Vitesse", horse.get("Vitesse") + (throwOfDice[horse.get("Vitesse")][throwDice - 1]));
						
						// On assigne la nouvelle distance parcourue qui est égale à : distance parcourue + TableauDeVitesse[Vitesse Actuelle] :
						horse.put("Distance", (horse.get("Distance") + speed[horse.get("Vitesse")]));
						
						// On assigne le nouveau temps du cheval qui est égale à : Temps actuelle + 10 secondes :
						horse.put("Chrono", (horse.get("Chrono") + 10 ));
						
						System.out.println("Le cheval numéro " + horse.get("Numero") + 
								" à parcouru " + horse.get("Distance") + " mètres en " + 
								horse.get("Chrono") + " secondes à une vitesse actuelle de " +
								horse.get("Vitesse"));
					}
				}
			});
			turnNumber++;
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------");
		}
	}
}
