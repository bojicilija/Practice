package domaci17;

import java.util.Arrays;
import java.util.Date;

public class Album {
	private String naziv;
	private String izvodjac;
	private Date datum;
	private MuzickaNumera[] nizPesama = new MuzickaNumera[5];
	private int brPesama;
	private int min = 0;
	private int sec = 0;

	public Album(String naziv, String izvodjac, Date datum) {
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		brPesama = 0;
	}

	public void dodaj(MuzickaNumera a) {
		if (brPesama >= nizPesama.length) {
			MuzickaNumera[] niz2 = new MuzickaNumera[2 * nizPesama.length];
			niz2 = Arrays.copyOf(nizPesama, 2 * nizPesama.length);
			nizPesama = niz2;
			nizPesama[brPesama] = a;
			brPesama++;

		} else {
			nizPesama[brPesama] = a;
			brPesama++;
		}

		String[] s = a.getTrajanje().split(":");
		min += Integer.parseInt(s[0]);
		sec += Integer.parseInt(s[1]);
		if (sec >= 60) {
			min += 1;
			sec -= 60;
		}

	}

	public void dodaj(String name, String trajanje) {
		MuzickaNumera c = new MuzickaNumera(name, this.izvodjac, trajanje);
		if (brPesama >= nizPesama.length) {
			MuzickaNumera[] niz2 = new MuzickaNumera[2 * nizPesama.length];
			niz2 = Arrays.copyOf(nizPesama, 2 * nizPesama.length);
			nizPesama = niz2;
			nizPesama[brPesama] = c;
			brPesama++;
		} else {
			nizPesama[brPesama] = c;
			brPesama++;
		}

		String[] a = trajanje.split(":");
		min += Integer.parseInt(a[0]);
		sec += Integer.parseInt(a[1]);
		if (sec >= 60) {
			min += 1;
			sec -= 60;
		}
	}

	public MuzickaNumera getMuzickaNumera(int poz) {
		return nizPesama[poz];
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public String getUkupnoTrajanje() {
		String s = "";
		s += min + ":" + sec;
		return s;
	}

	public MuzickaNumera getMuzickaNumera(String ime) {
		for (int i = 0; i < nizPesama.length; i++) {
			if (nizPesama[i].getNaziv().equals(ime)) {
				return nizPesama[i];
			}
		}
		return null;
	}

	public String toString() {
		String s = izvodjac + " - " + naziv + " ( " + datum + " ):[";
		for (int i = 0; i < nizPesama.length; i++) {
			if (nizPesama[i] != null)
				s += "\n\t" + nizPesama[i];
		}
		s += "\n]: " + getUkupnoTrajanje() + "\n";
		return s;
	}

}
