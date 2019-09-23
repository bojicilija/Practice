package domaci21;

public class Pice extends Namirnica {

	private double kolicina;
	private double enVr;

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);

		this.kolicina = kolicina;
		this.enVr = enVr;

	}

	@Override
	public double energVr() {

		return enVr * kolicina;
	}

	public double getKolicina() {
		return this.kolicina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + getId() + "] " + getIme() + " (" + kolicina + "l, " + energVr() + "kJ)");
		return sb.toString();
	}

}
