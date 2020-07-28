
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

		int counter = 0;
		String geheimWoord = new String(new char[woord.length()]).replace("\0", "*");
		StringBuilder geheim = new StringBuilder();
		
		while (counter < 10) {
			char userInput = input.next().charAt(0);
		
		
			for (int i = 0; i < woord.length(); i++) {
				if (woord.charAt(i) == userInput) {
					geheim.append(userInput);
				}
				else {
					geheim.append(" * ");
				}
			}
	
			System.out.println(geheim);
			counter++;
		

	}
	}
}