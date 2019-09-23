package domaci13;

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// NIJE DOZVOLJENO MENJANJE MAIN FUNKCIJE!!!!!!!!!!!!!!
		// NIJE DOZOVLJENO MENJANJE POTPISA FUNKCIJA(POTPIS FUNKCIJE SE SASTOJI OD
		// POVRATNE VREDNOSTI, IMENA FUNKCIJE I PARAMETARA
		// DOZVOLJENO JE ALI NIJE POZELJNO NITI POTREBNO DEFINISATI I DODAVATI NOVE
		// FUNKCIJE

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenziju kvadratne matrice (n): ");
		int n = sc.nextInt();

		int[][] matrica = new int[n][n];
		generisiElementeMatrice(matrica, 9);
		System.out.println("Matrica izgleda ovako: ");
		ispisiMatricu(matrica);
		System.out.println();

		int[] elementiNaglavnoj = elementiNaGlavnojDijagonali(matrica);
		System.out.println("Elementi na glavnoj dijagonali su: ");
		if (elementiNaglavnoj != null)
			ispisiNiz(elementiNaglavnoj);
		else
			System.out.println("Greska u funkciji elementiNaGlavnojDijagonali");
		System.out.println();

		System.out.println("Elementi na sporednoj dijagonali su: ");
		int[] elementiNaSporednoj = elementiNaSporednojDijagonali(matrica);
		if (elementiNaSporednoj != null)
			ispisiNiz(elementiNaSporednoj);
		else
			System.out.println("Greska u funkciji elementiNaSporednojDijagonali");
		System.out.println();

		System.out.println("Elementi iznad glavne dijagonale su: ");
		ispisiElementeIznadGlavneDijagonale(matrica);
		System.out.println();

		System.out.println("Elementi ispod glavne dijagonale su: ");
		ispisiElementeIspodGlavneDijagonale(matrica);
		System.out.println();

		int[][] transponovanaMatrica = transponujMatricu(matrica);
		System.out.println("Transponovana matrica izgleda ovako: ");
		if (transponovanaMatrica != null)
			ispisiMatricu(transponovanaMatrica);
		else
			System.out.println("Greska u funkciji transponujMatricu.");
		System.out.println();

		System.out.println("Pre uklanjanja duplih elemenata niz izgleda ovako: ");
		ispisiNiz(elementiNaglavnoj);
		System.out.println();

		elementiNaglavnoj = ukloniElementeKojiSePonavljajuUnizu(elementiNaglavnoj);
		System.out.println("Nakon uklanjanja duplih elemenata niz izlgeda ovako: ");
		if (elementiNaglavnoj != null)
			ispisiNiz(elementiNaglavnoj);
		else
			System.out.println("Greska u funkcji ukloniElementeKojiSePonavljajuUnizu");

	}

	public static void generisiElementeMatrice(int[][] matrica, int gornjaGranica) {
		Random r = new Random();
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = r.nextInt(gornjaGranica);
			}
		}
	}

	public static int[] elementiNaGlavnojDijagonali(int[][] matrica) {
		int[] gd = new int[matrica.length];
		for (int i = 0, j = 0; i < matrica.length && j < matrica[i].length; i++, j++) {
			gd[i] = matrica[i][j];

		}
		return gd;
	}

	public static int[] elementiNaSporednojDijagonali(int[][] matrica) {
		int[] sd = new int[matrica.length];
		for (int i = matrica.length - 1, j = 0; i >= 0 && j < matrica[i].length; i--, j++) {
			sd[j] = matrica[i][j];
		}

		return sd;
	}

	public static int[][] transponujMatricu(int[][] matrica) {
		int brRed = matrica.length;
		int brKol = matrica[0].length;
		int[][] transpMatr = new int[brKol][brRed];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				transpMatr[j][i] = matrica[i][j];
			}
		}

		return transpMatr;
	}

	public static void ispisiElementeIznadGlavneDijagonale(int[][] matrica) {

		for (int i = 0; i < matrica.length - 1; i++) {

			for (int j = i + 1; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void ispisiElementeIspodGlavneDijagonale(int[][] matrica) {
		for (int i = 1; i < matrica.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void ispisiMatricu(int[][] matrica) {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void ispisiNiz(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();

	}

	public static int[] ukloniElementeKojiSePonavljajuUnizu(int[] niz) {
		
		return null;
	}

}
