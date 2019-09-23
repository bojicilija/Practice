package domaci22;

public class Main {

	public static void main(String[] args) {
		Broj b2 = new Broj(2);
		 Broj b10 = new Broj(10);
		 Broj bn11 = new Broj(-11);
		 Broj b20 = new Broj(20);
		
		 Sabiranje s1 = new Sabiranje(b2, b10);
		 Oduzimanje o1 = new Oduzimanje(s1, bn11);
		 Sabiranje s2 = new Sabiranje(o1, b20);
		 
		 System.out.println(s1);
		 System.out.println(o1);
		 System.out.println(s2);
		 System.out.println("Rezultat je: "+s2.izracunaj());
		 
		 
		 System.out.println("\n--------------------------");
		 System.out.println();
		 
		 
		  Promenljiva p0 = new Promenljiva("x1", 10);
		  Promenljiva p1 = new Promenljiva ("x2", 20);
		  Sabiranje s3 = new Sabiranje(b2, p0);
		  Oduzimanje o2 = new Oduzimanje(s1, bn11);
		  Sabiranje s4 = new Sabiranje(o1, p1);
		  
		  System.out.println(p0);
		  System.out.println(p1);
		  System.out.println(s3);
		  System.out.println(o2);
		  System.out.println(s4);
		 
		  System.out.println("Rezultat je: " +s2.izracunaj());

	}

}
