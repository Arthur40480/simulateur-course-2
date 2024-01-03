import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Race {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Déclaration de ma HashMap speed :
		// La clé est la vitesse, et la valeur est la distance (en m) parcourue à cette vitesse :
		HashMap<Integer, Integer> speed = new HashMap<>();
		speed.put(0, 0);
		speed.put(1, 23);
		speed.put(2, 46);
		speed.put(3, 69);
		speed.put(4, 92);
		speed.put(5, 115);
		speed.put(6, 138);
		
		// Tableau à plusieurs dimensions pour représenter les jets de dé, ainsi que la vitesse actuelle :
		// 3 est l'équivalent de "Discalifier" :
		int[][] throwOfDice = {
				{0, 1, 1, 1, 2, 2},		// <- Vitesse actuelle 0
				{0, 0, 1, 1, 1, 2}, 	// <- Vitesse actuelle 1
				{0, 0, 1, 1, 1, 2}, 	// <- Vitesse actuelle 2
				{-1, 0, 0, 1, 1, 1}, 	// <- Vitesse actuelle 3
				{-1, 0, 0, 0, 1, 1}, 	// <- Vitesse actuelle 4
				{-2, -1, 0, 0, 0, 1}, 	// <- Vitesse actuelle 5
				{-2, -1, 1, 1, 2, 3}, 	// <- Vitesse actuelle 6
		};
		
		// Déclaration de mon ArrayList horseList qui contiendra une HashMap pour chaque cheval participant :
		ArrayList<HashMap<String, Integer>> horseList = new ArrayList<>();
		
		System.out.println("Bonjour, à quel type de course souhaitez-vous jouer ?");
		System.out.println();
		System.out.println("1 - Tiercé");
		System.out.println("2 - Quarté");
		System.out.println("3 - Quinté");
		System.out.println("4 - Quittez l'application");
		System.out.println();
		System.out.print("Veuillez saisir votre choix : ");
		
		int userChoice = scanner.nextInt();
		
		System.out.print("Veuillez indiquer le nombre de chevaux dans la course (12 - 20) : ");
		
		// On assigne le nombre de chevaux à la variable numberHorses :
		int numberHorses = scanner.nextInt();
		
		// On boucle sur le nombre de chevaux :
		for(int i = 0; i < numberHorses; i++) {
			// On viens créer une HashMap pour chaque cheval :
			HashMap<String, Integer> horse = new HashMap<>();
			horse.put("Numero", (i + 1)); // Sont numéro
			horse.put("Vitesse", 0); // Sa vitesse
			horse.put("Distance", 0); // Sa distance parcourue
			
			// On ajoute chaque HashMap à notre ArrayList horseList :
			horseList.add(horse);
		}
	}

}
