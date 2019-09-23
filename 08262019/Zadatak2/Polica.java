package domaci20;

public class Polica {
	private Knjiga[] knjige = new Knjiga[10];

	public Polica() {

	}

	public void dodajKnjigu(Knjiga a) {
		for (int i = 0; i < knjige.length; i++) {
			if (knjige[i] == null) {
				knjige[i] = a;
				return;
			}
		}
	}

	public Knjiga getKnjiga(String a) {
		for (int i = 0; i < knjige.length; i++) {
			if (knjige[i].getNaziv().equals(a)) {
				return knjige[i];
			}
		}
		return null;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < knjige.length; i++) {
			if (knjige[i] != null) {
				s += "\n" + knjige[i] + "\n";
			}
		}
		return s;
	}

}
