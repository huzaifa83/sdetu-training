package basics;

public class NumbersCalc {

	public static void main(String [] args) {
		System.out.println("Program is starting");
		// The functions will be called in the main function 
		printName();
		int numberA = 10;
		int numberB = 20;
		addNumbers(numberA, numberB);
		multipleNumbers(numberA, numberB);
		int product = multipleNumbers(numberA, numberB);
		System.out.println("The product of numbers " + numberA + " and " + numberB + " is " + product);
	}
	
	static void printName(){
		System.out.println("My name is Huzaifa.");
	}
	
	static void addNumbers(int numA, int numB) {
		int sum = numA + numB;
		System.out.println("The sum of numbers " + numA + " and " + numB + " is " + sum);
	}
	
	
	static int multipleNumbers(int valA, int valB) {
		int product = valA * valB;
		return product; 
	}
	
}
