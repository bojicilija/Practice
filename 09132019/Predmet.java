package domaci27;

public class Predmet extends Tovar {
	
	private String vrsta;
	private double tezina;
	
	public Predmet (String vrsta, double tezina) {
		this.vrsta=vrsta;
		this.tezina=tezina;
	}

	@Override
	public String vrsta() {
		return this.vrsta;
	}

	@Override
	public double tezina() {
		return this.tezina;
	}

}
