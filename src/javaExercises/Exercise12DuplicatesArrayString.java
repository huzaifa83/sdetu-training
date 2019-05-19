package javaExercises;
import java.util.Arrays;

public class Exercise12DuplicatesArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] wordy = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		System.out.println(Arrays.toString(duplicateString(wordy)));
	}

	public static String [] duplicateString(String [] words) {
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i+1; j< words.length; j++) {
				if ((words[i].equals(words[j])) && (i!= j)) {
				System.out.println("Dupllicates are " + words[j]);
				}
			}
		}
		return words;
	}

}
