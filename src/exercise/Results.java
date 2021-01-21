package exercise;

public class Results {

	public static void main(String[] args) {

		int p = 84;
		System.out.println(p);
		int c = 150;
		System.out.println(c);
		int b = 150;
		System.out.println(b);
		int t = p + b + c;
		System.out.println(t);
		int per = (t * 100) / 450;
		System.out.println(per);
		if (per < 60) {
			System.out.println("fail overall");
		} else if (((p * 100) / 150) < 60) {
			System.out.println("fail physics");
		} else if (((c * 100) / 150) < 60) {
			System.out.println("fail chemistry");
		} else if (((b * 100) / 150) < 60) {
			System.out.println("fail biology");
		} else {
			System.out.println("Pass, Well Done");
		}
	}

}
