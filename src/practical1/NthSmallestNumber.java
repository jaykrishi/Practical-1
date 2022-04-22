package practical1;

import java.util.Random;
import java.util.Scanner;

public class NthSmallestNumber {

	public static void main(String[] args) {
		int input;
		int[] myarraylist = new int[500];

		getRandom(myarraylist); // Create random numbers.
		arraySort(myarraylist); // Sort random numbers.

		do {
			System.out.print("Please enter a number between 1 and 500: ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
		} while (input < 1 || input > 500);

		// random numbers to string.
		String result = "";
		for (int j = 0; j < myarraylist.length; j++) {
			result += " " + myarraylist[j];
		}

		// Print all random number.
		System.out.println("The Numbers are" + result);

		// Print user input nth number.
		if (input == 1) {
			System.out.println("The " + input + "st number is " +  myarraylist[input-1]+ ".");
		} else if (input == 2) {
			System.out.println("The " + input + "nd number is " +  myarraylist[input-1] + ".");
		} else if (input == 3) {
			System.out.println("The " + input + "rd number is " +  myarraylist[input-1] + ".");
		} else {
			System.out.println("The " + input + "th number is " +  myarraylist[input-1] + ".");
		}
	}

	// Generate 500 random number
	public static void getRandom(int[] arraylist) {
		Random random = new Random();
		for (int i = 0; i < arraylist.length; i++) {
			arraylist[i] = random.nextInt(1001 - 100) + 100;
			;
		}

	}

	// Array sort
	public static void arraySort(int[] arraylist) {
		int temp;
		for (int i = 1; i < arraylist.length; i++) {
			for (int j = 0; j < arraylist.length - i; j++) {
				if (arraylist[j] > arraylist[j + 1]) {
					temp = arraylist[j];
					arraylist[j] = arraylist[j + 1];
					arraylist[j + 1] = temp;
				}
			}
		}
	}

	

}
