package javaExercises;

public class Exercise3ChecktofindValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {2,1,20,10,2, 3, 5};
		int number = 3;
		System.out.println("The number in the array is " + checkValue(numbers, number));
	}
	
	
	public static boolean checkValue(int[] nums, int item) {
		for (int i = 0; i < nums.length; i++) {
			if (item == nums[i]) {
				System.out.println("The number that is in the array is " + item);
				return true;
			}
		}	
		System.out.println("The number that is not in the array is " + item);
		return false;
	}

}
