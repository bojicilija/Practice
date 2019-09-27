package knjiga;

public class Main {

	public static void main(String[] args) {
		Recnik r = new Recnik(args[1]);
		r.connect();
		r.ucitajReci();
		System.out.println("ucitao recnik " + r.reciURecniku.size());
		
		String knjigaFile = args[0];
		Knjiga k = new Knjiga (knjigaFile);
		k.ucitajReciKnjige();
		System.out.println("ucitao knjigu " + k.sveReci.size());
		
		k.pronadjiReci(r.reciURecniku);
		
		k.prodnadjiPonavljaneReci(r.reciURecniku);
		k.pronadjiNajcesceReci();
		k.dodajReciUFajl(r.reciURecniku);
		
		r.unesiNoveReci(k.noveReci);
		
		r.disconnect();

	}

}