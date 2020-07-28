package MiniOpdrachtenWeek2;

public class opdracht6 {

	public static void main(String[] args) {


		// Opdracht 6
		double lengte, gewicht, bmi;
		lengte = 1.75;
		gewicht = 75.0;
		bmi = gewicht / (lengte * lengte);

		// vergelijk BMI met grenzen: <18, >25, of ertussen in en print kleur

		if (bmi < 18) {
			System.out.println("geel");
		}
		if (bmi >= 18 & bmi < 25) {
			System.out.println("oranje");
		}
		if (bmi >= 25) {
			System.out.println("rood");
		}
		
	}
}
