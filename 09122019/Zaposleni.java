package domaci26;

public abstract class Zaposleni {
	
	private String ime;
	private Pozoriste p;
	
	public Zaposleni (String ime, Pozoriste p) {
		this.ime=ime;
		this.p=p;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public Pozoriste getPozoriste() {
		return this.p;
	}
	
	public abstract String imePosla();
	
	public String getSkraceniNaziv() {
		return p.getSkraceniNaziv();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime);
		sb.append(" ("+imePosla()+ ", " +getSkraceniNaziv()+")");
		return sb.toString();
	}

}
