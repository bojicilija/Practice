package domaci19;

public class Asistent extends Nastavnik {
	
	private String smer;

	public Asistent(String ime, String prezime, int godRodjenja, int godZaposlenja, int plata, String omiljeniPredmet,
			String[] listaPredmeta, String smer) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata, omiljeniPredmet, listaPredmeta);
		
		this.smer=smer;
	}
	
	public String getSmer() {
		return this.smer;
	}
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ "  Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Zaposlenja: " +getGodZaposlenja()+ "  Plata: " +getPlata();
		s+="\nOmiljeni Predmet: " +getOmiljeniPredmet();
		s+="\nLista Predmeta: ";
		for(int i=0; i<getListaPredmeta().length;i++) {
			s+=getListaPredmeta()[i]+ ", ";
		}
		s+="\nSmer: " +smer;
		s+="\n";
		return s;
	
	}
}
