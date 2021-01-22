package exercise;

public class UniqueSum  {
	public static void main(String[] args) {
		int num1 = 22;
		int num2 = 22;
		int num3=22;
		System.out.println(determineNumber(num1, num2 , num3));
	}

	public static int determineNumber(int num1, int num2, int num3) {
if (num1 == num2 && num1 == num3 && num2 == num3) {return (0);}
else if (num1 != num2 && num1!=num3 && num2 == num3) {return num1;}
else if (num2 != num1 && num2!=num3 && num1 == num3) {return num2;}
else if (num3 != num2 && num3!=num1 && num2 == num1) {return num3;}
else {return (num1+num2+num3);}

}
}