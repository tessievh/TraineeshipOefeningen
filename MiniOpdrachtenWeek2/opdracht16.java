package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class opdracht16 {
	public static void main(String[] args) {
		String woord = "hallo";
		Scanner input = new Scanner(System.in);
		char w[] = woord.toCharArray();
		System.out.println("Welkom bij galgje");
		System.out.println("Het woord heeft " + woord.length() + " letters");
		System.out.println("Raad het woord!");

		int counterBeurt = 1;
		int counterGoed = 0;

		String status = "";

		for (int i = 0; i < woord.length(); i++) {
			status += "*";
		}

		while (counterBeurt < 15) {
			String userInput = input.next();
			if (counterGoed != woord.length()) {
				if (woord.contains(userInput)) {
					System.out.println("Goed!");
					for (int i = 0; i < woord.length(); i++) {
						if (woord.substring(i, i + 1).equals(userInput)) {
							status = status.substring(0, i) + userInput + status.substring(i + 1);
							counterGoed++;
							if (counterGoed == woord.length()) {
								System.out.println("Je hebt gewonnen");
								break;
							}
						}
					}
				} else {
					System.out.println("Fout");

				}
				counterBeurt++;
				System.out.println(status);
				System.out.println("Beurt: " + counterBeurt + "/15");
			}

		}
	}

}
