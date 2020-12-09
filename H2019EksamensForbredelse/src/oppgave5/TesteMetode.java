package oppgave5;

public class TesteMetode {
	public static void main(String[] args) {

		ParkeringsHus pP = new ParkeringsHus(3, 2);

		boolean[][] t = { { false, false, false }, { true, true, true } };
		pP.leggTil(t);
		skriveUt(pP.statusLedige());
	}

	public static void skriveUt(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "    ");
		}

	}

}
