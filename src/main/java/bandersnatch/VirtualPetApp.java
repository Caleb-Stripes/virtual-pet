package bandersnatch;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Bandersnatch!");
		System.out.println("  /\\___/\\ ");
		System.out.println("  |(O  O) ");
		System.out.println("  |   o | ");
		System.out.println("==( VVVV)==");
		System.out.println("  | ^^^^| ");
		System.out.println(" <HHHHHHH>");
		
		VirtualPet bandersnatch = new VirtualPet(0, 0, 1);
		do {
			
			bandersnatch.getHunger(0);
			
		} while (bandersnatch.status == "Alive");
		
		
		
		System.out.println("Bandersnatch has died.");
		System.out.println("  /\\___/\\ ");
		System.out.println("  |(X  X) ");
		System.out.println("  |   o | ");
		System.out.println("==( VVVV)==");
		System.out.println("  | ^^^^| ");
		System.out.println(" <HHHHHHH>");
		input.close();
	}

}
