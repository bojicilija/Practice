package domaci19;

public class Zaposleni extends Covek {
	private int godZaposlenja;
	private int plata;

	public Zaposleni(String ime, String prezime, int godRodjenja, int godZaposlenja, int plata) {
		super(ime, prezime, godRodjenja);

		this.godZaposlenja = godZaposlenja;
		this.plata = plata;

	}

	public int getGodZaposlenja() {
		return this.godZaposlenja;
	}

	public int getPlata() {
		return this.plata;
	}

	public void setPlata(int a) {
		this.plata = a;
	}
	
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ " Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Zaposlenja: " +getGodZaposlenja()+ "  Plata: " +getPlata();
		s+="\n";
		return s;

}
}