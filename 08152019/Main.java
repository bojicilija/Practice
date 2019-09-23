package domaci15;

public class Main {

	public static void main(String[] args) {
		Pravougaonik p1= new Pravougaonik(7, 6, "Pravougaonik1");
		Pravougaonik p2 = new Pravougaonik (5, "Kvadrat");
		
		System.out.println(p1.getA());
		System.out.println(p1.getB());
		System.out.println(p2.getA());
		System.out.println(p2.getB());
		System.out.println(p1.ispisPravougaonika());
		System.out.println(p2.ispisPravougaonika());

	}

}
