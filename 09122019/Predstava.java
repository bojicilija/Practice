package domaci26;

import java.util.ArrayList;

public class Predstava {

	private String naziv;
	private Pozoriste p;
	private ArrayList<Zaposleni> zap;
	private Reditelj r;
	private int br;

	public Predstava(String naziv, Pozoriste p, Reditelj r) {
		this.naziv = naziv;
		this.p = p;
		this.r = r;
		br=0;
		zap = new ArrayList<Zaposleni>();
		if(!zap.contains(r) && p.getSkraceniNaziv().equals(r.getSkraceniNaziv())) {
			zap.add(r);
		}
	}

	public boolean dodaj(Glumac g) {
		if (p.getSkraceniNaziv().equals(g.getSkraceniNaziv())) {
			zap.add(g);
			return true;
		} else
			return false;
	}

	public boolean dodaj(Kostimograf k) {
		if (p.getSkraceniNaziv().equals(k.getSkraceniNaziv()) && br < 2) {
			zap.add(k);
			br++;
			return true;
		} else
			return false;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	
	public Pozoriste getPozoriste() {
		return this.p;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv+ ":");
		for(Zaposleni z : zap) {
			if(zap!=null) {
				sb.append("\n\t" +z);
			}
		}
		return sb.toString();
	}
}
