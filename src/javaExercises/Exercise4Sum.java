package javaExercises;

public class Exercise4Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,1,20,10,2};
		System.out.println("The total of the array is " + sum(numbers));
	}
		
	public static int sum(int [] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;
	}
}
