package bandersnatch;

public class VirtualPet {

	public static int hunger;
	public static int fatigue;
	private static int level;
	public static String status;
	static String name;

	public int getHunger() {
		return hunger;
	}

	public int getLevel() {
		return level;
	}

	public int getFatigue() {
		return fatigue;
	}

	public String getStatus() {
		return status;
	}

	public static String getName() {
		return name;
	}

	private String play;

	public String getPlay() {
		int playNumber = (int) (Math.random() * 10 + 1);
		if (playNumber < 3) {
			play = " chases your foot under a blanket.";
		}
		if (playNumber > 2 && playNumber < 5) {
			play = " gets tangled in a ball of burgundy yarn.";
		}
		if (playNumber >= 5 && playNumber < 8) {
			play = " stalks and bites its own tail.";
		}
		if (playNumber == 8 || playNumber == 9) {
			play = " brings you a small live bird.";
		}
		if (playNumber > 9) {
			play = " brings you a vorpal sword.";
		}
		//add fatigue multiplier
		System.out.println(name + play + "\n");
		return play;
	}
	
	public static int getTrain() {
		if (fatigue < 10) {
			level++;
			fatigue = fatigue + 7;
			System.out.println(name + " trains hard.\n");
		}
		else {
			System.out.println(name + " is too tired to train.\n");
		}
		return level;
		
	}

	static void preyChoices() {
		System.out.println("What would you like " + name + " to hunt?");
		System.out.println("1. Troglodyte");
		System.out.println("2. Goblin");
		System.out.println("3. R.O.U.S.");
		System.out.println("4. Troll");
		System.out.println("5. Dragon");
	}
	
	public static int prey;
	
	public static String choosePrey;
	
	public static int preyFix() {
		if (choosePrey.contentEquals("1")) {
			prey = 1;
		} else if (choosePrey.contentEquals("2")) {
			prey = 2;
		} else if (choosePrey.contentEquals("3")) {
			prey = 3;
		} else if (choosePrey.contentEquals("4")) {
			prey = 4;
		} else if (choosePrey.contentEquals("5")) {
			prey = 5;
		} else {
			prey = 0;
		}
		return prey;
		}
	
	
private static String hunt;
	
	public static String getHunt() {
		int huntCheckRoll = (int) ((Math.random() * 10) + (Math.random() * 10));
		int huntCheck = huntCheckRoll + level;
		String[] preyName = { "Troglodyte", "Goblin", "R.O.U.S.", "Troll", "Dragon" };
		int[] targetPrey = new int[5];
		targetPrey[0] = 5;
		targetPrey[1] = 10;
		targetPrey[2] = 15;
		targetPrey[3] = 25;
		targetPrey[4] = 35;

		if (huntCheck >= targetPrey[prey - 1]) {
			hunt = "Success! " + name + " caught and ate a " + preyName[prey - 1] + ".";
			hunger = hunger - (2 * (targetPrey[prey -1] / 5));
		} else {
			hunt = "" + name + " could not catch a " + preyName[prey - 1] + ".";
		}
		System.out.println(hunt);
		return hunt;
	}

	public String getSynopsis() {
		String hungerCheck = null;
		if (hunger < 6) {
			hungerCheck = name + " is not hungry, ";
		} else if (hunger < 11) {
			hungerCheck = name + " is peckish, ";
		} else if (hunger < 18) {
			hungerCheck = name + " is burbling, ";
		} else {
			hungerCheck = name + " is near starvation, ";
		}
		
		String fatigueCheck = null;
		if (fatigue < 10) {
			fatigueCheck = "alert, ";
		} else if (fatigue < 15) {
			fatigueCheck = "lathargic, ";
		} else if (fatigue < 20) {
			fatigueCheck = "sleepy, ";
		} else {
			fatigueCheck = "";
		}
		
		String levelCheck = null;
		if (level < 3) {
			levelCheck = "untrained, ";
		} else if (level < 7) {
			levelCheck = "unthreatening, ";
		} else if (level < 12) {
			levelCheck = "fierce, ";
		} else if (level < 16) {
			levelCheck = "formidable, ";
		} else {
			levelCheck = "FRUMIOUS, ";
		}
		String synopsis = hungerCheck + fatigueCheck + levelCheck + "and " + status + "\n";
		return synopsis;
	}

	static void mainMenu() {
		System.out.println("What would you like to do with " + name + "?");
		System.out.println("1. Play");
		System.out.println("2. Train");
		System.out.println("3. Hunt");
		System.out.println("4. Synopsis");
		System.out.println("5. Quit Program");
	}
	public static int action;
	
	public static String chooseMenu;
	
	
	public static int menuFix() {
		if (chooseMenu.contentEquals("1")) {
			action = 1;
		} else if (chooseMenu.contentEquals("2")) {
			action = 2;
		} else if (chooseMenu.contentEquals("3")) {
			action = 3;
		} else if (chooseMenu.contentEquals("4")) {
			action = 4;
		} else if (chooseMenu.contentEquals("5")) {
			action = 5;
		} else {
			action = 0;
		}
		return action;
	}

	public VirtualPet(int hunger, int fatigue, int level, String status) {
		VirtualPet.hunger = hunger;
		VirtualPet.fatigue = fatigue;
		VirtualPet.level = level;
		VirtualPet.status = status;
	}

	static void getStart() {
		System.out.println("Welcome to Bandersnatch.");
		System.out.println("This is your new Bandersnatch.");
		System.out.println("  /\\___/\\ ");
		System.out.println("  |(O  O) ");
		System.out.println("  |   o | ");
		System.out.println("==( VVVV)==");
		System.out.println("  | ^^^^| ");
		System.out.println(" <HHHHHHH>");
		System.out.println("Please name your new Bandersnatch.");
	}

	static void getEnd() {
		System.out.println("  /\\___/\\ ");
		System.out.println("  |(X  X) ");
		System.out.println("  |   o | ");
		System.out.println("==( __T_)==");
		System.out.println("  |   U | ");
		System.out.println(" <HHHHHHH>");
	}

	public static String getSleep() {
		if (fatigue >= 20) {
			status = "Asleep";
		} else {
			fatigue = fatigue + 3;
			status = "Awake";
		}
		return status;
	}
	
	public static String getWake() {
		if (fatigue > 0) {
			fatigue = fatigue - 7;
			status = "Asleep";
			System.out.println(name + " is napping.");
		} else {
			fatigue = 0;
			status = "Awake";
			System.out.println(name + " wakes up.");
		} return status;
	}
	
	
	static String statusTracker() {
	System.out.println("Hunger=" + hunger + " Level=" + level + " Fatigue=" + fatigue + " Status=" + status);
	return null;
	}
	
	public static int hungerFix() {
		if (hunger < 0) {
			hunger = 0;
		}
		else {
			
		}
		return hunger;
	}
	}
