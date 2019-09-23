package domaci19;

public class Profesor extends Nastavnik {
	
	private String titula;

	public Profesor(String ime, String prezime, int godRodjenja, int godZaposlenja, int plata, String omiljeniPredmet,
			String[] listaPredmeta, String titula) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata, omiljeniPredmet, listaPredmeta);
		
		this.titula=titula;
	}
	
	public String getTitula() {
		return this.titula;
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
		s+="\nTitula: " +titula;
		s+="\n";
		return s;

}
}