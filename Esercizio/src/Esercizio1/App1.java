package Esercizio1;

public class App1 {

	public static void main(String[] args) {
		System.out.println(stringaPariDispari("Cos%6)8!") + "\n");
		System.out.println(annoBisestile(1600));

	}

	public static Boolean stringaPariDispari(String myString) {
		if (myString.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean annoBisestile(int myYear) {
		if (myYear % 4 == 0 && myYear % 100 != 0 || myYear % 100 == 0 && myYear % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
