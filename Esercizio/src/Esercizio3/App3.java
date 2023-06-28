package Esercizio3;

import java.util.Scanner;

public class App3 {
	static String myString;

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		do {

			System.out.println("Inserire una stringa: \n(Premere :q per interrompere!)");
			myString = myObj.nextLine();
			String[] chars = myString.split("");
			String newString = String.join(",", chars);
			System.out.println(newString);

			// Prima iterazione senza join
			// for (int i = 0; i < chars.length; i++) {
			// System.out.print(chars[i] + ",");
			// }

		} while (!myString.equals(":q"));
		myObj.close();

	}

}
