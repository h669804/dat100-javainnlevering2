package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		int[] tabell = { 22, 46, 88 };
		skrivUt(tabell);
		String omgjøring = tilStreng(tabell);
		System.out.println(omgjøring);

		int s = summer(tabell);
		System.out.println(s);
		System.out.println(finnesTall(tabell, 46));

		int tallPosisjon = posisjonTall(tabell, 46);
		System.out.println(tallPosisjon);

		int[] reversertTabell = reverser(tabell);
		skrivUt(reversertTabell);
		String omgjøring_2 = tilStreng(reversertTabell);
		System.out.println(omgjøring_2);

		boolean rS = erSortert(tabell);
		System.out.println(rS);

		int[] tabell2 = { 25, 26, 27 };
		int[] sammensattTabell = settSammen(tabell, tabell2);
		skrivUt(sammensattTabell);
		String omgjøring_3 = tilStreng(sammensattTabell);
		System.out.println(omgjøring_3);
	}

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tekst = "[";

		for (int i = 0; i < tabell.length; i++) {
			tekst += tabell[i];
			if (i < tabell.length - 1) {
				tekst += ",";
			}
		}
		tekst += "]";
		return tekst;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		sum = 0;
		int temp = tabell.length;
		while (temp > 0) {
			sum += tabell[temp - 1];
			temp--;
		}
		sum = 0;
		for(int utvidet : tabell) {
			sum += utvidet;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean b = false;
		for (int element : tabell) {
			if (element == tall) {
				b = true;
			}
		}
		return b;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversert = new int[tabell.length];
		int j = 0;
		for (int i = tabell.length - 1; i >= 0; i--) {
			reversert[j] = tabell[i];
			j++;
		}
		return reversert;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i = 0;
		boolean riktigSortert = true;
		while (i < tabell.length - 1) {
			if (tabell[i] >= tabell[i + 1]) {
				riktigSortert = false;
			}
			i++;
		}
		return riktigSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length + tabell2.length];
		int temp = 0;

		for (int i = 0; i <= tabell1.length - 1; i++) {
			nyTabell[temp] = tabell1[i];
			temp++;
		}

		for (int i = 0; i <= tabell2.length - 1; i++) {
			nyTabell[temp] = tabell2[i];
			temp++;
		}
		return nyTabell;
	}
}
