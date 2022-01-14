/*Q1. Take 10 numbers as input from the console and find how many of those are even and odd numbers . 
 * Finally print the no of even and odd numbers entered 
 */

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start the counter with inital value of 0");
		int counter = sc.nextInt(); // Input from console

		while (counter <= 10) {

			System.out.println("count " + counter + " Enter a number");

			System.out.println("Enter a number to check even or odd");

			int num = sc.nextInt(); // While in the Loop. Ask to input a number at every iteration

			if (num % 2 == 0) {
				System.out.println(num + " is even number: ");
			} else {
				System.out.println(num + " is odd number: ");
			}
			counter++;

		}

	}

}
