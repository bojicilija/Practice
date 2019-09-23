package domaci11;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec");
		String s = sc.nextLine();
		System.out.println("char?");
		char c = sc.next().charAt(0);
		System.out.println(brojKaraktera(s, c));

	}

	static int brojKaraktera(String s, char c) {
		int br = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				br++;
			}
		}
		return br;
	}

}
