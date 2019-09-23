package domaci26;

public class Pozoriste {
	private static int br;
	private int id;
	private String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		br++;
		id = br;
	}

	public int getId() {
		return this.id;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public String getSkraceniNaziv() {
		String[] s = naziv.split(" ");
		String str = "";
		for (int i = 0; i < s.length; i++) {
			str += s[i].toUpperCase().charAt(0);
		}
		return str;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + "[" + id + "]");
		return sb.toString();
	}

}
