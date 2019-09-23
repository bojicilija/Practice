package domaci26;

public class Glumac extends Zaposleni {

	public Glumac(String ime, Pozoriste p) {
		super(ime, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imePosla() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
