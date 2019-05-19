package oop;

//Person

		class Person {
			String name;
			String email;
			String phone;
			
			void walk() {
				System.out.println(name + " is walking");
			}
			
			void eat(){
				System.out.println(email);
				
			}
			
			void sleep(){
				System.out.println(name + " is sleeping");
			}	
		}

public class Demo {

	public static void main(String[] args) {
		// Instantiaing an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7897894564";
		
		// Abstraction: Get information from the object only the parts that we want
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "3213216548";
		
		person2.sleep();
		
		
		/*
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		
		//Action, activity, behaviour, 
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we have another person 
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "3213216548";
		
		//Action, activity, behaviour, 
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
	}
	// Enhance by adding function to minimize code
		static void walking(String name) {
				System.out.println(name + " is walking");	
*/
		 }

}
