package oppgave4;

import java.util.ArrayList;
import java.util.Random;

public class MiniGoogle {
	private WebDokument[] websider;
	private int antall = 0;
	Random random=new Random();

	public MiniGoogle(int n) {
		super();
		this.websider = new WebDokument[n];
		this.antall = 0;
	}

	public void sok(String sokeord) {
		for (int i = 0; i < antall; i++) {
			if (websider[i].finnes(sokeord)) {
				System.out.println(websider[i].getUrl());
			}
		}
	}

	public String beste(String sokeord) {
		String besteurl = null;
		int besteantall = 0;

		for (int i = 0; i < antall; i++) {

			WebDokument webside = websider[i];
			int websideantall = webside.frekvens(sokeord);

			if (websideantall > besteantall) {
				besteurl = webside.getUrl();
				besteantall = websideantall;
			}
		}
		return besteurl;
	}
	
	private int random(int n) {
		return random.nextInt(n-1);
	}
	
	public WebDokument indekser(WebDokument webside) {
		WebDokument fjernet = null; 
		
		if(antall<websider.length) {
			websider[antall]=webside;
		}else{
			int i= random(websider.length);
			fjernet = websider[i];
			websider[i]=webside;	
		}	
		return fjernet;
	}

	public String[] google(String[] sokeord) {
		ArrayList<String> urllist =new ArrayList<String>();
		
		for(int i=0;i<antall;i++) {
			if(finnesAlle(websider[i],sokeord)) {
				urllist.add(websider[i].getUrl());
			}
		}
		
		String[] urlarray=new String[urllist.size()];
		for(int i=0;i<urllist.size();i++) {
			urlarray[i]=urllist.get(i);
		}
		
		return urlarray;
	}
	
	
	public boolean finnesAlle(WebDokument webside, String[] sokeord) {
		for (String s : sokeord) {
			if (!webside.finnes(s)) {
				return false;
			}
		}
		return true;
	}

	
	
	
	

}
