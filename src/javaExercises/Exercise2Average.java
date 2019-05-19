package javaExercises;

public class Exercise2Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {20, 34, 18, 2, 5};
	
		System.out.println("The average of the array is " + avg(nums));
	}
	
	public static double avg(int[] num) {
		double total = 0.0;
		for(int i = 0; i <num.length; i++) {
			total += num[i];
		}
		int count = num.length;
		double average = total/count;
		return average;
	}

}
