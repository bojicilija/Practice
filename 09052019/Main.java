package studentskabaza;

public class Main {

	public static void main(String[] args) {
		StudentskaBaza sb = new StudentskaBaza("jdbc:sqlite:C:\\Users\\Medjed\\Desktop\\Studentska baza\\studentskabaza (1) - Copy.db");
		
		sb.connect();
		//sb.dodajStudenta(20140020, "Milos", "Peric", "06.07.2014", "20.01.1995", "Beograd");
		//sb.izbrisiIspit();
		sb.setDatumRodjenja(20130023, "02.08.1994");
		
		sb.disconnect();

	}

}
