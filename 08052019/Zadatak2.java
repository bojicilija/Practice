package devetidomaci;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] c = new int[2];

		ucitajNiz(a);
		c = minMax(a);
		ispis(c);

	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi elemente: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}

	}

	static int[] minMax(int[] niz) {
		int a=niz[0];
		int b=niz[0];

		for (int i = 0; i < niz.length-1; i++) {
			if (niz[i+1] > a) {
				a = niz[i+1];
			}
			else if (niz[i+1] < b) {
				b = niz[i+1];
			}
		}
		
		int[] c = new int[2];
		c[0] = a;
		c[1] = b;
		return c;
	}
	
	static void ispis(int [] niz) {
		System.out.println(niz[0]);
		System.out.println(niz[1]);
	}
}