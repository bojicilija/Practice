package domaci27;

import java.util.ArrayList;

public class Paket extends Tovar {

	private ArrayList<Tovar> tovar = new ArrayList<Tovar>();
	
	
	@Override
	public String vrsta() {
		return this.getClass().getSimpleName().toLowerCase();
		//return "paket";
	}

	@Override
	public double tezina() {
		double sum=0;
		for(Tovar t : tovar) {
			if(t!=null) {
				sum+=t.tezina();
			}
		}
		return sum;
	}
	
	public void dodaj(Tovar t) {
		if(t!= null) {
			tovar.add(t);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		String com = "";
		sb.append(vrsta()+"[");
		for(Tovar t : tovar) {
			if(t!=null) {
				sb.append(com).append(t.vrsta());
				com = ", ";
			}
		}
		sb.append("]("+tezina()+")");
		return sb.toString();
	}
}
