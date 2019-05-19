package javaExercises;
import java.util.*;
import java.util.HashSet; 
public class Exercise13CommonElementsTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
	
		String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	       
	       System.out.println("Array1 : "+Arrays.toString(array1));
	       System.out.println("Array2 : "+Arrays.toString(array2));
	       commonElements(array1, array2);
	}

	public static void commonElements(String [] word1, String[] word2) {
	
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < word1.length; i++) {
			for (int j = 0; j <= word1.length; j++) {
				if (word1[i] == word2[j]) {
					set.add(word1[i]);
				}
			}
		}
		System.out.println("Common element: " +(set));
	}
	
}
