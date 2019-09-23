package domaci14;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite N:");
		int n = sc.nextInt();
		while (n >= 37) {
			n = sc.nextInt();
		}
		int k = tribonacci(n);
		System.out.println(n + ". Tribonacijev broj je " + k);

	}

	static int tribonacci(int n) {
		if (n == 0)
			return 0;

		else if (n == 1 || n == 2)
			return 1;

		else
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

	}

}
