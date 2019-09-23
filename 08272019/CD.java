package domaci17;

public class CD extends AlbumArtikal {

	public CD(Album album, String izdavac, int cena, int kolicina) {
		super(album, izdavac, cena, kolicina);
		
	}

	

	@Override
	public String ime() {
		StringBuilder sb=new StringBuilder();
		sb.append(getAlbum().getIzvodjac()+ " - " +getAlbum().getNaziv()+ " (CD)");
		return sb.toString();
	}
	

}
