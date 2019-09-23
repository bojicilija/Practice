package domaci12;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("String?");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String p="";
		for(int i=s.length()-1;i>=0;i--) {
			p+=s.charAt(i);
		}
		if(s.equals(p))System.out.println("Uneta rec jeste palindrom");
		else System.out.println("Uneta rec nije palindrom");

	}

}
