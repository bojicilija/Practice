package domaci20;

import java.util.Arrays;

public class Knjiga {
	public String naziv;
	public List[] listovi = new List[5];
	private int br = 0;

	public Knjiga(String naziv) {
		this.naziv = naziv;

	}

	public void dodajList(List a) {
		if (a.getRedniBr() < 0)
			return;

		else if (a.getRedniBr() >= listovi.length) {
			List[] temp = new List[listovi.length * 2];
			temp = Arrays.copyOf(listovi, listovi.length * 2);
			listovi = temp;
			listovi[a.getRedniBr()] = a;
			return;
		} else
			listovi[a.getRedniBr()] = a;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public int getBrListova() {
		int br = 0;
		for (int i = 0; i < listovi.length; i++) {
			if (listovi[i] != null) {
				br++;
			}
		}
		return br;
	}

	public List getList(int a) {
		if (a < 0 || a >= listovi.length) {
			System.out.println("Greska");
			return null;
		}

		return listovi[a];

	}

	public String toString() {
		String s = "";
		s += naziv;
		for (int i = 0; i < listovi.length; i++) {
			if (listovi[i] != null) {
				s += "\n\t" + listovi[i];
			}
		}
		return s;

	}

}
