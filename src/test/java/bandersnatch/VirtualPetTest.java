package bandersnatch;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest {

	VirtualPet hungerTest = new VirtualPet(0, 0, 0);

	@Test
	public void shouldSayNotHungry() {
		String hungerLevel = hungerTest.getHunger(1);
		assertEquals("Not Hungry", hungerLevel);
	}

	@Test
	public void shouldSayPeckish() {
		String hungerLevel = hungerTest.getHunger(5);
		assertEquals("Peckish", hungerLevel);
	}

	@Test
	public void shouldSayFrumious() {
		String hungerLevel = hungerTest.getHunger(10);
		assertEquals("Frumious", hungerLevel);
	}

	@Test
	public void shouldSayDead() {
		String hungerLevel = hungerTest.getHunger(20);
		assertEquals("Dead", hungerLevel);
	}

	VirtualPet fatigueTest = new VirtualPet(0, 0, 0);

	@Test
	public void shouldSayAlert1() {
		String fatigueLevel = fatigueTest.getFatigue(2);
		assertEquals("Alert", fatigueLevel);
	}

	@Test
	public void shouldSayAlert9() {
		String fatigueLevel = fatigueTest.getFatigue(9);
		assertEquals("Alert", fatigueLevel);
	}

	@Test
	public void shouldSayLathargic() {
		String fatigueLevel = fatigueTest.getFatigue(10);
		assertEquals("Lathargic", fatigueLevel);
	}

	@Test
	public void shouldSayExausted() {
		String fatigueLevel = fatigueTest.getFatigue(15);
		assertEquals("Exausted", fatigueLevel);
	}

	@Test
	public void shouldSayExausted19() {
		String fatigueLevel = fatigueTest.getFatigue(19);
		assertEquals("Exausted", fatigueLevel);
	}

	@Test
	public void shouldSayAsleep() {
		String fatigueLevel = fatigueTest.getFatigue(20);
		assertEquals("Asleep", fatigueLevel);
	}
	// @Test
	// write tests for sleep
	// VirtualPet sleepTest = new VirtualPet();
	
	VirtualPet trainedTest = new VirtualPet(0, 0, 0);
	
	@Test
	public void shouldSay1() {
		int trainedLevel = trainedTest.getTrained(1);
		assertEquals(2, trainedLevel);
	}
	
	@Test
	public void shouldSay2() {
		int trainedLevel = trainedTest.getTrained(2);
		assertEquals(3, trainedLevel);		
	}
	
	@Test
	public void shuldSay20() {
		int trainedLevel = trainedTest.getTrained(20);
		assertEquals(20, trainedLevel);
	}
}
