package domaci17;

public class LP extends AlbumArtikal {
	
	private int tezina;

	public LP(Album album, String izdavac, double cena, int kolicina, int tezina) {
		super(album, izdavac, cena, kolicina);
		
		this.tezina=tezina;
		
	}

	@Override
	public String ime() {
		StringBuilder sb=new StringBuilder();
		sb.append(getAlbum().getIzvodjac()+ " - " +getAlbum().getNaziv()+ " ("+ tezina+ "[g] LP)");
		return sb.toString();
		
	}

}
