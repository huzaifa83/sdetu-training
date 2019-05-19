package javaExercises;
import java.util.Arrays;

public class Exercise11Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {2,4,5,5,8};
		System.out.println( Arrays.toString(duplicates(myArray)));
	}
	
	public static int [] duplicates(int[] nums) {
		for (int i = 0; i < nums.length- 1; i++) {
			for (int j = i+1; j< nums.length; j++) {
				if ((nums[i] == nums[j]) && (i != j)) {
					System.out.println("Duplicate element " + nums[j]);
				}
			}
		}
		return nums;
	} 
}

