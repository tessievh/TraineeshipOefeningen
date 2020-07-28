package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class opdracht3 {

	public static void main(String[] args) {	  
		  
		  // Opdracht 3 
		Scanner sc = new Scanner(System.in); 
		int i = sc.nextInt(); 
		//  Vergelijk cijfer met 6 
		if (i > 6) { 
			System.out.println("Getal hoger dan 6");
		} 
		if (i == 6) { 
			System.out.println("Getal gelijk aan 6"); 
		} 
		if (i < 6) {
		  System.out.println("Getal lager dan 6"); 
		}
		
	}
}