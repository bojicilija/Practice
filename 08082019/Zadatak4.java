package domaci11;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] niz = { { 5, 7, 8 }, { 7, 9, 3, 1, 2 }, { 10, 5, 2, 3 } };
		int n;
		System.out.println("N?");
		n = sc.nextInt();
		System.out.println(sumaReda(niz, n));
	}

	static int sumaReda(int[][] a, int n) {
		int sum = 0;
		for (int i = 0; i < a[n].length; i++) {
			sum += a[n][i];
		}
		return sum;

	}

}
