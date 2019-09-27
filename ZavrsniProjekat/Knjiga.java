package knjiga;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Knjiga {

	protected HashMap<String, Integer> reci;
	protected ArrayList<String> sveReci;
	protected HashMap<String, Integer> ponReci;
	protected ArrayList<String> noveReci;
	private String fileName;

	public Knjiga(String fileName) {
		this.fileName = fileName;
	}

	public void ucitajReciKnjige() {
		reci = new HashMap<String, Integer>();
		sveReci = new ArrayList<String>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String s = br.readLine();
			while (s != null) {
				if (s.isEmpty()) {
					s = br.readLine();
					continue;
				}
				s = s.replaceAll("[^a-zA-Z\\s+]", "");

				String[] split = s.split(" ");

				for (int i = 0; i < split.length; i++) {
					sveReci.add(split[i].toLowerCase()); // sve reci iz knjige
					if (reci.containsKey(split[i].toLowerCase())) { // reci iz knjige i njihova ponavljanja
						int count = reci.get(split[i].toLowerCase());
						count++;
						reci.replace(split[i].toLowerCase(), count);
					} else {
						reci.put(split[i].toLowerCase(), 1);
					}
				}
				s = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void pronadjiReci(HashMap<String, Integer> reciUrecniku) {
		noveReci = new ArrayList<String>();

		for (String s : reci.keySet()) {
			if (!reciUrecniku.containsKey(s)) {
				noveReci.add(s);
			}
		}
		System.out.println("nove reci: " +noveReci.size());
	}

	public void prodnadjiPonavljaneReci(HashMap<String, Integer> reciURecniku) {
		ponReci = new HashMap<String, Integer>();

		for (String s : sveReci) {
			if (reciURecniku.containsKey(s)) {
				if (ponReci.containsKey(s)) {
					int count = ponReci.get(s);
					count++;
					ponReci.replace(s, count);
				} else {
					ponReci.put(s, 1);
				}
			}
		}
	}

	public HashMap<String, Integer> pronadjiNajcesceReci() {
		HashMap<String, Integer> najcReci = new HashMap<String, Integer>();

		List<Integer> lista = new ArrayList<Integer>(ponReci.values());
		Collections.sort(lista, Collections.reverseOrder());
		List<Integer> top = lista.subList(0, 20);
		System.out.println("\n20 najcescih:\n");
		for (Integer n : top) {

			for (Entry<String, Integer> entry : ponReci.entrySet()) {
				if (entry.getValue().equals(n)) {
					najcReci.put(entry.getKey(), n);
					System.out.println(entry.getKey() + " " + n);
				}
			}
		}
		return najcReci;
	}

	public void dodajReciUFajl(HashMap<String, Integer> reciURecniku) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (String s : reciURecniku.keySet()) {
			map.put(s, null);
		}

		for (String s : noveReci) {
			map.put(s, null);
		}
		try {
			FileWriter fw = new FileWriter("NoveReci");
			for (String s : map.keySet()) {
				fw.write(s + "\n");
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
