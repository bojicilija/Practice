package domaci17;

public abstract class Artikal {
	private static int id = 0;
	private double cena;
	private int kolicina;
	private int br;

	public Artikal(double cena, int kolicina) {
		this.cena = cena;
		this.kolicina = kolicina;
		id++;
		br = id;
	}

	public int getId() {
		return this.br;
	}

	public double getCena() {
		return this.cena;
	}

	public int getKolicina() {
		return this.kolicina;
	}

	public boolean kupi() {
		if (kolicina > 0) {
			kolicina--;
			return true;
		}

		else
			return false;
	}

	public abstract String ime();

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#" + br + ": " + ime() + " - " + cena + " [kol: " + kolicina + "]");
		return sb.toString();
	}

}
