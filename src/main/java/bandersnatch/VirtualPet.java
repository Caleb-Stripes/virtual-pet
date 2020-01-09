package bandersnatch;

public class VirtualPet {

	public static void main(String[] args) {

	}

	public String status = "Alive";
	private String activity = "Chilling";
	private String fatigueStatus = "Awake";
	private int hunger;
	private int fatigue;
	private int trained;

	public String getHunger(int hunger) {
		hunger++;
		if (hunger < 5) {
			return "Not Hungry";
		}
		if (hunger < 10) {
			return "Peckish";
		}
		if (hunger < 20) {
			return "Frumious";
		}
		if (hunger >= 20) {
			status = "Dead";
			return "Dead";
		}
		return null;

	}

	public String getFatigue(int fatigue) {

		if (fatigueStatus == "Awake") {
			fatigue++;
			if (fatigue <= 10) {
				return "Alert";
			}
			if (fatigue <= 15) {
				return "Lathargic";
			}
			if (fatigue <= 20) {
				return "Exausted";
			} else {
				fatigueStatus = "Asleep";
				return "Asleep";
			}

		}

		if (fatigueStatus == "Asleep") {
			if (fatigue > 0) {
				fatigue = fatigue - 4;
				return "Asleep";
			}
			if (fatigue <= 0) {
				fatigue = 0;
				fatigueStatus = "Awake";
			}
		}
		return null;

	}

	String userInput = "Train";

	public int getTrained(int trained) {
		if (userInput == "Train" && fatigue < 10) {
			activity = "Training";
			if (activity == "Training" && trained < 20) {
				trained++;
				fatigue = 5 + fatigue;
				return trained;
			}
		} else {
			System.out.println("Bandersnatch is too tired to train.");
		}
		return trained;
	}
	

	public VirtualPet(int hunger, int fatigue, int trained) {
		this.hunger = hunger;
		this.fatigue = fatigue;
		this.trained = trained;
	}
}
