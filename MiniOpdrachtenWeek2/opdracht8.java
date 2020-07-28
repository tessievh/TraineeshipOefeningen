package MiniOpdrachtenWeek2;


public class opdracht8 {

	public static void main(String[] args) {

		// opdracht 8
       String org = "Bruine bloemen!";
       char ch[] = org.toCharArray();
       
       // Print String org met een letter per regel
       for (int index = 0; index < org.length(); index++) {
    	   if ((org.charAt(index) =='a') || (org.charAt(index) == 'o') || (org.charAt(index) == 'i') || (org.charAt(index) == 'u') || (org.charAt(index) == 'e')) {
    		   System.out.println(org.charAt(index) + "*");
    	   } else {
    	   System.out.println(org.charAt(index));
    	   } 
       }
       
	}
}

