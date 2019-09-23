package domacii29;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SubRip {

	private String fajl;
	private ArrayList<String> ispis;

	public SubRip(String subRipFajl) {
		this.fajl = subRipFajl;
		ispis = new ArrayList<String>();
	}
	
	public ArrayList<String> getIspis(){
		return this.ispis;
	}
	

	public ArrayList<String> subRipToMicroDvd() {
		String text="";
		ArrayList<String> title = new ArrayList<String>();
		for (String sub : ucitajFajl.ucitaj(fajl)) {
			String sb="";

			sub = sub.replaceAll("<i>", "{Y:i}");
			sub = sub.replace("</i>", "");

			if (sub.contains("-->") && sub.matches(".*[a-z].*") == false) {

				String[] s = sub.split("--> ");
				s[0] = s[0].replace(",", ".");
				s[1] = s[1].replace(",", ".");
				String[] s1 = s[0].split(":");
				String[] s2 = s[1].split(":");

				double sek = Double.parseDouble(s1[2]);
				int min = Integer.parseInt(s1[1]);
				int sat = Integer.parseInt(s1[0]);
				while (min != 0) {
					sek += 60;
					min--;
				}
				while (sat != 0) {
					sek += 3600;
					sat--;
				}
				int frame = (int) (sek * 25);

				double sek1 = Double.parseDouble(s2[2]);
				int min1 = Integer.parseInt(s2[1]);
				int sat1 = Integer.parseInt(s2[0]);
				while (min1 != 0) {
					sek1 += 60;
					min1--;
				}
				while (sat1 != 0) {
					sek1 += 3600;
					sat1--;
				}
				int frame1 = (int) (sek1 * 25);

				sb += "\n{" + frame + "}{" + frame1 + "}";
				
			}
			if (sub.matches(".*[a-z].*") || sub.matches(".*[A-Z].*")) {
				sb += sub + " ";
			}
			text+=sb;
		}
		title.add(text);
		ispis.addAll(title);
		FileWriter fw = null;
		try {
			fw = new FileWriter("KonvertovanMicroDVD.txt");
			for (String titl : title) {
				fw.write(titl);
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return title;
	}
	
	public void ispisiKonvertovanSubRip(ArrayList<String> list) {

		for (String s : list) {
			System.out.println(s);
		}
	}
}
