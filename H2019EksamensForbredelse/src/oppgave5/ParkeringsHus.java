package oppgave5;

public class ParkeringsHus {
	private boolean[][] pplasser;

	// a)
	public ParkeringsHus(int etasjer, int plasser) {
		pplasser = new boolean[etasjer][plasser];
	}

	//extra
	public void leggTil(boolean [][] pplasser) {
		this.pplasser=pplasser;
	}

	// b)
	public void skrivUt() {
		for (boolean[] etasje : pplasser) {
			for (boolean plass : etasje) {
				System.out.print("|");
				if (plass) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("|");
		}

	}

	// c)
	public boolean erOpptatt(int etasje, int plass) {
		return pplasser[etasje][plass];

	}

	// d)
	public boolean parker(int etasje, int plass) {
		boolean parkert = false;
		if (!erOpptatt(etasje, plass)) {
			pplasser[etasje][plass] = true;
			parkert = true;
		}
		return parkert;
	}

	// e)
	public int antallLedige(int etasje) {
		int antall = 0;
		boolean[] pdekk = pplasser[etasje];
		for (boolean b : pdekk) {
			if (!b) {
				antall++;
			}
		}

		return antall;
	}

	// f)
	public int[] statusLedige() {
		int[] ledigT = new int[pplasser.length];

		for (int i = 0; i < pplasser.length; i++) {

			int sum = 0;
			for (int j = 0; j < pplasser[i].length; j++) {

				if (!pplasser[i][j]) {
					sum++;
				}
			}
			ledigT[i] = sum;
		}

		return ledigT;
	}

}
