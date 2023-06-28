package Esercizio4;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Inserire un numero intero: ");
		int myNumb = myObj.nextInt();
		for (int i = myNumb; i > 0; i--) {
			myNumb = myNumb - 1;
			System.out.println(myNumb);
		}

		myObj.close();

	}

}
