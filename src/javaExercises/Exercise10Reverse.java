package javaExercises;
import java.util.Arrays;
public class Exercise10Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {2,4,1,5};
		System.out.println("Orginal Array " + Arrays.toString(numbers));
		System.out.println("New Array " + Arrays.toString(reverse(numbers)));
	}
	
	public static int [] reverse(int[] nums) {
		for (int i = 0; i < nums.length/2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
					
		}
		return nums;
	}
}
