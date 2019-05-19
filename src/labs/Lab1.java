package labs;

public class Lab1 {

	public static void main(String[] args) {
		int input = 4;
		int [] numbers = {2,8,1,2};
		System.out.println("The total of your input " + input + " is " + sum(input));
		System.out.println("The factorial of your input " + input + "! is " +factorial(input));
		System.out.println("The minimum number in the array of your input  is "  + minimum(numbers));
		System.out.println("The maximum number in the array of your input  is "  + maximum(numbers));
		System.out.println("The average in the array of your input  is "  + average(numbers));
	}

// 1 Write a function that takes a value n returns the sum of numbers 1 to n
	
	public static int sum(int n) {
		int total = 0;
		for (int i = 0; i <=n; i++) {
			total +=  i;
	
		}
		return total;
	} 


// 2 Write a function that computes the factorial value

// //1! = 1*1
	//2! = 2*1
	//3! = 3*2*1
	//4! = 4*3*2*1
	//5! = 5*4*3*2*1

public static int factorial(int n) {
	
	if (n == 0) {
		return 1;
	} else if (n == 1){
		return 1;
	}
	else {
		return n*factorial(n-1); 
	}
  }

// Write 3 functions 
// A) Find minimum number in an array
public static int minimum(int [] nums) {
	int min = nums[0];
	//2812
	for (int i = 1; i < nums.length; i++) {
		if (nums[i] < min) {
			min = nums[i];
		}
	}
	return min;
}
// B) Find maximum number in an array
	public static int maximum(int [] nums) {
		int max = nums[0];
		//2812
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

// C) Find the average in an array 
	
	public static double average(int[] nums) {
		double total = 0.0;
		for(int i = 0; i<nums.length; i++) {
			total += i;
		}
		int count = nums.length;
		double average = total/count;
		return average;
	}



}
