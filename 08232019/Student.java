package domaci19;

public class Student extends Covek {
	private String godStudija;
	private double prosek;

	public Student(String ime, String prezime, int godRodjenja,String godStudija,double prosek) {
		super(ime, prezime, godRodjenja);
		this.godStudija=godStudija;
		this.prosek=prosek;
		
	}

	public String getGodStudija() {
		return godStudija;
	}

	public void setGodStudija(String godStudija) {
		this.godStudija = godStudija;
	}

	public double getProsek() {
		return prosek;
	}

	public void setProsek(double prosek) {
		this.prosek = prosek;
	}
	
	public String toString() {
		String s="";
		s+=getIme()+ " " + getPrezime()+ "  Godina Rodjenja: " +getGodRodjenja();
		s+="\nGodina Studija: " +godStudija+ "  Prosek: " +prosek;
		s+="\n";
		return s;
	}
}
