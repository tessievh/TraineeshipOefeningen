package MiniOpdrachtenWeek2;

public class opdracht7 {

	public static void main(String[] args) {	

		// opdracht 7
	   String str = "Ik programmeer Java!";

       String reverse = "";
       System.out.println(str);

       // reverse = omgekeerde van str
       char ch[] = str.toCharArray();
	       
       for (int i= ch.length-1; i >=0; i--) {
    	   reverse = reverse + ch[i];
       }

       // print reverse
	   System.out.println(reverse);
	  
	}
}
