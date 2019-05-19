package javaExercises;
import java.util.Arrays; 
public class Exercise7CopyToNewArray {

	public static void main(String[] args) {
		int [] oldArray = {2,1,20,10,2, 3, 5};		
		System.out.println("The contains of array are " + Arrays.toString(copyElements(oldArray)));
	}
	
	
	public static int [] copyElements(int[] oldArray) {
		int [] newArray = new int[10];
		for (int i = 0;  i< oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}
