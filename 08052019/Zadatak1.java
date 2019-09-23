package devetidomaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		System.out.println(sumaBrojeva(a));
	}
	

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi elemente: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}
	

	static int sumaBrojeva(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			sum += niz[i];
		}
		return sum;
	}
}
