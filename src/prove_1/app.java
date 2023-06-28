package prove_1;

import entities.Rectangle;

public class app {

	public static void main(String[] args) {
		int x = 10, y = 30;

		boolean test = true;

		if (test) {
			System.out.println("Test passato");
		} else {
			System.out.println("Test non passato");
		}

		if (x > y) {
			System.out.println("X è maggiore di Y");
		} else if (x == y) {
			System.out.println("X è uguale a Y");
		} else {
			System.out.println("X è minore di Y");
		}

		System.out.println(x <= y ? "X è minore o uguale a Y" : "X è maggiore di Y");

		System.out.println(testNumbers(10, 20, 30));

		String favouriteColour = "red";
		switch (favouriteColour) {
		case "red":
			System.out.println("Il colore è rosso");
			break;
		case "blue":
			System.out.println("Il colore è blu");
			break;
		case "green":
			System.out.println("Il colore è verde");
			break;

		default:
			System.out.println("No color");
			break;
		}

		int z = (x > y) ? -100 : 100;

		switch (z) {
		case 30:
			x++; // eseguo variabile e incremento
			break;

		case -100:
			System.out.println("Il numero è -100");
			break;

		case 100:
			System.out.println("Il numero è 100");
			++x; // incremento e eseguo variabile
			break;
		default: // default può essere posizionato dove vogliamo avrà effetto solamente dopo la
					// verifica di tutti gli altri valori
			break;
		}

		int a = 6, b = 3;

		while (b <= a + 6) {
			System.out.println(b);
			b += 3;
		}
		do {
			System.out.println(a++);
		} while (a < 10);

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue; // continue non fa uscire dal loop ma passa a quello successivo -> nel nostro
							// caso stamperà solamente i numeri dispari perché quando pari passa a loop
							// successivo
			System.out.println(i);
		}

		// è possibile dare un label ad un ciclo per puntare il break ad un livello
		// preciso della ramificazione del ciclo
		esterno: for (int i = 1; i <= 5; i++) {
			if (i == 3)
				continue;

			for (int j = 1; j <= 5; j++) {
				if (j == 4)
					break esterno;
				System.out.println(j);
			}
			System.out.println(i);
		}

		Rectangle r1 = new Rectangle(12, 4.5);
		System.out.println(r1.getArea());
		Rectangle[] rectangles = { r1, new Rectangle(17.9, 2), new Rectangle(7.2, 15.2) };

		for (int i = 0; i < rectangles.length; i++) {
			System.out.printf("L'area del rettangolo è: %f Il perimetro del rettangolo è: %f \n",
					rectangles[i].getArea(), rectangles[i].getPerimeter());
		}

	}

	public static int testNumbers(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}

}
