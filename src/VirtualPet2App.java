import java.util.Scanner;

public class VirtualPet2App {

	public static void main(String[] args) {

		VirtualPet2 newPet = new VirtualPet2(0, 0, 0, null, "Alive");

		System.out.println("Welcome to virtual pet.");
		System.out.println("Would you like a baby pet, or to adopt from the shelter?");
		System.out.println("Type \"baby\" or \'\"shelter\".");

		Scanner input = new Scanner(System.in);
		String userChoice = input.nextLine();
		if (userChoice.contains("shelter")) {
			newPet.shelterPet();
		}

		System.out.println("Give your buddy a special Name.");
		String userName = input.nextLine();
		newPet.petName = userName;
		System.out.println("Greetings " + newPet.petName);

		

		for (newPet.getStatus(); newPet.status.contentEquals("Alive"); newPet.tick()) {
			
			System.out.println("");
			newPet.currentHungerStats();
			System.out.println(VirtualPet2.hungerWarning);
			newPet.currentThirstStats();
			System.out.println(VirtualPet2.thirstWarning);
			newPet.currentBoredomStats();
			System.out.println(VirtualPet2.boredomWarning);
			System.out.println("");
			
			if (newPet.getBoredom() > 15) {
				System.out.println(newPet.petName + " has run away.");
				System.exit(0);
			}
			
			System.out.println("");
			System.out.println("What would you like to do with your pet?");
			System.out.println("Choose corresponding number below.");
			System.out.println(" 1. Feed");
			System.out.println(" 2. Water");
			System.out.println(" 3. Play");
			System.out.println(" 4. Fetch");
			System.out.println("");

			String action = input.next();

			if (action.contentEquals("1")) {
				newPet.eat();
			}
			if (action.contentEquals("2")) {
				newPet.drink();
			}
			if (action.contentEquals("3")) {
				newPet.play();
			}
			if (action.contentEquals("4")) {
				newPet.fetch();
				System.out.println(newPet.fetchThing);
			}
			newPet.getStatus();
			
		}

		System.out.println("Your pet has died.");
		System.exit(0);
		input.close();
	}

}
