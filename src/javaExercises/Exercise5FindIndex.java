package javaExercises;

public class Exercise5FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,1,20,10,2,3,5};
		int number = 8;
		System.out.println("The index number is " + findIndex(numbers, number));
	}

	public static int findIndex(int[] nums, int n){
		if (nums == null) {
			return -1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (n == nums[i]) {
				return i;
			} 
		}
		return -1;
	}

}
