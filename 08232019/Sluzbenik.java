package domaci19;

public class Sluzbenik extends Zaposleni {
	
	private String odsek;

	public Sluzbenik(String ime, String prezime, int godRodjenja, int godZaposlenja, int plata, String odsek) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata);
		
		this.odsek=odsek;
	}

	public String getOdsek() {
		return odsek;
	}

	public void setOdsek(String odsek) {
		this.odsek = odsek;
	}
	
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ "  Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Zaposlenja: " +getGodZaposlenja()+ "  Plata: " +getPlata();
		s+="\nOdsek: " +odsek;
		s+="\n";
		return s;
	}

}
