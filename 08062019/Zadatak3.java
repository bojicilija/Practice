package desetidomaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		srednjaVrednost(a,n);

	}

	static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite elemente: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}
	
	static void srednjaVrednost(int[] niz,int n) {
		float sv=0;
		for(int i=0;i<niz.length;i++) {
			sv+=niz[i];
		}
		sv/=n;
		System.out.println("Srednja vrednost je " +sv);
		System.out.print("Brojevi veci od srednje vrednosti su: ");
		for(int i=0;i<niz.length;i++) {
			if(niz[i]>sv) {
				System.out.print(niz[i]+ " ");
			}
		}
	}

}
