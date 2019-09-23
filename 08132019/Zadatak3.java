package domaci14;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitajNiz(niz);
		sortirajPoParnosti(niz);
		ispisiNiz(niz);

	}

	static void ucitajNiz(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi niz");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}

	static void sortirajPoParnosti(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] % 2 == 0 && a[i] % 2 != 0) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	static void ispisiNiz(int[] a) {
		System.out.println("Niz sortiran po parnosti je:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
