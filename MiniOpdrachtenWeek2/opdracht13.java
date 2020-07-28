package MiniOpdrachtenWeek2;

public class opdracht13 {
	public static void main(String[] args) {

		int[] kaartspel = new int[52];
		String[] kleur = { "Harten", "Schoppen", "Ruiten", "Klaveren" };
		String[] rang = { "Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Koning" };

		for (int i = 0; i < kaartspel.length; i++) {
			kaartspel[i] = i;
			String Kleur = kleur[kaartspel[i] / 13];
			String Rang = rang[kaartspel[i] % 13];
			System.out.println(Kleur + " " + Rang);
		}
	}

}
