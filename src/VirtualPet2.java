
public class VirtualPet2 {
	private int hunger = 0;
	private int thirst = 0;
	private int boredom = 0;
	String status = "Alive";
	String petName;

	public VirtualPet2(int hunger, int thirst, int boredom, String petName, String status) {

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
		this.hunger = this.hunger - 2;
		if (this.hunger < 0) {
			this.hunger = 0;
		}
		return this.hunger--;
		// this.hunger--;
		// return this.hunger;
	}

	public int drink() {
		this.thirst = this.thirst - 5;
		if (this.thirst < 0) {
			this.thirst = 0;
		}
		return this.thirst;

	}

	public int play() {
		this.boredom = this.boredom - 2;
		if (this.boredom < 0) {
			this.boredom = 0;
		}
		return this.boredom;
	}

	String fetchThing = null;

	public String fetch() {
		int fetchRand = (int) (Math.random() * 10 + 1);
		if (fetchRand <= 3) {
			fetchThing = petName + " brings you a red ball.";
		}
		if (fetchRand == 4) {
			fetchThing = petName + " drags over a large branch.";
		}
		if (fetchRand == 5) {
			fetchThing = petName
					+ " crouches in front of you and regurgitates some bright yellow bile with rubber bits in it.";
		}
		if (fetchRand == 6) {
			fetchThing = petName
					+ " stares at you in confusion, while the stick you threw sinks into a mud puddle, \nas if to say \"That was foolish, now you have to get muddy\".";
		}
		if (fetchRand == 7 || fetchRand == 8) {
			fetchThing = petName + " fetches the thing you threw, but now it is coverd in slobber.";
		}
		if (fetchRand == 9) {
			fetchThing = petName
					+ " is gone for a very long time, so long you begin to worry. \nAfter searching for 20 minutes you find \n"
					+ petName + " sleeping in its bed.";
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
		if (this.hunger >= 10 || this.thirst >= 10) {
			this.status = "Dead";
		}
		return this.status;
	}

	public static String hungerWarning;
	public static String thirstWarning;
	public static String boredomWarning;

	public void currentHungerStats() {
		if (this.hunger > 7) {
			hungerWarning = petName + " is starving.";
		} else {
			hungerWarning = petName + " seems saciated.";
		}
	}

	public void currentThirstStats() {
		if (this.thirst > 7) {
			thirstWarning = petName + " is dying of thirst.";
		} else {
			thirstWarning = petName + " seems hydrated.";
		}
	}
		
	public void currentBoredomStats() {
		if (this.boredom > 11) {
			boredomWarning = petName + " looks quite board.";
		} else {
			boredomWarning = petName + " looks content.";
		}
	}

	public void testPet() {
		this.hunger = 1;
		this.thirst = 1;
		this.boredom = 1;
		
	}	

}
