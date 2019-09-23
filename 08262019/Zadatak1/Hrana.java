package domaci21;

public class Hrana extends Namirnica {

	private double tezina;
	private double proteini;
	private double masti;
	private double uh;

	public Hrana(String ime, double tezina, double proteini, double masti, double uh) {
		super(ime);
		this.tezina = tezina;
		this.proteini = proteini;
		this.masti = masti;
		this.uh = uh;

	}

	@Override
	public double energVr() {
		return (proteini * 16.7 + masti * 37.6 + uh * 17.2) * tezina / 100;
	}

	public double getProteini() {
		return this.proteini;
	}

	public double getMasti() {
		return this.masti;
	}

	public double getUh() {
		return this.uh;
	}

	public double getTezina() {
		return this.tezina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + getId() + "] " + getIme() + " (" + tezina + "g, " + energVr() + "kJ)");
		return sb.toString();
	}

}
