package MiniOpdrachtenWeek2;


public class opdracht9 {

	public static void main(String[] args) {
	
	// opdracht 9
	int number = 9;
	int fact = 1;


	 // compute factorial of number and assign result to fact
	 for (int i = 1; i <= number; i++) {
	    	fact = fact * i;
	  }
	    
	 // print fact
	 System.out.println("Factorial of " + number + " is: " + fact);
 
	}
}