package bandersnatch;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) throws InterruptedException {
		VirtualPet fred = new VirtualPet(1, 1, 1, "Awake");
		VirtualPet.getStart();
		Scanner banderMaster = new Scanner(System.in);
		VirtualPet.name = banderMaster.nextLine();
		VirtualPet.name = VirtualPet.name.toUpperCase();
		System.out.println(VirtualPet.name + " looks happy.");

		for (VirtualPet.hunger = 1; VirtualPet.hunger < 20; VirtualPet.hunger++) {

			do {
				VirtualPet.getSleep();
				VirtualPet.getTick();
				VirtualPet.hungerFix();
				VirtualPet.mainMenu();
				VirtualPet.chooseMenu = banderMaster.next();
				VirtualPet.menuFix();
//				VirtualPet.statusTracker(); //for testing
				System.out.println("");
				if (VirtualPet.action == 1) {
					fred.getPlay();
				}

				if (VirtualPet.action == 2) {
					VirtualPet.getTrain();
				}

				if (VirtualPet.action == 3) {
					VirtualPet.preyChoices();
					VirtualPet.choosePrey = banderMaster.next();
					VirtualPet.preyFix();
					if (VirtualPet.prey == 0) {
						System.out.println("Please imput a number coorisponding to the choices given.");
						continue;
					}
					VirtualPet.getHunt();
				}

				if (VirtualPet.action == 4) {
					System.out.println(fred.getSynopsis());
				}

				if (VirtualPet.action == 5) {
					System.exit(0);
				}

				if (VirtualPet.action == 0) {
					System.out.println("Invalid choice please use coorilating numbers 1-5.\n");
					continue;
				}

			} while (VirtualPet.status.contentEquals("Awake"));

			do {
				VirtualPet.getWake();

			} while (VirtualPet.status.contentEquals("Asleep"));

			System.out.println("");
		}
		System.out.println("Sadly " + VirtualPet.name + " has died.");
		VirtualPet.getEnd();
		banderMaster.close();
	}

}
