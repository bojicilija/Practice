package domaci19;

public class StudentMasterStudija extends Student {
	private String smer;

	public StudentMasterStudija(String ime, String prezime, int godRodjenja, String godStudija, double prosek, String smer) {
		super(ime, prezime, godRodjenja, godStudija, prosek);
		
		this.smer=smer;
	}
	
	public String getSmer() {
		return this.smer;
	}
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ "  Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Studija: " +getGodStudija()+ "  Prosek: " +getProsek();
		s+="\nSmer: " +smer;
		s+="\n";
		return s;

}
}