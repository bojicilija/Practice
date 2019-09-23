package domaci26;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String ime, Pozoriste p) {
		super(ime, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imePosla() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
