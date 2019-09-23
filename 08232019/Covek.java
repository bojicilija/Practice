package domaci19;

public class Covek {
	private String ime;
	private String prezime;
	private int godRodjenja;
	
	public Covek (String ime, String prezime, int godRodjenja) {
		this.ime=ime;
		this.prezime=prezime;
		this.godRodjenja=godRodjenja;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public String getPrezime(){
		return this.prezime;
	}
	
	public int getGodRodjenja() {
		return this.godRodjenja;
	}
	
	public String toString() {
		String s="";
		s+=ime+ " " + prezime+ " Godina Rodjenja: " +godRodjenja;
		s+="\n";
		return s;

}
}