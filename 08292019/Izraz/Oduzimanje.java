package domaci22;

public class Oduzimanje extends BinarnaOperacija {

	public Oduzimanje(Izraz levi, Izraz desni) {
		super(levi, desni);

	}

	@Override
	public double izracunaj() {
		
		double vrednostLevog = levi.izracunaj();
		double vrednostDesnog = desni.izracunaj();
		return vrednostLevog - vrednostDesnog;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(levi.izracunaj()+ " - " +desni.izracunaj()+ " = " +izracunaj());
		return sb.toString();
	}

}
