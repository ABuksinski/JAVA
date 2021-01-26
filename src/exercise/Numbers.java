package exercise;

public class Numbers {
	public static void main(String[] args) {
		int num = 95;
		int sum = 0;
		boolean lesshundred = true;
		System.out.println(method1(num, sum, lesshundred));
	}

	public static int method1(int num, int sum, boolean lesshundred) {
		while (lesshundred) {
			sum = sum + num % 10;
			num = num / 10;

			if (num > 99) {
				lesshundred = false;
			}
		}

		return sum;
	}
}
