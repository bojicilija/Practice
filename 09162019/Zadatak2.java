package domaci28;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zadatak2 {

	public static void main(String[] args) {
		Integer[] niz = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		neparni(niz);
	}

	public static void neparni(Integer[] niz) {

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < niz.length; i++) {
			if (!m.containsKey(niz[i]) && niz[i] % 2 != 0) {
				m.put(niz[i], 1);
			} else if (niz[i] % 2 != 0) {
				m.put(niz[i], m.get(niz[i]) + 1);
			}
		}
		
		System.out.println(m);
		int a = (Collections.max(m.values()));
		
		for (Map.Entry<Integer, Integer> map : m.entrySet()) {
			if (map.getValue() == a) {

				System.out.println(map.getKey());

			}
		}
	}
}
