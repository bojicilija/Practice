package desetidomaci;

import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesite n: ");
		int n=sc.nextInt();
		System.out.println("Unesite gornju granicu: ");
		int gg=sc.nextInt();
		int[] a = new int[n];
		ispisiNiz(a,gg);
		unesiBroj(a);

	}
	
	
	static void ispisiNiz(int[] niz,int gornjaGranica) {
		Random r= new Random();
		for(int i=0;i<niz.length;i++) {
			int broj = r.nextInt(gornjaGranica);
			niz[i]=broj;
			System.out.println(niz[i]+ " ");
		}
		
	}
	
	static void unesiBroj(int[] niz) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesite broj: ");
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
