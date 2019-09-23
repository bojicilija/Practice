package domacii29;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MicroDVD {
	private String fajl;
	private ArrayList<String> ispis;

	public MicroDVD(String fajl) {
		this.fajl=fajl;
		ispis = new ArrayList<String>();
	}
	
	public ArrayList<String> getIspis(){
		return this.ispis;
	}

	public ArrayList<String> microDvdtoSubRip() {

		int id = 1;
		ArrayList<String> titleSrt = new ArrayList<String>();
		for (String micro : ucitajFajl.ucitaj(fajl)) {
			int min = 0, min1 = 0;
			int sat = 0, sat1 = 0;
			double sek = 0, sek1 = 0;
			String text = micro;
			
			text = text.replaceAll("\\{\\d+\\}", "");

			text = text.replace("|", "\n");

			String s[] = micro.split("[\\{}]");

			sek = Double.parseDouble(s[1]) / 25;

			while (sek >= 60) {
				sek -= 60;
				min++;
			}
			while (min >= 60) {
				min -= 60;
				sat++;
			}
			sek1 = Double.parseDouble(s[3]) / 25;
			while (sek1 >= 60) {
				sek1 -= 60;
				min1++;
			}
			while (min1 >= 60) {
				min1 -= 60;
				sat1++;
			}
			String strMin = "";
			String strMin1 = "";
			String sec = String.format("%.3f", sek);
			String sec1 = String.format("%.3f", sek1);
			strMin += min;
			strMin1 += min1;

			if (sek < 10)
				sec = "0" + String.format("%.3f", sek);
			if (sek1 < 10)
				sec1 = "0" + String.format("%.3f", sek1);
			if (min < 10)
				strMin = "0" + min;
			if (min < 10)
				strMin1 = "0" + min1;

			sec = sec.replace(".", ",");
			sec1 = sec1.replace(".", ",");
			String title = "";

			title += id + "\n0" + sat + ":" + strMin + ":" + sec;
			title += " --> 0" + sat1 + ":" + strMin1 + ":" + sec1 + "\n";
			text = text.replace("{Y:i}", "<i>");
			if (text.indexOf('<') >= 0 && text.indexOf('>') >= 0) {
				title += text + "</i>\n\n";
			} else
				title += text + "\n\n";

			titleSrt.add(title);
			id++;
		}
		ispis.addAll(titleSrt);

		FileWriter fw = null;
		try {
			fw = new FileWriter("KonvertovanSubRip.srt");
			for (String titl : titleSrt) {
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

		return titleSrt;
	}

	public void ispisiKonvertovanMicroDVD(ArrayList<String> list) {

		for (String s : list) {
			System.out.println(s);
		}
	}

}
