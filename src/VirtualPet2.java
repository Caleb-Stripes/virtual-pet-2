import java.util.Scanner;

public class VirtualPet2 {
	int hunger = 0;
	int thirst = 0;
	int boredom = 0;
	String status = "Alive";
	String petName;

	public VirtualPet2(int hunger, int thirst, int boredom, String petName, String status) {
		
	}
	
	public String namePet() {
		Scanner nameThePet = new Scanner(System.in);
		System.out.println("Please name your pet.");
		this.petName = nameThePet.nextLine();
		nameThePet.close();
		return this.petName;
	}
	
		public void shelterPet() {
			this.hunger = 5;
			this.thirst = 5;
			this.boredom = 5;
	}
		
	public String getPetName() {
		
		return this.petName;
	}

	public int getHunger() {
		
		return this.hunger;
	}

	public int getThirst() {

		return this.thirst;
	}

	public int getBoredom() {
		
		return this.boredom;
	}

	public int eat() {
		return this.hunger--;
		//this.hunger--;
		//return this.hunger;
	}

	public int drink() {
		this.thirst--;
		return this.thirst;
		
	}

	public int play() {
		this.boredom--;
		return this.boredom;
	}
	
	public String fetch() {
		int fetchRand = (int)(Math.random() * 10 + 1);
		String fetchThing = null;
		if (fetchRand <= 3) {
			fetchThing = petName + " brings you a red ball.";
		}
		if (fetchRand == 4) {
			fetchThing = petName + " drags over a large branch.";
		}
		if (fetchRand == 5) {
			fetchThing = petName + " crouches in front of you and regurgitates some bright yellow bile with rubber bits in it.";
		}
		if (fetchRand == 6) {
			fetchThing = petName + " stares at you in confusion, while the stick you threw sinks into a mud puddle, \nas if to say \"That was foolish, now you have to get muddy\".";
		}
		if (fetchRand == 7 || fetchRand == 8) {
			fetchThing = petName + " fetches the thing you threw, but now it is coverd in slobber.";
		}
		if (fetchRand == 9) {
			fetchThing = petName + " is gone for a very long time, so long you begin to worry. \nAfter searching for 20 minutes you find \n" + petName + " sleeping in its bed.";
		}
		if (fetchRand == 10) { 
			fetchThing = petName + " and you play a loving game of catch.";
		}
		return fetchThing;
	}

	public void tick() {
		this.hunger++;
		this.thirst++;
		this.boredom++;
		
		}

	public String getStatus() {
		if (this.hunger >= 10 && this.thirst >= 10) {
			this.status = "Dead";
//			System.out.println("Your pet has died.");
//			System.exit(0);
			// relocated to App after game loop
		}
		return this.status;
	}
	
	public static void mainMenu() {
		System.out.println("");
		System.out.println("What would you like to do with your pet?");
		System.out.println("Choose corresponding number below.");
		System.out.println(" 1. Feed");
		System.out.println(" 2. Water");
		System.out.println(" 3. Play");
		System.out.println(" 4. Fetch");
		System.out.println("");
	}
	
	public static void startMenu() {
		System.out.println("Welcome to virtual pet.");
		System.out.println("Would you like a baby pet, or to adopt from the shelter?");
		System.out.println("Type \"baby\" or \'\"shelter\".");
	}

	public void currentStats() {
		System.out.println("hunger is " + this.hunger);
		System.out.println("thirst is " + this.thirst);
		System.out.println("boredom is " + this.boredom);
		
	}

}
