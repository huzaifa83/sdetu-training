package javaExercises;
import java.util.Arrays;
public class Exercise9Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,8,1,2};
		System.out.println("Original Array  " + Arrays.toString(numbers));
		System.out.println("New Array " + Arrays.toString((insert(numbers))));
	}

	public static int [] insert(int[] nums) {
		int insertPosition = 1;
		int newValue = 5;
		
		for (int i = nums.length- 1; i > insertPosition; i--) {
			nums[i] = nums[i-1];
		}
		nums[insertPosition] = newValue;
		return nums;
	}

}
