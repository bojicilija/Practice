package devetidomaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		System.out.println("Aritmeticka sredina je: " +sredina(a,n));

	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi elemente: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	static float sredina(int[] niz, int n) {
		float asred=0;
		for (int i = 0; i < niz.length; i++) {
			asred+=niz[i];
		}
		asred/=n;
		return asred;
	}

}
