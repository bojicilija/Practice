package domaci16;

public class Main {

	public static void main(String[] args) {
		Tacka [] nizTacaka = new Tacka [10];
		for (int i = 0; i < nizTacaka.length; i++) {
			nizTacaka[i] = new Tacka(Math.random()*200-100, Math.random()*200-100);
		}
		
		Trougao t1 = new Trougao (nizTacaka[0], 10, 11 ,16);
		Trougao t2 = new Trougao (nizTacaka[5], 10, 11 ,19);
		Trougao t3 = new Trougao (nizTacaka[2], 9, 25 ,30);
		t1.ispisTrougla(t1);
		t2.jeJednakokraki();
		t3.ispisTrougla(t3);
		
		
		Trougao t4 = new Trougao (nizTacaka[2], 14, 40 ,50);
		t3.istaPocetnaTacka(t2, t4);

	}

}
