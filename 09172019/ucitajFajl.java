package domacii29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ucitajFajl {
	
	public ucitajFajl() {
		
	}
	
	
	public static ArrayList<String> ucitaj(String fajl) { 
		ArrayList<String> titl = new ArrayList<String>();
		BufferedReader br = null;
		String s="";
		try {
			br = new BufferedReader(new FileReader(fajl));
			
			while ((s = br.readLine()) != null) {
				titl.add(s);
				//System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (br!= null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return titl;
	}
	
	

}
