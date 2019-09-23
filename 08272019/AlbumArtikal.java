package domaci17;

public abstract class AlbumArtikal extends Artikal {
	
	private String izdavac;
	private Album album;

	public AlbumArtikal(Album album, String izdavac ,double cena, int kolicina) {
		super(cena, kolicina);
		
		this.album=album;
		this.izdavac=izdavac;
		
	}
	
	public abstract String ime();

	public Album getAlbum() {
		return album;
	}

}
