
package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class probeer {
	public static void main(String[] args) {
			Galgje galgje = new Galgje();
			galgje.starten();
			System.out.println("einde");
	}
}
		
		
class Galgje {
	Scanner input = new Scanner(System.in);
	String woord = "apenkontjes";
	char ch[] = woord.toCharArray();



	void starten() {
		System.out.println("Tijd voor Galgje");
		System.out.println("Het woord heeft " + woord.length() + " letters");
		System.out.println("*");
		System.out.println("Begin met raden!");
		int counter = 0;
		
		while (counter < 15) {
			String letter = input.nextLine();
			check(letter);
	
	}		
}

private void check(String letter) {
//	String geheimWoord = new String(new char[woord.length()]).replace("\0", "*");
//	char gw[] = geheimWoord.toCharArray();
	
	for (int i = 0; i <= woord.length(); i++) {
		if (woord.charAt(i) == letter.charAt(i)) {
			System.out.print(letter);
		}
		else {
			System.out.print("*");

		}
		System.out.println();
		return;
	}
}}

	

		
	


