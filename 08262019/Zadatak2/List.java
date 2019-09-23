package domaci20;

public class List {
	private int redniBr;
	private String tekst;

	public List(int redniBr, String tekst) {

		this.redniBr = redniBr;
		this.tekst = tekst;
	}

	public int getRedniBr() {
		return this.redniBr;
	}

	public boolean uporedi(List a) {
		if (a.redniBr == redniBr) {
			return true;
		} else
			return false;
	}

	public static boolean uporedi(List a, List b) {
		if (a.redniBr == b.redniBr) {
			return true;
		} else
			return false;
	}

	public void setTekst(String s) {
		this.tekst = s;
	}

	public String toString() {
		String s = "";
		s += tekst + " (" + redniBr + ")";
		return s;
	}

}
