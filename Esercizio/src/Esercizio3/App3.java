package Esercizio3;

import java.util.Scanner;

public class App3 {
	static String myString;

	public static void main(String[] args) {
		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Inserire una stringa: ");
			myString = myObj.nextLine();
			String[] chars = myString.split("");
			for (int i = 0; i < chars.length; i++) {
				System.out.println(chars[i] + ",");
			}

		} while (!myString.equals(":q"));

	}

}
