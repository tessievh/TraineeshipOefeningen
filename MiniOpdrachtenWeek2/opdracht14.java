package MiniOpdrachtenWeek2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class opdracht14 {
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
	    Calendar calendar = new GregorianCalendar();

	    System.out.println("Welk jaar is het?");
		 int invoerJaar = scanner.nextInt();
		
		 int maand = 0;
		 int dag = 1;
	    
	    //update datum
	    calendar.set(Calendar.YEAR, invoerJaar);
	    calendar.set(Calendar.MONTH, maand);
	    calendar.set(Calendar.DAY_OF_MONTH, dag);

	    System.out.println(sdf.format(calendar.getTime()));
	    
	    System.out.println("Welke dag van de week was het op 1 januari?");
	    String invoerDag = scanner.next();
	   
    
	    if (invoerDag.equals("zondag")) {
	    	calendar.setFirstDayOfWeek(Calendar.SUNDAY);
	    }
	    if (invoerDag.equals("maandag")) {
	    	calendar.setFirstDayOfWeek(Calendar.MONDAY);
	    }
	    if (invoerDag.equals("dinsdag")) {
	    	calendar.setFirstDayOfWeek(Calendar.TUESDAY);
	    }
	    if (invoerDag.equals("woensdag")) {
	    	calendar.setFirstDayOfWeek(Calendar.WEDNESDAY);
	    }
	    if (invoerDag.equals("donderdag")) {
	    	calendar.setFirstDayOfWeek(Calendar.THURSDAY);
	    }
	    if (invoerDag.equals("vrijdag")) {
	    	calendar.setFirstDayOfWeek(Calendar.FRIDAY);
	    }
	    if (invoerDag.equals("zaterdag")) {
	    	calendar.setFirstDayOfWeek(Calendar.SATURDAY);
	    }
	   
	    // print
	   int  day = calendar.getFirstDayOfWeek();
	   System.out.println("first day of week changed to: " + day);
	    
	   String weekDay[] = {"Zondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag"};
	   
	   System.out.println();
	   
	/*
	   
	   for (int i = 0; i <= weekDay.length ; i ++) { 
		   System.out.println(sdf.format(calendar.getTime()) + " " + weekDay[i+1]);
		   calendar.add(Calendar.DAY_OF_WEEK, 1);
		   
	   }
*/	
	
	}
}
