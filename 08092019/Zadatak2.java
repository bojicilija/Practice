package domaci12;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String?");
		String s = sc.nextLine();
		String str = "", str1 = "";
		for (int i = 0; i < s.length(); i++) {
			char znak = s.charAt(i);
			if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
				str += znak;
			} else if(str.length() > str1.length()) {
				str1=str1 + str;
				str="";
			}

		}
		System.out.print(str1);

	}
}