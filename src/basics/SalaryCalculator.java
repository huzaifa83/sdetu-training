package basics;

public class SalaryCalculator {

	public static void main(String [] args) {
		// Let's create a variable to define a career
		
		// Declare a variable 
		String career;
		System.out.println("Program is starting");
		
		// Defined a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
		double salary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		
	}
}
