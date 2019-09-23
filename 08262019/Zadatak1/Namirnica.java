package domaci21;

public abstract class Namirnica extends Energent {

	protected String ime;
	private static int id = 0;
	protected int br;

	public Namirnica(String ime) {
		this.ime = ime;
		id++;
		br = id;
	}

	public String getIme() {
		return this.ime;
	}

	public int getId() {
		return br;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + id + "] " + ime);
		return sb.toString();
	}

}
