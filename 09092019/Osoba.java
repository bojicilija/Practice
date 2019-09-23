package domaci25;

public abstract class Osoba {
	private String ime;
	private String prezime;
	private String adresa;
	
	public Osoba (String ime, String prezime, String adresa) {
		this.ime=ime;
		this.prezime=prezime;
		this.adresa=adresa;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public String getPrezime() {
		return this.prezime;
	}
	
	public String getAdresa() {
		return this.adresa;
	}
	
	public void setAdresa(String a) {
		this.adresa=a;
	}
	
	public abstract int numeroloskiBroj();
	
	public abstract String metabolizam(final Datum d);
	
	public String toString() {
		StringBuilder sb =  new StringBuilder ();
		sb.append("Ime: " +ime);
		sb.append("\nPrezime: " +prezime);
		sb.append("\nAdresa: " +adresa);
		return sb.toString();
	}


}
