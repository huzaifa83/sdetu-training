package javaExercises;

public class Exercise8MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public static int minMax(int [] nums) {
		int min = nums[0];
		int max = nums[0];
		//2812
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			} else if (nums[i] > max){
				max = nums[i];
			}
		}
		return min;
	}

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


}



