package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
		int[][] toDim = { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 2, 3 } };
		int[][] enToDim = { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 2, 3 } };
		skrivUt(toDim);
		System.out.println();

		String s = tilStreng(toDim);
		System.out.println(s);

		int[][] mP = skaler(2, toDim);
		skrivUt(mP);
		System.out.println();

		System.out.println(erLik(toDim, enToDim));
		System.out.println();

		int[][] speilet = speile(toDim);
		String sM = tilStreng(speilet);
		System.out.println(sM);
		System.out.println(s);

		// int[][] gangeMatrise = multipliser(toDim, enToDim);
		// String gange =tilStreng(gangeMatrise);
		// System.out.println(gange);

		int[][] multiMatrise1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] multiMatrise2 = { { 1, 2, 3 }, { 5, 6, 7 }, { 1, 2, 3, } };

		int[][] multimatrise = multipliser(multiMatrise1, multiMatrise2);
		String mM = tilStreng(multimatrise);
		System.out.println(mM);

	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int variabel : matrise[i]) {
				System.out.print(variabel);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				tekst += matrise[i][j];
				tekst += " ";
				if (j < matrise[i].length - 1) {
				}
			}
			tekst += "\n";
		}
		return tekst;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int a = 0;
		int[][] skalert = new int[matrise.length][matrise[a].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[a].length; j++) {
				skalert[i][j] = matrise[i][j] * tall;
			}
			a++;
		}
		return skalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;
		for (int i = 0; i < a.length || i < b.length; i++) {
			for (int j = 0; j < a[i].length || j < b[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					lik = false;
				}
			}
		}
		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int a = 0;
		int b = matrise[a].length - 1;
		int[][] speilMatrise = new int[matrise.length][matrise[a].length];

		for (a = 0; a < matrise.length; a++) {
			for (int c = 0; c < matrise[a].length; c++) {
				speilMatrise[a][c] = matrise[a][b - c];
			}
		}
		return speilMatrise;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int h = 0;
		int h2 = 1;

		int flestRader = Math.max(a.length, b.length);
		int flestElementer = Math.max(a[h].length, b[h].length);

		int[][] multiMatrise = new int[flestRader][flestElementer];
		int[] nyVerdi = new int[flestElementer];
		//følgende kode vil ikke virke for alle vilkårlige matriser
		if (a.length == b[h].length || b.length == a[h].length) {
			for (int k = 0; k < multiMatrise.length; k++) {
				for (int i = 0; i < multiMatrise[k].length; i++) {
					nyVerdi[i] = (a[k][h] * b[h][i]) + (a[k][h2] * b[h2][i]);
					multiMatrise[k][i] = nyVerdi[i];
				}
			}
		}

		return multiMatrise;
	}
}
