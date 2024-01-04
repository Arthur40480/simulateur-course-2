import java.util.ArrayList;
import java.util.HashMap;

public class Display {
	public static void rankingDisplay(int userChoiceTypeOfRace, ArrayList<HashMap<String, Integer>> ranking) {
		
		switch (userChoiceTypeOfRace) {
		case 1:
			System.out.println("Le résultat de ce Tiercé 2400m : ");
			System.out.println();
			for(int i = 0; i < 3; i++) {
				HashMap<String, Integer> horseArrive = ranking.get(i);
				System.out.println("Le cheval numéro " + horseArrive.get("Numero") + " est à la " + (i + 1) + " place !");
			}
			break;
		case 2:
			System.out.println("Le résultat de ce Quarté 2400m : ");
			System.out.println();
			for(int i = 0; i < 4; i++) {
				HashMap<String, Integer> horseArrive = ranking.get(i);
				System.out.println("Le cheval numéro " + horseArrive.get("Numero") + " est à la " + (i + 1) + " place !");
			}
			break;
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
