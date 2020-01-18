import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class virtualPet2Test {

	VirtualPet2 underTest = new VirtualPet2(0, 0, 0, null, null);
//Moved the underTest object of the VirtualPet2 class out of the test methods.
//This action makes it globally accessible by all the methods in the test class.
	@Test
	public void hungerShouldBeZeroAtStart() {
		int  result = underTest.getHunger();
		assertEquals(0, result);
	}

	@Test
	public void thirstShouldBeZeroAtStart() {
//		VirtualPet2 underTest = new VirtualPet2();
		int result = underTest.getThirst();
		assertEquals(0, result);
	}
	
	@Test
	public void boredomShouldBeZeroAtStart() {
//		VirtualPet2 underTest = new VirtualPet2();
		int result = underTest.getBoredom();
		assertEquals(0, result);
	}
	
	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		int beforeEat = underTest.getHunger();
		underTest.eat();
		int result = underTest.getHunger();
		assertEquals(beforeEat-1, result);
	}
	
	@Test
	public void thirstShouldDecreaseBy1AfterDrink() {
		int beforeDrink = underTest.getThirst();
		underTest.drink();
		int result = underTest.getThirst();
		assertEquals(beforeDrink-1, result);
	}
	
	@Test
	public void boredomShouldDecreaseBy1AfterPlay() {
		int beforePlay = underTest.getBoredom();
		underTest.play();
		int result = underTest.getBoredom();
		assertEquals(beforePlay-1, result);
		
	}

	@Test
	public void tickShouldIncreaseAllBy1() {
		int boredomBeforeTick = underTest.getBoredom();
		int hungerBeforeTick = underTest.getHunger();
		int thirstBeforeTick = underTest.getThirst();
		underTest.tick();
		int boredomResult = underTest.getBoredom();
		int hungerResult = underTest.getHunger();
		int thirstResult = underTest.getThirst();
		assertEquals(boredomBeforeTick + 1, boredomResult);
		assertEquals(hungerBeforeTick + 1, hungerResult);
		assertEquals(thirstBeforeTick + 1, thirstResult);
	}
	
	@Test
	public void petStatusShouldBeDead() {
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		String result = underTest.getStatus();
		assertEquals("Dead", result);
	}
	
	@Test
	public void shelterPetHungerShouldAllBe5() {
		underTest.shelterPet();
		int result = underTest.getHunger();
		assertEquals(5, result);
	}
	
	@Test
	public void shelterPetThirstShouldAllBe5() {
		underTest.shelterPet();
		int result = underTest.getThirst();
		assertEquals(5, result);
	}
	
	@Test
	public void shelterPetBoredomShouldAllBe5() {
		underTest.shelterPet();
		int result = underTest.getBoredom();
		assertEquals(5, result);
	}
	
	
	
	
}