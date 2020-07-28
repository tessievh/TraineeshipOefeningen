package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class opdracht10 {

	public static void main(String[] args) {

		// opdracht 10

		Scanner input = new Scanner(System.in);
		String a = "abcdefghijklmnopqrstuvwxyz";
		char ch[] = a.toCharArray();

		System.out.println("Wat is de volgorde van het alfabet ook alweer??");

		// String input = sc.nextLine();
		

		for (int i = 0; i < a.length(); i++) {
			char userInput = input.next().charAt(0);
			if (ch[i] == userInput) {
				System.out.println("Correct! Wat is de volgende letter?");
			} else {
				System.out.println("Verkeerd, maar ga door!");
			}
			a.charAt(i + 1);
			input.nextLine();
		}

	}

}