package domaci19;

public class Nastavnik extends Zaposleni {
	
	private String omiljeniPredmet;
	private String [] listaPredmeta;

	public Nastavnik(String ime, String prezime, int godRodjenja, int godZaposlenja, int plata, String omiljeniPredmet, String [] listaPredmeta) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata);
		
		this.omiljeniPredmet=omiljeniPredmet;
		this.listaPredmeta=listaPredmeta;
	}

	public String getOmiljeniPredmet() {
		return omiljeniPredmet;
	}

	public void setOmiljeniPredmet(String omiljeniPredmet) {
		this.omiljeniPredmet = omiljeniPredmet;
	}

	public String[] getListaPredmeta() {
		return listaPredmeta;
	}

	public void setListaPredmeta(String[] listaPredmeta) {
		this.listaPredmeta = listaPredmeta;
	}
	
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ "  Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Zaposlenja: " +getGodZaposlenja()+ "  Plata: " +getPlata();
		s+="\nOmiljeni Predmet: " +omiljeniPredmet;
		s+="\nLista Predmeta: ";
		for(int i=0; i<getListaPredmeta().length;i++) {
			s+=listaPredmeta[i]+ " ";
		}
		s+="\n";
		return s;
	
	}
}
