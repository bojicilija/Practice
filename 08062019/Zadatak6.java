package desetidomaci;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata prvog niza: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		niz1(a);
		System.out.println("Unesite broj elemenata drugog niza: ");
		int m = sc.nextInt();
		int[] b = new int[m];
		niz2(b);
		int[] c = new int[n + m];
		c = niz3(a, b);
		c = sortirajNiz(c);
		ispisiNiz(c);

	}

	static void niz1(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente prvog niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	static void niz2(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente drugog niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	static int[] niz3(int[] niz1, int[] niz2) {
		int niz3[] = new int[niz1.length + niz2.length];
		for (int i = 0, k = 0; i < niz1.length + niz2.length; i += 2, k++) {
			for (int a = 0; a < niz1.length + niz2.length; a++) {
				niz3[i] = niz1[k];
				niz3[i + 1] = niz2[k];
			}
		}
		return niz3;
	}

	static int[] sortirajNiz(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < niz[i]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}

			}

		}
		return niz;
	}

	static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}
}
