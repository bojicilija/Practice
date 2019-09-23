package domacii29;



public class Main {

	public static void main(String[] args) {
		
//		argumente i ostala 4 primera cu dostaviti ovih dana kada zavrsim ceo zadatak		
		
		String microDvdFajl = "src\\Primer.txt";
		String subRipFajl = "src\\Primer.srt";

		MicroDVD m = new MicroDVD (microDvdFajl);
		SubRip s = new SubRip(subRipFajl);
		
		m.microDvdtoSubRip();
		m.ispisiKonvertovanMicroDVD(m.getIspis());
		
		s.subRipToMicroDvd();
		s.ispisiKonvertovanSubRip(s.getIspis());
		
		
		

	}

}
