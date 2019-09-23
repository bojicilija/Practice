package domaci15;

public class Pravougaonik {
	private double a;
	private double b;
	private String ime;

	public Pravougaonik(double a, double b, String i) {
		this.a = a;
		this.b = b;
		ime = i;
	}

	public Pravougaonik(double n, String i) {
		a = n;
		b = n;
		ime = i;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public String getIme() {
		return ime;
	}

	public double getObim() {
		double o = 2 * (a + b);
		return o;
	}

	public double getPovrsina() {
		double p = a * b;
		return p;
	}

	public String ispisPravougaonika() {
		String s = "";
		s += "\nPravougaonik: " + ime;
		s += "\nDuzina prve stranice je: " + a;
		s += "\nDuzina druge stranice je: " + b;
		s += "\nPovrsina pravougaonika je: " + getPovrsina();
		s += "\nObim pravougaonika je: " + getObim();
		return s;
	}

}
