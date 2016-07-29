package Day3;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an integer.");
		firstNum = scan1.nextInt();
		scan1.nextLine();

		System.out.println("Enter a second integer.");
		secondNum = scan1.nextInt();
		scan1.nextLine();

		if (firstNum < secondNum) {
			System.out.println("The smaller is " + firstNum + ".");
			System.out.println("Enter an integer.");
			firstNum = scan1.nextInt();
		} else {
			System.out.println("The smaller number is " + secondNum + ".");
		}
		scan1.close();
	}
	

	// if x < y, return x
	// else if y < x, return y

	// TODO Auto-generated method stub

}
