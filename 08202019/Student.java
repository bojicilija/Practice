package domaci18;

public class Student {
	private String potpis;
	private String jmbg;
	private Ocena[] upisaneOcene;

	public Student(String potpis, String jmbg, Ocena[] upisaneOcene) {

		this.potpis = potpis;
		this.jmbg = jmbg;
		this.upisaneOcene = upisaneOcene;
	}

	public String getPotpis() {
		return potpis;
	}

	public void setPotpis(String potpis) {
		this.potpis = potpis;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public double getProsecnaOcena() {
		double zbir = 0;
		int br = 0;
		for (int i = 0; i < upisaneOcene.length; i++) {
			if (upisaneOcene[i].getOcena() != 5)
				zbir += upisaneOcene[i].getOcena();

			else
				br++;
		}
		return zbir / (upisaneOcene.length - br);
	}

	public String getDatumRodjenja() {
		char c='9';
		char d='0';
		String s = "";
		for (int i = 0; i < jmbg.length() - 6; i++) {
			if (i == 4 && jmbg.charAt(i) == c) {
				s += 1;
			}
			else if(i == 4 && jmbg.charAt(i) == d) {
				s+=2;
			}
			s += jmbg.charAt(i);
		}
		return s;
	}
	public String getGodinaRodjenja() {
		char c='9';
		char d='0';
		String s = "";
		for (int i = 4; i < jmbg.length() - 6; i++) {
			if (i == 4 && jmbg.charAt(i) == c) {
				s += 1;
			}
			else if(i == 4 && jmbg.charAt(i) == d) {
				s+=2;
			}
			s += jmbg.charAt(i);
		}
		return s;
	}

	public String getIme() {
		String[] d = potpis.split(" ");
		return d[0];
	}

	public String getPrezime() {
		String[] d = potpis.split(" ");
		return d[1];
	}

	public String najboljaOcena() {
		int a = 0;
		for (int i = 0; i < upisaneOcene.length; i++) {
			if (upisaneOcene[i].getOcena() > a) {
				a = upisaneOcene[i].getOcena();
			}
		}
		int br = 0;
		for (int i = 0; i < upisaneOcene.length; i++) {
			if (upisaneOcene[i].getOcena() == a) {
				break;

			}
			br++;
		}
		return upisaneOcene[br].getPr().getIme();
	}

	
	 static boolean starijiOd(Student s, int god) {
		 int br = Integer.parseInt(s.getGodinaRodjenja());
		 if((2019-br)>=god) {
			 return true;
		 }
		 else return false;
	  }
	 
	public static Student[] prosekVeciOd(Student[] nizStudenata, double ocena) {
		int br = 0;
		for (int i = 0; i < nizStudenata.length; i++) {
			if (nizStudenata[i].getProsecnaOcena() < ocena) {
				br++;
			}
		}
		Student[] veciProsek = new Student[nizStudenata.length - br];
		int a = 0;
		for (int i = 0; i < nizStudenata.length; i++) {
			if (nizStudenata[i].getProsecnaOcena() > ocena) {
				veciProsek[a] = nizStudenata[i];
				a++;
			}
		}
		return veciProsek;
	}

}
