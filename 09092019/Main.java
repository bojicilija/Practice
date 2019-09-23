package domaci25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*Datum d2 = new Datum (dan,mesec,godina);Datum d = new Datum (14, 01, 1999);
		Datum d1 = new Datum (15,01,1994);
		OsobaD o1 = new OsobaD ("Pera", "Peric", "Kraljevacka 32.", d);
		OsobaJMBG o2 = new OsobaJMBG ("Petar", "Petrovic", "Vitanovacka 22", "2902984110235");
		
		System.out.println(o1);
		System.out.println(o1.numeroloskiBroj());
		System.out.println(o1.metabolizam(d1));
		System.out.println(o2);
		System.out.println(o2.numeroloskiBroj());
		System.out.println(o2.metabolizam(d1));*/
		
		
		
		System.out.println("Broj objekata:");
		int br = sc.nextInt();
		Osoba [] o = new Osoba [br];
		for(int i=0; i<br;i++) {
			System.out.println("Ime?");
			String ime = sc.next();
			System.out.println("Prezime?");
			String pr = sc.next();
			System.out.println("Adresa?");
			String adr = sc.next();
			System.out.println("1 za datum rodj., 2 za jmbg.");
			int n =sc.nextInt();
			switch(n) {
			case 1: 
				System.out.println("Unesite dan");
				int dan = sc.nextInt();
				System.out.println("Unesite mesec");
				int mesec = sc.nextInt();
				System.out.println("Unesite godinu");
				int godina = sc.nextInt();
				Datum d2 = new Datum (dan,mesec,godina);
				o[i] = new OsobaD(ime, pr, adr, d2);
				break;
				
			case 2:
				System.out.println("Unesite jmbg");
				String jmbg = sc.next();
				o[i]=new OsobaJMBG(ime,pr,adr,jmbg);
			}
		}
		System.out.println("Danasnji datum");
		System.out.println("Unesite dan");
		int dan = sc.nextInt();
		System.out.println("Unesite mesec");
		int mesec = sc.nextInt();
		System.out.println("Unesite godinu");
		int godina = sc.nextInt();
		Datum d2 = new Datum (dan,mesec,godina);
		for(int i=0;i<o.length;i++) {
			if(o[i] instanceof OsobaD) {
			System.out.println(o[i]);
			System.out.println("Numeroloski broj: "+((OsobaD)o[i]).numeroloskiBroj());
			System.out.println("Metabolizam: "+((OsobaD)o[i]).metabolizam(d2)+ "\n");
			}
			if(o[i] instanceof OsobaJMBG) {
				System.out.println(o[i]);
				System.out.println("Numeroloski broj: "+((OsobaJMBG)o[i]).numeroloskiBroj());
				System.out.println("Metabolizam: "+((OsobaJMBG)o[i]).metabolizam(d2)+ "\n");
				}
		}

	}

}
