package Esercizio2;

public class App2 {

	public static void main(String[] args) {
		int numeroIntero = 15;

		switch (numeroIntero) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;

		default:
			System.out.println("Errore, numero non conosco i numeri inferiori a 0 e superiori a 3");
			break;
		}
	}

}
