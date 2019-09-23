package domaci25;

public class Datum {
	private int dan;
	private int mesec;
	private int godina;

	public Datum(int dan, int mesec, int godina) {
		this.dan = dan;
		this.mesec = mesec;
		this.godina = godina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (dan < 9 && mesec < 9) {
			sb.append("0" + dan + ".0" + mesec + "." + godina+".");
			return sb.toString();
		}
		else if (dan < 9) {
			sb.append("0" + dan + "." + mesec + "." + godina+".");
			return sb.toString();
		}
		else if (mesec < 9) {
			sb.append(dan + ".0" + mesec + "." + godina+".");
			return sb.toString();
		}
		else {
			sb.append(dan + "." + mesec + "." + godina+".");
			return sb.toString();
		}
		
	}

	public int getDan() {
		return this.dan;
	}

	public int getMesec() {
		return this.mesec;
	}

	public int getGodina() {
		return this.godina;
	}

}
