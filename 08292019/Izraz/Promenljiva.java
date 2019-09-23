package domaci22;

public class Promenljiva extends Izraz {
	
	private String ime;
	private int vrednost;
	
	public Promenljiva (String ime, int vrednost) {
		this.ime=ime;
		this.vrednost=vrednost;
	}

	@Override
	public double izracunaj() {
		
		return this.vrednost;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Ime: " +this.ime);
		sb.append("   Vrednost: " +this.vrednost);
		return sb.toString();
	}

}
