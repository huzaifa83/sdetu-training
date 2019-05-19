package javaExercises;
import java.util.Arrays;
public class Exercise6RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numbers = {2,1,20,10,2, 3, 5};
		System.out.println("The new arrary is " + Arrays.toString(removeElement(numbers)));
		
		
	}

	public static int[] removeElement(int[] nums) {
		int removeIndex = 1;
		for (int i = removeIndex; i < nums.length-1; i++) {
			nums[i] = nums[i + 1];
		}
		return nums;
	}
}
