package exercise;

public class flowchart {
	private static boolean notBool;

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		setNotBool(false);
		
		if (setNotBool(true)) {
			int add = num1 + num2;
			System.out.println(add);
		} else {
			int multiply = num1 * num2;
			System.out.println(multiply);
		}
	}

	public static boolean isNotBool() {
		return notBool;
	}

	public static boolean setNotBool(boolean notBool) {
		flowchart.notBool = notBool;
		return notBool;
	}
}