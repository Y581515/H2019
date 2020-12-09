package oppgave4;

import java.util.ArrayList;

public class WebDokument {
	private String url;
	private String[] ord;

	public WebDokument(String url, String innhold) {

		this.url = url;
		this.ord = delOpp(innhold);
	}

	private String[] delOpp(String innhold) {
		return innhold.split(" ");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getOrd() {
		return ord;
	}

	public void setOrd(String[] ord) {
		this.ord = ord;
	}

	public boolean finnes(String sokeord) {
		for (String s : ord) {
			if (s.equals(sokeord)) {
				return true;
			}
		}
		return false;
	}

	public int frekvens(String sokeord) {
		int ant = 0;
		for (String s : ord) {
			if (s.equals(sokeord)) {
				ant++;
			}
		}
		return ant;
	}


}
