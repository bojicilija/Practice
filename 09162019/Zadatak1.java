package domaci28;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Zadatak1 {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Svetlana", 19);
		m.put("Aleksa", 23);
		m.put("Katarina", 20);
		m.put("Jovica", 35);
		m.put("Bilja", 1);
		
		sortiraj(m);

	}

	public static void sortiraj(HashMap<String, Integer> mapa) {
		Map <String, Integer> map = new TreeMap <String, Integer>(mapa);
		
		for(Entry<String, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey()+ " " +map1.getValue());
		}
	}

}
