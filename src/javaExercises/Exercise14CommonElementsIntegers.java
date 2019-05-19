package javaExercises;
import java.util.*;
public class Exercise14CommonElementsIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
		int [] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		
		System.out.println("Array1 : "+Arrays.toString(array1));
	       System.out.println("Array2 : "+Arrays.toString(array2));
		
		commonIntegers(array1, array2);
	}

	
	public static void commonIntegers(int [] num1, int [] num2) {
		
		HashSet<Integer> commons = new HashSet<>();
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i] == num2 [j]) {
					System.out.println("Common element " + num1[i]);
				}
			}
		}
	}
}
