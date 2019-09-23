package domaci17;

import java.util.Arrays;

public class Prodavnica {

	private String ime;
	private String lokacija;
	private Artikal[] artikli = new Artikal[10];
	private int br = 0;

	public Prodavnica(String ime, String lokacija) {
		this.ime = ime;
		this.lokacija = lokacija;
	}

	public String getIme() {
		return this.ime;
	}

	public String getLokacija() {
		return this.lokacija;
	}

	public void dodaj(Artikal a) {

		if (br == artikli.length) {
			Artikal[] temp = Arrays.copyOf(artikli, artikli.length * 2);
			artikli = temp;
		}

		for (int i = 0; i < artikli.length; i++) {
			if (artikli[i] == null) {
				artikli[i] = a;
				br++;
				return;
			}
		}
	}

	public Artikal[] pretrazi(String s) {
		int br = 0;

		for (int i = 0; i < artikli.length; i++) {
			if (artikli[i] != null && artikli[i].ime().toLowerCase().contains(s.toLowerCase())) {
				br++;
			}
		}
		int j = 0;
		Artikal[] temp = new Artikal[br];
		for (int i = 0; i < artikli.length; i++) {
			if (artikli[i] != null && artikli[i].ime().toLowerCase().contains(s.toLowerCase())) {
				temp[j] = artikli[i];
				j++;
			}
		}
		return temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime + ": " + lokacija + " [");
		for (int i = 0; i < artikli.length; i++) {
			if (artikli[i] != null) {
				sb.append("\n\t" + artikli[i]);
			}
		}
		sb.append("\n]");
		return sb.toString();

	}
}