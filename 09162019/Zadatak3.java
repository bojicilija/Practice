package domaci28;

import java.util.ArrayList;
import java.util.HashMap;

public class Zadatak3 {

	public static void main(String[] args) {
		
		ArrayList<String> svaDeca = new ArrayList<>();
		svaDeca.add("Marko");
		svaDeca.add("Ana");
		svaDeca.add("Sara");
		svaDeca.add("Jovana");
		svaDeca.add("Dejana");
		svaDeca.add("Tamara");

		ArrayList<String> dobroDelo = new ArrayList<String>();
		dobroDelo.add("Marko");
		dobroDelo.add("Jovana");
		dobroDelo.add("Marko");
		dobroDelo.add("Tamara");
		dobroDelo.add("Sara");
		dobroDelo.add("Marko");
		dobroDelo.add("Jovana");
		dobroDelo.add("Dejana");
		dobroDelo.add("Marko");

		System.out.println(decjaDobraDela(svaDeca, dobroDelo));

	}

	public static HashMap<String, Integer> decjaDobraDela(ArrayList<String> svaDeca, ArrayList<String> dobroDelo) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < svaDeca.size(); i++) {
			int delo = 0;
			for (int j = 0; j < dobroDelo.size(); j++) {
				if (svaDeca.get(i).equals(dobroDelo.get(j))) {
					delo++;
				}
			}
			if (delo >= 1) {
				m.put(svaDeca.get(i), delo);
			}
		}
		return m;

	}

}
