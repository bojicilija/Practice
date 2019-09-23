package desetidomaci;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		if (duplikati(a) == true)
			System.out.println("Niz sadrzi duplikate.");
		else {
			System.out.println("Niz ne sadrzi duplikate.");
		}
	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	static boolean duplikati(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] == niz[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
