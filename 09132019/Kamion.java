package domaci27;

import java.util.ArrayList;

public class Kamion {
	
	private String regBroj;
	private ArrayList<Tovar>tovar;
	private double nosivost;
	private double teret;
	
	public Kamion (String regBroj, double nosivost) {
		this.regBroj=regBroj;
		this.nosivost=nosivost;
		tovar = new ArrayList<Tovar>();
	}
	
	public boolean stavi(Tovar t) {
		if(t!=null && (teret + t.tezina()) <= nosivost) {
			tovar.add(t);
			teret+=t.tezina();
			return true;
		}
		else return false;
	}
	
	public void skini() {
		tovar.remove(tovar.size());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(regBroj+"("+teret+"/"+nosivost+")");
		for(Tovar t : tovar) {
			if(t!=null) {
				sb.append("\n\t"+t);
			}
		}
		return sb.toString();
	}

}
