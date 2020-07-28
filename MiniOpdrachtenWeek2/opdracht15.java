package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class opdracht15 {
	public static void main(String[] args) {

/*


Maak een tweedimensionaal array.

Bijvoorbeeld:

         0123456789

         ||||||||||

A        0011100100

B        0000000100

C        0111000100

D        0000000100

E        0011000000

De invoer van A1 geeft mis. De invoer van E3 geeft raak.
*/
			
		System.out.println("Tijd voor zeeslagje!");		
		
		int bord[] = {0,0,0,0,0,0,1,1,1,0};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Noem een cijfer van 1-10. Je hebt vijf beurten om het schip te laten zinken");
		

		int counterGoed = 0;
		int counterBeurt = 0;

		while (counterBeurt < 5) {
			int schot = scanner.nextInt();
			if (schot > 10) {
				System.out.println("Gebruik een getal onder de 10");
			}
			if ((schot == 7) || (schot == 8) || (schot == 9)) {
				counterGoed++;
				counterBeurt++;
				System.out.println("raak!");
				if (counterGoed == 3) {
					System.out.println("Joehoeee, gewonnen!");
				}
			} else  {
				counterBeurt++;
				System.out.println("Mispoes!");	
				if (counterBeurt == 5) {
					System.out.println("Helaas je hebt verloren");
				}
			}

		}
	
		
			
	}
	
		
}
