package basics;

public class Cities {
// ARRAYS & LOOPS
	public static void main(String[] args) {
		//Declare and Define an array implicitly
		String[] cities = {"New York", "San francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
	
		
		// Declare an array 
		String[] countries; 
			
		// Define an array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "India";
		countries[2] = "China";
		System.out.println(countries[1]);
	
		System.out.println("\nDO WHILE *********************");
	
		// Declare & define the array(only size) explicitly
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: enters the loop THEN tests condition 
		do {
			System.out.println("State: " +states[i]);
			i = i + 1;
		} while(i < 5);
		
		// While loop: Tests condition first and then enters loop
		int n = 0;
		System.out.println("\nWHILE LOOP ###########");
		boolean stateFound = false;
		// In the while loop the condition will run till it is not true
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State Found!");
				stateFound = true;
			}
			n++;
		}
	
	// For loop: Best structure for iterating through an array
		System.out.println("\nPrinting with For Loop");
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	
	}			
}
