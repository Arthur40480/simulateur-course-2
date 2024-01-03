import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Launch {

	public static void startGame(Scanner scanner, ArrayList<HashMap<String, Integer>> horseList, int[] speed, int[][] throwOfDice ) {
		Random random = new Random();
		int turnNumber = 1;
		
		System.out.println("-------- DEBUT DE LA COURSE --------");
		
		horseList.stream().forEach(horse -> {
			int throwDice = (random.nextInt(6)) + 1;
			System.out.println("Le jet de dès est : " + throwDice);
			System.out.println("Sa vitesse actuelle est : " + horse.get("Vitesse"));
			System.out.println("Sa nouvelle vitesse est donc : " + (horse.get("Vitesse") + throwOfDice[horse.get("Vitesse")][throwDice - 1]));
			System.out.println("Sa nouvelle distance parcourue est : " + (horse.get("Distance") + speed[horse.get("Vitesse") + throwOfDice[horse.get("Vitesse")][throwDice - 1]]) + "m");

		});
	}
}
