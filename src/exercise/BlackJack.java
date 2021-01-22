package exercise;

public class BlackJack {
	public static void main(String[] args) {
		int num1 = 22;
		int num2 = 22;
		System.out.println(determineNumber(num1, num2));
	}

	public static double determineNumber(int num1, int num2) {

		if (num1 <= 21 & num1 >= num2) {
			return num1;
		} else if (num2 <= 21 & num2 >= num1) {
			return num2;
		} else if (num2 > 21 & num1 <= 21) {
			return num1;
		} else if (num1 > 21 & num2 <= 21) {
			return num2;
		} else {
			return 0;
		}
	}
}