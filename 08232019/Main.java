package domaci19;

public class Main {

	public static void main(String[] args) {
		String [] lista= {"Matematika", "Fizika", "Hemija"};
		String [] lista1= {"Sociologija", "Etika", "Pravo"};
		Asistent a1 = new Asistent ("Marko", "Petrovic", 1995, 2017, 60000, "Matematika", lista, "Matematika" );
		Profesor p1 = new Profesor ("Petar", "Markovic", 1966, 1995, 90000, "Sociologija", lista1, "Magistar");
		System.out.println(a1);
		System.out.println(p1);

	}

}
