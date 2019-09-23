package domaci18;

public class Ocena {
	private int bodovi;
	private Predmet pr;
	
	public Ocena(int bodovi, Predmet pr) {
		this.pr=pr;
		this.bodovi = bodovi;
	}
	
	public int getBodovi() {
		return bodovi;
	}
	
	public Predmet getPr() {
		return pr;
	}
	
	public int getOcena() {
			if (bodovi < 50)
				return 5;
			else if (bodovi < 65)
				return 6;
			else if (bodovi < 75)
				return 7;
			else if (bodovi < 85)
				return 8;
			else if (bodovi < 95)
				return 9;
			else
				return 10;
	}
	
	public String ispisOcene() {
		String s = "Predmet: " +pr.getIme()+ " , Ocena: " +getOcena();
		return s;
	
	}
	

}
