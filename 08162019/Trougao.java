package domaci16;

public class Trougao {
	private Tacka t;
	private double a;
	private double b;
	private double c;
	private boolean jeValidan;

	public Trougao(Tacka t, double a, double b, double c) {

		if (a <= 0 || b <= 0 || c <= 0)
			System.out.println("\nSve stranice moraju da budu pozitivne");
		else if (a + b <= c || a + c <= b || b + c <= a)
			System.out.println("\nNije moguce konstruisati trougao sa unetim stranicama");
		else {
			this.t = t;
			this.a = a;
			this.b = b;
			this.c = c;
			jeValidan = true;

		}
	}

	public Tacka getTacka() {
		return t;
	}

	public double getObim() {
		return a + b + c;
	}

	public double getPovrsina() {
		double s = (a + b + c) / 2;
		double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return p;
	}

	public void setA(double n) {
		if (n <= 0)
			System.out.println("\nStranica mora da sadrzi pozitivan broj.");
		else if (n + b <= c || n + c <= b || b + c <= n)
			System.out.println("\nNije moguce konstruisati trougao sa unetim stranicama");
		else {
			a = n;
			jeValidan = true;
		}

	}

	public void setB(double n) {
		if (n <= 0)
			System.out.println("\nStranica mora da sadrzi pozitivan broj.");
		else if (a + n <= c || a + c <= n || n + c <= a)
			System.out.println("\nNije moguce konstruisati trougao sa unetim stranicama");
		else {
			b = n;
			jeValidan = true;
		}
	}

	public void setC(double n) {
		if (n <= 0)
			System.out.println("\nStranica mora da sadrzi pozitivan broj.");
		else if (a + b <= n || a + n <= b || b + n <= a)
			System.out.println("\nNije moguce konstruisati trougao sa unetim stranicama");
		else {
			c = n;
			jeValidan = true;
		}
	}

	public void istaPocetnaTacka(Trougao t1, Trougao t2) {
		if (t1.jeValidan && t2.jeValidan) {
			if (t1.getTacka().getX() == t2.getTacka().getX() && t1.getTacka().getY() == t2.getTacka().getY())
				System.out.println("\nTrouglovi imaju istu pocetnu tacku");
			else
				System.out.println("\nTrouglovi nemaju istu pocetnu tacku");
		} else
			System.out.println("\nNeki od trouglova nije validan");
	}

	public void ispisTrougla(Trougao t) {
		if (jeValidan) {
			String s = "";
			s += "\nTrougao sa pocetkom u " + t.getTacka().ispisTacke();
			s += "\nStranice trougla: " + a + " " + b + " " + c;
			s += "\nPovrsina i obim: P = " + t.getPovrsina() + ", O = " + t.getObim();
			System.out.println(s);
		} else
			System.out.println("\nTrougao nije kreiran pravilno");
	}

	public void jeJednakokraki() {
		if (jeValidan) {
			if (a == b || b == c || a == c)
				System.out.println("\nTrougao je jednakokraki");
			else
				System.out.println("\nTrougao nije jednakokraki");
		} else
			System.out.println("\nTrougao nije kreiran pravilno");
	}

	public void setPocetnaTacka(Tacka t) {
		this.t = t;
	}

}
