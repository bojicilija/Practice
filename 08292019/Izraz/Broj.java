package domaci22;

public class Broj extends Izraz {
	
	private double vrednost;
	
	public Broj (double vrednost) {
		this.vrednost=vrednost;
	}

	@Override
	public double izracunaj() {
		return vrednost;
		
	}

}
