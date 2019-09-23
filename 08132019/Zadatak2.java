package domaci14;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[7];
		System.out.println("Unesite niz A:");
		ucitajNiz(a);
		System.out.println("Unesite niz B:");
		ucitajNiz(b);
		if (podskup(a, b) == true) {
			System.out.println("Niz A jeste podskup niza B.");
		} else
			System.out.println("Niz A nije podskup niza B.");

	}

	static boolean podskup(int[] a, int[] b) {
		int br = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					br++;
					break;
				}
			}
		}
		if (br == a.length) {
			return true;
		} else
			return false;

	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

	}

}