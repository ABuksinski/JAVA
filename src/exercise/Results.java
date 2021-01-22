package exercise;

public class Results {

	public static void main(String[] args) {
		int phys = 100;
		int chem = 100; 
		int bio = 100;
		System.out.println(displayResults(phys, chem, bio));
		System.out.println(percentageResults(phys, chem, bio));
	}

	public static String displayResults(int phys, int chem, int bio) {
		String results = "Scores\r\n";
		results += "Biology: " + bio + "/150\r\n";
		results += "Chemistry: " + chem + "/150\r\n";
		results += "Physics: " + phys + "/150\r\n";
		results += "Total: " + (bio + chem + phys) + "/450\r\n";
		return results;
	}
	public static double percentageResults(int phys, int chem, int bio) {
		double percentage = ( 100 * ( bio + chem + phys ) ) / 450;
		return percentage;
		
		
		
	}
}
