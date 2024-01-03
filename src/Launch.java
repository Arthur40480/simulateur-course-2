import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Launch {

	public static void startRace(Scanner scanner, ArrayList<HashMap<String, Integer>> horseList, int[] speed, int[][] throwOfDice ) {
		Random random = new Random();
		int turnNumber = 1;
		
		System.out.println("-------- DEBUT DE LA COURSE --------");
		
		horseList.stream().forEach(horse -> {
			// On assigne a notre variable throwDice le lancer de dès entre 1 et 6 grace à la classe Random :
			int throwDice = (random.nextInt(6)) + 1;
			
			// On assigne la nouvelle vitesse qui est égale à : TableauDeJetDeDès[Vitesse actuelle][Jet de dès - 1] :
			horse.put("Vitesse", horse.get("Vitesse") + (throwOfDice[horse.get("Vitesse")][throwDice - 1]));
			
			// On assigne la nouvelle distance parcourue qui est égale à : distance parcourue + TableauDeVitesse[Vitesse Actuelle] :
			horse.put("Distance", (horse.get("Distance") + speed[horse.get("Vitesse")]));
			
			// On assigne le nouveau temps du cheval qui est égale à : Temps actuelle + 10 secondes :
			horse.put("Chrono", (horse.get("Chrono") + 10 ));
			
			System.out.println("Le cheval numéro " + horse.get("Numero") + 
					" à parcouru " + horse.get("Distance") + " mètres en " + 
					horse.get("Chrono") + " secondes à une vitesse actuelle de " +
					horse.get("Vitesse"));
		});
	}
}
