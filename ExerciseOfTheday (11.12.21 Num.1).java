/* 11/12/2021
Write a program that will take the sum of the first and second to last digit of a 5 digit number
*/

import java.util.Scanner;

public class ExcercisesOftTheDay {

	public static void main(String[] args) {

		int MainNumber, first, second, SumOfDigits; // Initialize vars.

		System.out.print("Enter a 5 digit number: "); // ask for an input
		Scanner keyboard = new Scanner(System.in);
		MainNumber = keyboard.nextInt(); // identify a keyboard object and take an user input
		keyboard.close();

		if (MainNumber > 99999 || MainNumber < 10000) { // make sure that the input is a valid one. if not, end the
														// program.
			System.out.print("Invaild Input");
			System.exit(0);
		}

		first = MainNumber / 10000; // Find the placement of the 1st digit.
		first = first % 10000; // Then by getting the remainder of the said digit, get the value of digit (Ex.
								// 30000 vs. 3)

		second = MainNumber / 10; // Find the placement of the 2nd to last digit.
		second = second % 10; // Then by getting the remainder of the said digit, get the value of digit (Ex.
								// 30 vs. 3)

		SumOfDigits = first + second; // calculate the sum of the digits

		System.out.print("The sum of the first and second to last digit of " + MainNumber + " equals: " + SumOfDigits); // output the sum of the digits.

	}

}
