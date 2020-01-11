package bandersnatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet underTest = new VirtualPet(1, 1, 1, "Awake");

	@Test
	public void hungerShouldSay1() {
		int result = underTest.getHunger();
		assertEquals(1, result);
	}

	@Test
	public void fatigueShouldSay1() {
		int result = underTest.getFatigue();
		assertEquals(1, result);
	}

	@Test
	void levelShouldSay1() {
		int result = underTest.getLevel();
		assertEquals(1, result);
	}

	@Test
	void statusShoulSayAwake() {
		String result = underTest.getStatus();
		assertEquals("Awake", result);
	}

	@Test
	void initalSynopsis() {
		String result = underTest.getSynopsis();
		assertEquals("Not hungry, alert, untrained, and Awake" + "\n", result);

	}

	@Test
	void statusShouldSayAwake5() {
		String result = VirtualPet.getSleep();
		assertEquals("Awake", result);
	}
	
	@Test
	void tickShouldIncreaseTo2() {
		int result = VirtualPet.getTick();
		assertEquals(2, result);
	}

}
