import java.util.Scanner;

public class VirtualPet2App {

	public static void main(String[] args) {

		VirtualPet2 newPet = new VirtualPet2(0, 0, 0, null, "Alive");

		VirtualPet2.startMenu();
		Scanner input = new Scanner(System.in);
		String userChoice = input.next();
		if (userChoice.contains("shelter")) {
			newPet.shelterPet();
		}
		
		newPet.namePet();
		newPet.currentStats();

//		Scanner input = new Scanner(System.in);
		
		for (newPet.getStatus(); newPet.status.contentEquals("Alive"); newPet.tick()) {

			VirtualPet2.mainMenu();
			String action = input.next();// this reeks bad, so bad it broke my console.

			if (action == "1") {
				newPet.eat();
			}
			if (action == "2") {
				newPet.drink();
			}
			if (action == "3") {
				newPet.play();
			}
			if (action == "4") {
				newPet.fetch();
			}
			newPet.getStatus();
			newPet.currentStats();
		}

		System.out.println("Your pet has died.");
		System.exit(0);
		input.close();
	}

}
