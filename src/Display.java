import java.util.ArrayList;
import java.util.HashMap;

public class Display {
	// Méthode permettant d'afficher le classement de la course suivant le type de course :
	public static void rankingDisplay(int userChoiceTypeOfRace, ArrayList<HashMap<String, Integer>> ranking) {
		
		switch (userChoiceTypeOfRace) {
		// Dans le cas d'un Tiercé :
		case 1:
			System.out.println("Le résultat de ce Tiercé 2400m : ");
			System.out.println();
			for(int i = 0; i < 3; i++) {
				HashMap<String, Integer> horseArrive = ranking.get(i);
				System.out.println("Le cheval numéro " + horseArrive.get("Numero") + " est à la " + (i + 1) + " place !");
			}
			break;
		// Dans le cas d'un Quarté :
		case 2:
			System.out.println("Le résultat de ce Quarté 2400m : ");
			System.out.println();
			for(int i = 0; i < 4; i++) {
				HashMap<String, Integer> horseArrive = ranking.get(i);
				System.out.println("Le cheval numéro " + horseArrive.get("Numero") + " est à la " + (i + 1) + " place !");
			}
			break;
		// Dans le cas d'un Quinté :
		case 3:
			System.out.println("Le résultat de ce Quinté 2400m : ");
			System.out.println();
			for(int i = 0; i < 5; i++) {
				HashMap<String, Integer> horseArrive = ranking.get(i);
				System.out.println("Le cheval numéro " + horseArrive.get("Numero") + " est à la " + (i + 1) + " place !");
			}
			break;
		}
		
	}
}
