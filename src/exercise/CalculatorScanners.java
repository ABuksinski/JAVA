package exercise;

import java.util.Scanner;

public class CalculatorScanners {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner method = new Scanner(System.in);
		System.out.println("Enter method: \n addition - 1, \n subtraction - 2 \n multiplication - 3 \n division - 4");

		int maths = method.nextInt();
		System.out.println("Method used: " + maths);
		System.out.println("Result: " + calculator(maths));
	}

	@SuppressWarnings("resource")
	public static int calculator(int maths) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter Number 1: ");

		int number1 = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		System.out.println("EnterNumber 2: ");

		int number2 = num2.nextInt();
		if (maths == 1) {
			return (number1 + number2);
		} else if (maths == 2) {
			return (number1 - number2);
		} else if (maths == 3) {
			return (number1 * number2);
		} else if (maths == 4) {
			return (number1 / number2);
		} else {
			return (0);
		}

	}
}
