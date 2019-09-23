package domaci24;

public class Main {

	public static void main(String[] args) {
		FudbalskiSavez fb = new FudbalskiSavez("jdbc:sqlite:C:\\Users\\Medjed\\Desktop\\FudbalskiSavez\\FudbalskiSavez - Copy.db");
		
		fb.connect();
		fb.ispisiImena();
		fb.ispisiImenaManUtd();
		fb.ispisiGolove();
		fb.ispisiKartone();
		fb.ubaciFudbalera("Tijeri Anri", "Arsenal");
		fb.ubaciTim("Real Madrid", "Madrid");
		fb.ubaciUtakmicu("Barselona", "Inter", 7, "1", 2008);
		fb.disconnect();
		

	}

}
