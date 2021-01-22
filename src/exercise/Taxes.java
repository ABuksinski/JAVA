package exercise;

public class Taxes {

	public static void main(String[] args) {
		int salary = 25000;
		System.out.println(displayCategory(salary));
		System.out.println(taxAmout(salary));
	}

	public static String displayCategory(int salary) {
	if (0<=salary & salary <= 14999) {return "0% tax";}
	else if (15000<= salary & salary <= 19999) {return "10% tax";}
	else if (20000<= salary & salary <= 29999) {return "15% tax";}
	else if (30000<= salary & salary <= 44999) {return "20% tax";}
	 else
	{return "25% tax";}}

	public static double taxAmout(int salary) {
		
		if (0<=salary & salary <= 14999) {return (salary*0);}
		else if (15000<= salary & salary <= 19999) {return (salary*0.1);}
		else if (20000<= salary & salary <= 29999) {return (salary*0.15);}
		else if (30000<= salary & salary <= 44999) {return (salary*0.2);}
		 else
		{return (salary*0.25);}}

	}
