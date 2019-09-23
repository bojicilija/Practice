package domaci22;

public class Sabiranje extends BinarnaOperacija {

	public Sabiranje(Izraz levi, Izraz desni) {
		super(levi, desni);

	}

	@Override
	public double izracunaj() {

		double vrednostLevog = levi.izracunaj();
		double vrednostDesnog = desni.izracunaj();
		return vrednostLevog + vrednostDesnog;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(levi.izracunaj()+ " + " +desni.izracunaj()+ " = " +izracunaj());
		return sb.toString();
	}

}
