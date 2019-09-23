package domaci11;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] niz = new int[2][3];
		niz = ucitajNiz(niz);
		int[] maxmin = minMax(niz);
		ispisiNiz(maxmin);

	}

	static int[][] ucitajNiz(int[][] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Uneti 3 broja " + i + ". niza");
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = sc.nextInt();
			}
		}
		return niz;
	}

	static int[] minMax(int[][] a) {
		int max = a[0][0];
		int min = a[0][0];
		int[] minmax = new int[2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		minmax[0] = max;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		minmax[1] = min;
		return minmax;
	}

	static void ispisiNiz(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
