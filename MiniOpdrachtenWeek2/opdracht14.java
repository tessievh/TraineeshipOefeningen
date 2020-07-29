package MiniOpdrachtenWeek2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class opdracht14 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE dd MMMMM yyyy");
		Calendar calendar = new GregorianCalendar();

		System.out.println("Welk jaar is het?");
		int invoerJaar = scanner.nextInt();

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

		int day = calendar.getFirstDayOfWeek();

		// update datum
		calendar.set(Calendar.YEAR, invoerJaar);
		calendar.set(Calendar.DAY_OF_WEEK, day);
		calendar.set(Calendar.DAY_OF_YEAR, 1);

		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(sdf.format(calendar.getTime()) + " ");
				calendar.add(Calendar.DATE, 1);
			}
			System.out.println();
		}

	}
}
