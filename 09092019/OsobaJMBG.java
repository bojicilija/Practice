package domaci25;

public class OsobaJMBG extends Osoba {
	private String jmbg;

	public OsobaJMBG(String ime, String prezime, String adresa, String jmbg) {
		super(ime, prezime, adresa);

		this.jmbg = jmbg;
	}

	@Override
	public int numeroloskiBroj() {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		char c;
		for (int i = 0; i < getDatumRodj().length(); i++) {
			c = getDatumRodj().charAt(i);
			if (c >= '0' && c <= '9') {

				sum += Character.getNumericValue(c);
			}
		}
		while (sum > 0) {
			sum1 += sum % 10;
			sum /= 10;
		}

		while (sum1 > 0) {
			sum2 += sum1 % 10;
			sum1 /= 10;
		}
		return sum2;
	}

	@Override
	public String metabolizam(final Datum d) {

		String[] s = getDatumRodj().split("\\.");
		String[] s1 = d.toString().split("\\.");

		int dan = Integer.parseInt(s1[0]) + Integer.parseInt(s[0]);
		int mes = Integer.parseInt(s1[1]) + Integer.parseInt(s[1]);
		int god = Integer.parseInt(s1[2]) + Integer.parseInt(s[2]);
		while (mes > 12) {
			god++;
			mes -= 12;
		}
		while(dan>28 && mes == 2) {
			dan-=28;
			mes++;
		}
		while(dan>30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			dan-=30;
			mes++;
		}
		while(dan>31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
			dan-=31;
			mes++;
		}
		
		String met = "";

		if (dan < 9 && mes < 9) {
			met += "0" + dan + "0" + mes + god;
			return met;
		} else if (dan < 9) {
			met += "0" + dan +  mes +  god;
			return met;
		} else if (mes < 9) {
			met += dan + "0" + mes +  god;
			return met;
		} else {
			met += dan +  mes +  god;
			return met;
		}

	}

	public String getDatumRodj() {
		String s = "";
		for (int i = 0; i < jmbg.length() - 6; i++) {
			s += jmbg.charAt(i);
			if (i == 3) {
				s += ".1";
			} else if (i == 1 || i==6)
				s += ".";
		}

		return s;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\nDatum rodjenja " + getDatumRodj());
		return sb.toString();
	}

}
