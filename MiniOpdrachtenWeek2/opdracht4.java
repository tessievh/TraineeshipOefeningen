package MiniOpdrachtenWeek2;

public class opdracht4 {

	public static void main(String[] args) {

		// Opdracht 4 
		String org = "Deze regel heeft best wel veel eees."; 
		int res =  0;
		 
		  // Tel hoe vaak de letter "e" voorkomt in string org 
		for (int i=0; i <= org.length()-1; i++) { 
			if(org.charAt(i) == 'e') { 
				res++; 
			}
		  } 
		// Print aantal "e"-s in org 
		System.out.println(res);
	}
}
