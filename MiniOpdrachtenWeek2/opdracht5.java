package MiniOpdrachtenWeek2;

import java.util.Scanner;

public class opdracht5 {

	public static void main(String[] args) {

		 
		// Opdracht 5 
		String wachtwoord = "java";
		  
		  // define Scanner 
		Scanner sc = new Scanner(System.in);
		  
		  // read input 
		String input = sc.nextLine();
		  
		  // check wachtwoord 
		if (wachtwoord.equals(input)) {
		  System.out.println("Wachtwoord is OK: " + wachtwoord); 
		} else {
		  System.out.println("Wachtwoord is fout: " + wachtwoord); 
		}
		
	}
}