package javaExercises;
import java.util.Arrays;

// sort a numeric array and a string array.
public class Exercise1sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numArray = {1789, 2035, 1899, 1456, 2013, 1478, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
		
		String [] wordArray = {"Java","Python", "PHP", "C#", "C Programming", "C++" }; 
		
		System.out.println("Original numeric  array: " + Arrays.toString(numArray));
		Arrays.sort(numArray);
		System.out.println("Sorted numeric array:" + Arrays.toString(numArray));
		
		System.out.println("Original numeric  array: " + Arrays.toString(wordArray));
		Arrays.sort(wordArray);
		System.out.println("Sorted numeric array:" + Arrays.toString(wordArray));
		}
	
	
	
}
