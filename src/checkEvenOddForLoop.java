import java.util.Scanner;

public class checkEvenOddForLoop {

	/*
	 * Q1. Take 10 numbers as input from console and find how many of those are even
	 * and odd numbers . Finally print the no of even and odd numbers entered .
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] numList = new int[10];

		for (int i = 0; i < numList.length; i++) {

			System.out.println("Enter num " + i);

			numList[i] = sc.nextInt(); // While in the Loop. Ask to input any number in every iteration

		}
		// Counter for total number of Even and Odd
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] % 2 == 0) {
				System.out.println(numList[i] + " is even number: ");
				evenCount++;
			} else {
				System.out.println(numList[i] + " is odd number: ");
				oddCount++;
			}
		}
		for (int i = 0; i < numList.length; i++) {
			System.out.println("Total even numbers :" + evenCount);
			System.out.println("Total Odd numbers :" + oddCount);
			break;
		}
	}

}
