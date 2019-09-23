package domaci26;

import java.util.ArrayList;

public class Repertoar {
	
	private Pozoriste p;
	private ArrayList<Predstava> predstava;
	
	public Repertoar(Pozoriste p) {
		this.p=p;
		predstava = new ArrayList<Predstava>();
	}
	
	public void dodaj(Predstava pr) {
		if(pr!=null) {
			predstava.add(pr);
		}
	}
	
	public void ukloni(String imePredstave) {
		for(int i=0; i<predstava.size(); i++) {
			if(predstava.get(i).getNaziv().equals(imePredstave)) {
				predstava.remove(i);
			}
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(p.getNaziv()+ ": [\n");
		for(Predstava pr : predstava) {
			if(pr!=null) {
				sb.append(pr+ "\n");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
