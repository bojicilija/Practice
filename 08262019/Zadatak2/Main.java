package domaci20;

public class Main {

	public static void main(String[] args) {
		List l1 = new List (3, "List pod rednim brojem 3");
		List l2 = new List (4, "List pod rednim brojem 4");
		List l3 = new List (1, "List pod rednim brojem 1");
		List l4 = new List (2, "List pod rednim brojem 2");
		List l5 = new List (5, "List pod rednim brojem 5");
		List l6 = new List (6, "List pod rednim brojem 6");
		
		
		Knjiga k1 = new Knjiga ("Lotr");
		k1.dodajList(l2);
		k1.dodajList(l1);
		k1.dodajList(l4);
		k1.dodajList(l3);
		k1.dodajList(l4);
		k1.dodajList(l3);
		k1.dodajList(l5);
		k1.dodajList(l6);
	
		
		Knjiga k2 = new Knjiga ("Metro");
		k2.dodajList(l4);
		k2.dodajList(l2);
		k2.dodajList(l1);
		k2.dodajList(l3);
		
		Polica p1 = new Polica ();
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k2);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(p1);
		

	}

	

}
