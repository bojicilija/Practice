package desetidomaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		int[] a = new int[n];
		ucitajNiz(a);
		unetiBroj(a);

	}

	static void ucitajNiz(int[] niz) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesi elemente: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i]=sc.nextInt();
			
		}
	}
	
	static void unetiBroj(int[] niz) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesite broj:");
		int br=sc.nextInt();
		for(int i=0;i<niz.length;i++) {
			if(br==niz[i]) {
				System.out.println("Broj " +br+ " postoji u nizu.");
				return;
			}
		}
		System.out.println("Broj " +br+ " ne postoji u nizu.");
	}
	

}
