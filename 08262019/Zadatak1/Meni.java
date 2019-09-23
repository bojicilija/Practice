package domaci21;

public class Meni {

	private Namirnica[] niz;
	private int brNam;
	private static double ukupnaEnergVr;

	public Meni(int brNam) {
		this.brNam = brNam;
		niz = new Namirnica[brNam];
	}

	public void dodaj(Namirnica n) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == null) {
				niz[i] = n;
				ukupnaEnergVr += n.energVr();
				break;
			}
		}
	}

	public double energVr() {
		return ukupnaEnergVr;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni (" + ukupnaEnergVr + "kJ)");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null) {
				sb.append("\n\t" + niz[i]);
			}
		}
		return sb.toString();
	}

}
